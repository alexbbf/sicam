package sicam.dao;

import java.util.List;

import javax.persistence.EntityManager;

import sicam.model.Banco;

public class BancoDao {

	private EntityManager em;

	public BancoDao(EntityManager entityManager) {
		em = entityManager;
	}

	public List<Banco> listar() {
		return em.createQuery("SELECT b FROM Banco b", Banco.class)
				.getResultList();
	}

}
