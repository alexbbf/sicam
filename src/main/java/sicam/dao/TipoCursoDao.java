package sicam.dao;

import java.util.List;

import javax.persistence.EntityManager;

import sicam.model.TipoCurso;

public class TipoCursoDao {
	
	private EntityManager em;
	
	public TipoCursoDao(EntityManager em) {
		this.em = em;
	}
	
	public List<TipoCurso> listar(){
		return em.createQuery("SELECT t FROM TipoCurso t",TipoCurso.class).getResultList();
	}
}
