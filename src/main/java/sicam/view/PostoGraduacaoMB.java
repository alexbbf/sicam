package sicam.view;

import java.util.ArrayList;
import java.util.List;

import javax.ejb.EJB;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

import sicam.business.PostoGraduacaoBusiness;
import sicam.model.PostoGraduacao;

@ManagedBean
@ViewScoped
public class PostoGraduacaoMB {
	
	@EJB
	private PostoGraduacaoBusiness business;
	
	private List<PostoGraduacao> postosGraduacoes = new ArrayList<PostoGraduacao>();

	public List<PostoGraduacao> getPostosGraduacoes() {
		return business.listar();
	}

	public void setPostosGraduacoes(List<PostoGraduacao> postosGraduacoes) {
		this.postosGraduacoes = postosGraduacoes;
	}
	
	
	

}
