package sicam.view;

import java.util.List;

import javax.ejb.EJB;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

import sicam.business.EnderecoBusiness;
import sicam.model.Bairro;
import sicam.model.Municipio;

@ManagedBean
@SessionScoped
public class AutoCompleteMB {
	
	@EJB
	private EnderecoBusiness enderecoBusiness;
	
	
	
	public List<String> autoCompleteLograoduro(String s){
		return enderecoBusiness.autoCompleteLogradouro(s);
	}
	
	public List<Bairro> autoCompleteBairro(String s){
		return enderecoBusiness.autoCompleteBairro(s);
	}
	
	public List<Municipio> autoCompleteMunicipioRR(String s){
		return enderecoBusiness.autoCompleteMunicipioRR(s);
	}

}
