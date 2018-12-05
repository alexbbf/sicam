package sicam.view;

import java.util.List;

import javax.ejb.EJB;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

import sicam.business.EnderecoBusiness;

@ManagedBean
@ViewScoped
public class AutoCompleteMB {
	
	@EJB
	private EnderecoBusiness enderecoBusiness;
	
	public List<String> autoCompleteLograoduro(String s){
		return enderecoBusiness.autoCompleteLogradouro(s);
	}

}
