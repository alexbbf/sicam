package sicam.view;

import java.util.List;

import javax.ejb.EJB;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

import sicam.business.CursoMilitarBusiness;
import sicam.model.CursoMilitar;

@ManagedBean
@ViewScoped
public class CursoMilitarMB {
	
	@EJB
	private CursoMilitarBusiness business;
	
	private CursoMilitar curso = new CursoMilitar();
	
	public CursoMilitar pegaCurso(){
		CursoMilitar c = curso;
		curso = new CursoMilitar();
		return c;
	}
	
	public List<String> autoCompleteInstituicaoCursoMilitar(String s) {
		return business.autoCompleteInstituicaoCursoMilitar(s);
	}
	

	public CursoMilitar getCurso() {
		return curso;
	}

	public void setCurso(CursoMilitar curso) {
		this.curso = curso;
	}
	
	
	

}
