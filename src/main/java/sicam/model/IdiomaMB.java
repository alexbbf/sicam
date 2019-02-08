package sicam.model;

import java.util.List;

import javax.ejb.EJB;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

import sicam.business.IdiomaBusiness;

@ManagedBean
@ViewScoped
public class IdiomaMB {
	
	@EJB
	private IdiomaBusiness business;
	
	public List<Idioma> getIdiomas() {
		return business.listar();

	}

}
