package sicam.view;

import java.util.List;

import javax.ejb.EJB;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

import sicam.business.CursoCivilBusiness;
import sicam.model.CursoCivil;

@ManagedBean
@ViewScoped
public class CursoCivilMB {
	
	@EJB
	private CursoCivilBusiness business;
	
	private CursoCivil curso = new CursoCivil();

	public CursoCivil getCurso() {
		return curso;
	}
	
	public CursoCivil pegaCurso(){
		CursoCivil c = curso;
		curso = new CursoCivil();
		return c;
	}

	public void setCurso(CursoCivil curso) {
		this.curso = curso;
	}
	
	public List<String> autoCompleteNomeCursoCivil(String s) {
		return business.autoCompleteNomeCursoCivil(s);
	}
	
	public List<String> autoCompleteInstituicaoCursoCivil(String s) {
		return business.autoCompleteInstituicaoCursoCivil(s);
	}
	
	
	

}
