package sicam.view;

import java.util.List;

import javax.ejb.EJB;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

import sicam.business.EscolaridadeBusiness;
import sicam.model.Escolaridade;

@ManagedBean
@SessionScoped
public class EscolaridadeMB {
	
	@EJB
	private EscolaridadeBusiness business;
	

	public List<Escolaridade> getEscolaridades() {
		return business.listar();
	}

	
}
