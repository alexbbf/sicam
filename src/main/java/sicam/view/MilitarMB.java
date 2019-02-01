package sicam.view;

import java.util.ArrayList;
import java.util.List;

import javax.ejb.EJB;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import javax.faces.context.FacesContext;
import javax.faces.event.PhaseId;

import org.primefaces.event.FileUploadEvent;
import org.primefaces.model.DefaultStreamedContent;
import org.primefaces.model.StreamedContent;
import org.primefaces.model.UploadedFile;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;

import sicam.business.MilitarBusiness;
import sicam.dto.MilitarDTO;
import sicam.model.Anexo;
import sicam.model.ChavePesquisaMilitar;
import sicam.model.Militar;
import sicam.security.UsuarioSistema;
import sicam.util.ImageUtil;

@ManagedBean
@ViewScoped
public class MilitarMB {

	@EJB
	private MilitarBusiness business;

	private Militar militar = new Militar();

	private Militar militarLogado = new Militar();

	private List<MilitarDTO> militaresDTO = new ArrayList<MilitarDTO>();

	private MilitarDTO militarDTOSelecionado;

	private ChavePesquisaMilitar chavePesquisa;

	private String palavraPesquisa;

	private UploadedFile file;
	
	private StreamedContent fotoLogado;

	public void handleFileUpload(FileUploadEvent event) {
		Anexo foto = new Anexo();
		foto.setArquivo(event.getFile().getContents());
		militar.setFoto(foto);
	}

	public StreamedContent getFotoLogado() {
		if (FacesContext.getCurrentInstance().getCurrentPhaseId() == PhaseId.RENDER_RESPONSE) {
			System.out.println("IF");
			return new DefaultStreamedContent();
		} else {
			System.out.println("ELSE");
			fotoLogado = ImageUtil.byteParaImagem(militarLogado.getFoto()
					.getArquivo()); 
			return fotoLogado;
		}
	}
	
	public void carregaFoto(){
		getFotoLogado();
	}

	public void salvar() {
		militar = business.salvar(militar);
	}

	public void salvarMilitarLogado() {
		militar = business.salvar(militarLogado);
	}

	public void selecionarDTO() {
		try {
			if (militarDTOSelecionado.getId() != null) {
				militar = business.selecionar(militarDTOSelecionado.getId());
			}
		} catch (NullPointerException npe) {

		}
	}

	public void militarLogado() {
		UsuarioSistema usuario = null;
		try {
			UsernamePasswordAuthenticationToken auth = (UsernamePasswordAuthenticationToken) FacesContext
					.getCurrentInstance().getExternalContext()
					.getUserPrincipal();

			if (auth != null && auth.getPrincipal() != null) {
				usuario = (UsuarioSistema) auth.getPrincipal();
			}
		} catch (NullPointerException npe) {
			npe.printStackTrace();
		}
		militarLogado = usuario.getMilitar();

	}

	public void pesquisar() {
		militaresDTO = business.pesquisar(palavraPesquisa, chavePesquisa);
	}

	public Militar getMilitar() {
		return militar;
	}

	public void setMilitar(Militar militar) {
		this.militar = militar;
	}

	public ChavePesquisaMilitar getChavePesquisa() {
		return chavePesquisa;
	}

	public void setChavePesquisa(ChavePesquisaMilitar chavePesquisa) {
		this.chavePesquisa = chavePesquisa;
	}

	public String getPalavraPesquisa() {
		return palavraPesquisa;
	}

	public void setPalavraPesquisa(String palavraPesquisa) {
		this.palavraPesquisa = palavraPesquisa;
	}

	public List<MilitarDTO> getMilitaresDTO() {
		return militaresDTO;
	}

	public void setMilitaresDTO(List<MilitarDTO> militaresDTO) {
		this.militaresDTO = militaresDTO;
	}

	public MilitarDTO getMilitarDTOSelecionado() {
		return militarDTOSelecionado;
	}

	public void setMilitarDTOSelecionado(MilitarDTO militarDTOSelecionado) {
		this.militarDTOSelecionado = militarDTOSelecionado;
	}

	public UploadedFile getFile() {
		return file;
	}

	public void setFile(UploadedFile arquivo) {
		this.file = arquivo;
	}

	public Militar getMilitarLogado() {
		UsuarioSistema usuario = null;
		try {
			UsernamePasswordAuthenticationToken auth = (UsernamePasswordAuthenticationToken) FacesContext
					.getCurrentInstance().getExternalContext()
					.getUserPrincipal();

			if (auth != null && auth.getPrincipal() != null) {
				usuario = (UsuarioSistema) auth.getPrincipal();
			}
		} catch (NullPointerException npe) {
			npe.printStackTrace();
		}
		militarLogado = usuario.getMilitar();
		return militarLogado;
	}

	public void setMilitarLogado(Militar militarLogado) {
		this.militarLogado = militarLogado;
	}

}
