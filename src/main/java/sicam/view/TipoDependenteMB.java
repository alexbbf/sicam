package sicam.view;

import java.util.List;

import javax.ejb.EJB;
import javax.faces.bean.ApplicationScoped;
import javax.faces.bean.ManagedBean;

import sicam.business.TipoDependenteBusiness;
import sicam.model.TipoDependente;

@ManagedBean
@ApplicationScoped
public class TipoDependenteMB {
	
	@EJB
	private TipoDependenteBusiness business;

	
	public List<TipoDependente> getTipoDependente(){
		return business.listar();
	}
}
