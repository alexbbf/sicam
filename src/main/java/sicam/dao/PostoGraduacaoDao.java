package sicam.dao;

import java.util.List;

import javax.persistence.EntityManager;

import sicam.model.PostoGraduacao;

public class PostoGraduacaoDao {

	private EntityManager em;

	public PostoGraduacaoDao(EntityManager em) {
		this.em = em;
	}

	public List<PostoGraduacao> listar() {
		return em.createQuery("SELECT p FROM PostoGraduacao p order by p.id asc",
				PostoGraduacao.class).getResultList();
	}

}
