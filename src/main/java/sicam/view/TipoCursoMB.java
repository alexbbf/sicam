package sicam.view;

import java.util.List;

import javax.ejb.EJB;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

import sicam.business.TipoCursoBusiness;
import sicam.model.TipoCurso;

@ManagedBean
@ViewScoped
public class TipoCursoMB {
	
	@EJB
	private TipoCursoBusiness business;
	
	public List<TipoCurso> getTiposCurso(){
		return business.listar();
		
	}

}
