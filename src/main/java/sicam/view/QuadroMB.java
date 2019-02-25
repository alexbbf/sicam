package sicam.view;

import java.util.List;

import javax.ejb.EJB;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

import sicam.business.QuadroBusiness;
import sicam.model.Quadro;

@ManagedBean
@SessionScoped
public class QuadroMB {
	
	@EJB
	private QuadroBusiness business;
	
	public List<Quadro> getQuadros() {
		return business.listar();
	}

	
	
}
