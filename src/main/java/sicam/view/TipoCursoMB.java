package sicam.view;

import java.util.List;

import javax.ejb.EJB;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

import sicam.business.TipoCursoBusiness;
import sicam.model.TipoCurso;

@ManagedBean
@SessionScoped
public class TipoCursoMB {
	
	@EJB
	private TipoCursoBusiness business;
	
	public List<TipoCurso> getTiposCurso(){
		return business.listar();
		
	}

}
