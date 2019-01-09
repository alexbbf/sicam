package sicam.view;

import java.util.ArrayList;
import java.util.List;

import javax.ejb.EJB;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

import sicam.business.MilitarBusiness;
import sicam.dto.MilitarDTO;
import sicam.model.ChavePesquisaMilitar;
import sicam.model.Militar;

@ManagedBean
@ViewScoped
public class MilitarMB {
	
	@EJB
	private MilitarBusiness business;
	
	private Militar militar = new Militar();
	
	private List<MilitarDTO> militaresDTO = new ArrayList<MilitarDTO>();
	
	private MilitarDTO militarDTOSelecionado;
	
	private ChavePesquisaMilitar chavePesquisa;
	
	private String palavraPesquisa;
	
	public void salvar(){
		militar = business.salvar(militar);
	}
	
	public void selecionarDTO(){
		try{
			if (militarDTOSelecionado.getId() != null){
				militar = business.selecionar(militarDTOSelecionado.getId());
			} 
		} catch (NullPointerException npe) {
			
		}
	}
	
	public void pesquisar(){
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
	
	
	
	
	
	
	
	
	
	

}
