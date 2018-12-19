package sicam.business;

import java.util.List;

import javax.annotation.PostConstruct;
import javax.ejb.LocalBean;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import sicam.dao.PostoGraduacaoDao;
import sicam.model.PostoGraduacao;

@LocalBean
@Stateless
public class PostoGraduacaoBusiness {

	@PersistenceContext
	private EntityManager em;

	private PostoGraduacaoDao dao;

	@PostConstruct
	private void init() {
		dao = new PostoGraduacaoDao(em);
	}
	
	public List<PostoGraduacao> listar(){
		return dao.listar();
	}

}
