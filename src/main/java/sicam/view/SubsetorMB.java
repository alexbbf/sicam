package sicam.view;

import javax.ejb.EJB;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

import sicam.business.SubsetorBusiness;

@ManagedBean
@ViewScoped
public class SubsetorMB {
	
	@EJB
	private SubsetorBusiness business;

}
