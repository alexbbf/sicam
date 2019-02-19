package sicam.dao;

import java.util.List;

import javax.persistence.EntityManager;

import sicam.model.SituacaoCurso;

public class SituacaoCursoDao {
	
	private EntityManager em;
	
	public SituacaoCursoDao(EntityManager em) {
		this.em = em;
	}
	
	public List<SituacaoCurso> listar(){
		return em.createQuery("SELECT s FROM SituacaoCurso s",SituacaoCurso.class).getResultList();
	}

}
