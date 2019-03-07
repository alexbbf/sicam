package sicam.dao;

import java.util.List;

import javax.persistence.EntityManager;

import sicam.model.TipoDependente;

public class TipoDependenteDao {
	
	private EntityManager em;
	
	public TipoDependenteDao(EntityManager em) {
		this.em = em;
	}
	
	public List<TipoDependente> listar(){
		return em.createQuery("SELECT t FROM TipoDependente t", TipoDependente.class).getResultList();
	}

}
