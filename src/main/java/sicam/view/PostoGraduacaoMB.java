package sicam.view;

import java.util.List;

import javax.ejb.EJB;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

import sicam.business.PostoGraduacaoBusiness;
import sicam.model.PostoGraduacao;

@ManagedBean
@SessionScoped
public class PostoGraduacaoMB {
	
	@EJB
	private PostoGraduacaoBusiness business;
	

	public List<PostoGraduacao> getPostosGraduacoes() {
		return business.listar();
	}

	
	

}
