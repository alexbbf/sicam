package sicam.dao;

import java.util.List;

import javax.persistence.EntityManager;

import sicam.model.SubSetor;

public class SubSetorDao {
	
	private EntityManager em;
	
	public SubSetorDao(EntityManager em) {
		this.em = em;
	}
	
	public List<SubSetor> listar(){
		return em.createQuery("SELECT s FROM SubSetor s",SubSetor.class).getResultList();
	}

}
