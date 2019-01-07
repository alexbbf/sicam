package sicam.dao;

import java.util.List;

import javax.persistence.EntityManager;

import sicam.model.Setor;

public class SetorDao {
	
	private EntityManager em;
	
	public SetorDao(EntityManager em) {
		this.em = em;
	}
	
	public List<Setor> listar (){
		return em.createQuery("SELECT s FROM Setor s ORDER BY s.sigla ASC", Setor.class)
				.getResultList();
	}

}
