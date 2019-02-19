package sicam.view;

import java.util.List;

import javax.ejb.EJB;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

import sicam.business.SituacaoCursoBusiness;
import sicam.model.SituacaoCurso;

@ManagedBean
@ViewScoped
public class SituacaoCursoMB {
	
	@EJB
	private SituacaoCursoBusiness business;
	
	public List<SituacaoCurso> getSituacoesCurso(){
		return business.listar();
	}

}
