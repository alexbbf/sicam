package sicam.view;

import javax.faces.bean.ApplicationScoped;
import javax.faces.bean.ManagedBean;

import sicam.model.CategoriaCNH;
import sicam.model.EstadoCivil;
import sicam.model.FatorRh;
import sicam.model.Raca;
import sicam.model.Sexo;
import sicam.model.TipoSanguineo;
import sicam.model.Vinculo;

@ManagedBean
@ApplicationScoped
public class AplicacaoMB {
	
	private Vinculo federal = Vinculo.FEDERAL;
	
	private Sexo[] sexos = Sexo.values();
	private Raca[] racas = Raca.values();
	private TipoSanguineo[] tiposSanguineos = TipoSanguineo.values();
	private FatorRh[] fatoresRH = FatorRh.values();
	private CategoriaCNH[] categoriasCNH = CategoriaCNH.values();
	private EstadoCivil[] estadosCivis = EstadoCivil.values();
	private Vinculo[] vinculos = Vinculo.values();

	public Sexo[] getSexos() {
		return sexos;
	}
	
	public Raca[] getRacas() {
		return racas;
	}
	
	public FatorRh[] getFatoresRH() {
		return fatoresRH;
	}
	
	public TipoSanguineo[] getTiposSanguineos() {
		return tiposSanguineos;
	}
	
	public CategoriaCNH[] getCategoriasCNH() {
		return categoriasCNH;
	}
	
	public EstadoCivil[] getEstadosCivis() {
		return estadosCivis;
	}
	
	public Vinculo[] getVinculos() {
		return vinculos;
	}
	
	public Vinculo getFederal() {
		return federal;
	}
	

}
