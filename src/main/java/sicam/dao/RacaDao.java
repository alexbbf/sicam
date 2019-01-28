package sicam.dao;

import java.util.List;

import javax.persistence.EntityManager;

import sicam.model.Raca;

public class RacaDao {
	
	private EntityManager em;
	
	public RacaDao(EntityManager em) {
		this.em = em;
	}
	
	public List<Raca> listar(){
		return em.createQuery("SELECT r FROM Raca r",Raca.class).getResultList();
	}

}
