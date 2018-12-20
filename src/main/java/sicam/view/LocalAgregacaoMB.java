package sicam.view;

import java.util.List;

import javax.ejb.EJB;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

import sicam.business.LocalAgregacaoBusiness;
import sicam.model.LocalAgregacao;

@ManagedBean
@ViewScoped
public class LocalAgregacaoMB {
	
	@EJB
	private LocalAgregacaoBusiness business;
	
	
	public List<LocalAgregacao> autoCompleteLocalAgregacao(String s) {
		return business.autoCompleteLocalAgregacao(s);
	}

}
