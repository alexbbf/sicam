package sicam.view;

import java.util.List;

import javax.ejb.EJB;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

import sicam.business.ModalidadeCursoBusiness;
import sicam.model.ModalidadeCurso;

@ManagedBean
@ViewScoped
public class ModalidadeCursoMB {
	
	@EJB
	private ModalidadeCursoBusiness business;
	
	public List<ModalidadeCurso> getModalidades(){
		return business.listar();
	}
	

}
