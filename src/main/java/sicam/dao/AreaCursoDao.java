package sicam.dao;

import java.util.List;

import javax.persistence.EntityManager;

import sicam.model.AreaCurso;

public class AreaCursoDao {
	
	private EntityManager em;
	
	public AreaCursoDao(EntityManager em) {
		this.em = em;
	}
	
	public List<AreaCurso> listar() {
		return em.createQuery("SELECT a FROM AreaCurso a",
				AreaCurso.class).getResultList();
	}

}
