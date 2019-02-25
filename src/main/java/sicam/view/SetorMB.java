package sicam.view;

import java.util.List;

import javax.ejb.EJB;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

import sicam.business.SetorBusiness;
import sicam.model.Setor;

@ManagedBean
@SessionScoped
public class SetorMB {
	
	@EJB
	private SetorBusiness business;
	
	public List<Setor> getSetores() {
		return business.listar();
	}
	
	

}
