package sicam.dao;

import java.util.List;

import javax.persistence.EntityManager;

import sicam.model.ModalidadeCurso;

public class ModalidadeCursoDao {
	
	private EntityManager em;

	public ModalidadeCursoDao(EntityManager em) {
		this.em = em;
	}
	
	public List<ModalidadeCurso> listar(){
		return em.createQuery("select a from ModalidadeCurso a",ModalidadeCurso.class).getResultList();
	}
	
	

}
