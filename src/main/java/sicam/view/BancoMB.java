package sicam.view;

import java.util.List;

import javax.ejb.EJB;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

import sicam.business.BancoBusiness;
import sicam.model.Banco;

@ManagedBean
@SessionScoped
public class BancoMB {
	
	@EJB
	private BancoBusiness business;
	
	
	
	public List<Banco> getBancos() {
		return business.listar();
	}
	

}
