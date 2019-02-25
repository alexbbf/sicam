package sicam.view;

import java.util.List;

import javax.ejb.EJB;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

import sicam.business.AreaCursoBusiness;
import sicam.model.AreaCurso;

@ManagedBean
@SessionScoped
public class AreaCursoMB {
	
	@EJB
	private AreaCursoBusiness business;
	
	public List<AreaCurso>getAreasCurso(){
		return business.listar();
	}

}
