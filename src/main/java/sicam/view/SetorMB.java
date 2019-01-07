package sicam.view;

import java.util.List;

import javax.ejb.EJB;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

import sicam.business.SetorBusiness;
import sicam.model.Setor;

@ManagedBean
@ViewScoped
public class SetorMB {
	
	@EJB
	private SetorBusiness business;
	
	private List<Setor> setores;

	public List<Setor> getSetores() {
		return business.listar();
	}

	public void setSetores(List<Setor> setores) {
		this.setores = setores;
	}
	
	

}
