package sicam.dao;

import java.util.List;

import javax.persistence.EntityManager;

import sicam.model.Escolaridade;

public class EscolaridadeDao {

	private EntityManager em;

	public EscolaridadeDao(EntityManager em) {
		this.em = em;
	}

	public List<Escolaridade> listar() {
		return em.createQuery("SELECT e FROM Escolaridade e order by e.id asc",
				Escolaridade.class).getResultList();
	}

}
