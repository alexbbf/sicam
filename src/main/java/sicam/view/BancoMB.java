package sicam.view;

import java.util.ArrayList;
import java.util.List;

import javax.ejb.EJB;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

import sicam.business.BancoBusiness;
import sicam.model.Banco;

@ManagedBean
@ViewScoped
public class BancoMB {
	
	@EJB
	private BancoBusiness business;
	
	private List<Banco> bancos = new ArrayList<Banco>();
	
	
	public List<Banco> getBancos() {
		return business.listar();
	}
	

}
