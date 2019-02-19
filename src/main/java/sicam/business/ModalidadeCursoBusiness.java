package sicam.business;

import java.util.List;

import javax.annotation.PostConstruct;
import javax.ejb.LocalBean;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import sicam.dao.ModalidadeCursoDao;
import sicam.model.ModalidadeCurso;

@LocalBean
@Stateless
public class ModalidadeCursoBusiness {
	
	@PersistenceContext
	private EntityManager em;
	
	private ModalidadeCursoDao dao;
	
	@PostConstruct
	private void init() {
		dao = new ModalidadeCursoDao(em);
	}
	
	public List<ModalidadeCurso> listar(){
		return dao.listar();
	}
	

}
