package sicam.view;

import java.util.List;

import javax.ejb.EJB;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

import sicam.business.EscolaridadeBusiness;
import sicam.model.Escolaridade;

@ManagedBean
@ViewScoped
public class EscolaridadeMB {
	
	@EJB
	private EscolaridadeBusiness business;
	
	private List<Escolaridade> escolaridades;

	public List<Escolaridade> getEscolaridades() {
		return business.listar();
	}

	public void setEscolaridades(List<Escolaridade> escolaridades) {
		this.escolaridades = escolaridades;
	}
	
	

}
