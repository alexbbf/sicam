package sicam.view;

import java.util.ArrayList;
import java.util.List;

import javax.ejb.EJB;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

import sicam.business.QuadroBusiness;
import sicam.model.Quadro;

@ManagedBean
@ViewScoped
public class QuadroMB {
	
	@EJB
	private QuadroBusiness business;
	
	private List<Quadro> quadros = new ArrayList<Quadro>();

	public List<Quadro> getQuadros() {
		return business.listar();
	}

	public void setQuadros(List<Quadro> quadros) {
		this.quadros = quadros;
	}
	
	
	
	
}
