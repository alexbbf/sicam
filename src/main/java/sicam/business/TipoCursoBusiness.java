package sicam.business;

import java.util.List;

import javax.annotation.PostConstruct;
import javax.ejb.LocalBean;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import sicam.dao.TipoCursoDao;
import sicam.model.TipoCurso;

@LocalBean
@Stateless
public class TipoCursoBusiness {
	
	@PersistenceContext
	private EntityManager em;
	
	private TipoCursoDao dao;
	
	@PostConstruct
	private void init() {
		dao = new TipoCursoDao(em);
	}

	public List<TipoCurso> listar(){
		return dao.listar();
	}
}
