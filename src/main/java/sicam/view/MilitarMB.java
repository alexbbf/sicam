package sicam.view;

import javax.ejb.EJB;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

import sicam.business.MilitarBusiness;
import sicam.model.Militar;

@ManagedBean
@ViewScoped
public class MilitarMB {
	
	@EJB
	private MilitarBusiness business;
	
	private Militar militar = new Militar();
	
	public void salvar(){
		militar = business.salvar(militar);
	}

	public Militar getMilitar() {
		return militar;
	}

	public void setMilitar(Militar militar) {
		this.militar = militar;
	}
	
	
	

}
