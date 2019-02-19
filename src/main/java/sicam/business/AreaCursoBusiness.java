package sicam.business;

import java.util.List;

import javax.annotation.PostConstruct;
import javax.ejb.LocalBean;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import sicam.dao.AreaCursoDao;
import sicam.model.AreaCurso;

@LocalBean
@Stateless
public class AreaCursoBusiness {

	@PersistenceContext
	private EntityManager em;
	
	private AreaCursoDao dao;
	
	@PostConstruct
	private void init() {
		dao = new AreaCursoDao(em);
	}
	
	public List<AreaCurso> listar() {
		return dao.listar();
	}
}
