package sicam.dao;

import java.util.List;

import javax.persistence.EntityManager;

import sicam.model.Idioma;

public class IdiomaDao {
	
	private EntityManager em;
	
	public IdiomaDao(EntityManager em) {
		this.em = em;
	}
	
	public List<Idioma> listar(){
		return em.createQuery("SELECT i FROM Idioma i",Idioma.class).getResultList();
	}

}
