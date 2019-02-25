package sicam.view;

import java.util.List;

import javax.ejb.EJB;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

import sicam.business.NomeCursoMilitarBusiness;

@ManagedBean
@SessionScoped
public class NomeCursoMilitarMB {
	
	@EJB
	private NomeCursoMilitarBusiness business;
	
	public List<String> autoCompleteNomeCursoMilitar(String s){
		return business.autoCompleteNomeCursoMilitar(s);
	}

}
