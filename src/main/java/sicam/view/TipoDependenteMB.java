package sicam.view;

import javax.ejb.EJB;
import javax.faces.bean.ApplicationScoped;
import javax.faces.bean.ManagedBean;

import sicam.business.TipoDependenteBusiness;

@ManagedBean
@ApplicationScoped
public class TipoDependenteMB {
	
	@EJB
	private TipoDependenteBusiness business;

}
