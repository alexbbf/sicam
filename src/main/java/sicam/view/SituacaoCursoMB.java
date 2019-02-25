package sicam.view;

import java.util.List;

import javax.ejb.EJB;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

import sicam.business.SituacaoCursoBusiness;
import sicam.model.SituacaoCurso;

@ManagedBean
@SessionScoped
public class SituacaoCursoMB {
	
	@EJB
	private SituacaoCursoBusiness business;
	
	public List<SituacaoCurso> getSituacoesCurso(){
		return business.listar();
	}

}
