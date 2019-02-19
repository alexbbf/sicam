package sicam.business;

import java.util.List;

import javax.annotation.PostConstruct;
import javax.ejb.LocalBean;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import sicam.dao.SituacaoCursoDao;
import sicam.model.SituacaoCurso;

@LocalBean
@Stateless
public class SituacaoCursoBusiness {
	
	@PersistenceContext
	private EntityManager em;
	
	private SituacaoCursoDao dao;
	
	@PostConstruct
	private void init() {
		dao = new SituacaoCursoDao(em);
	}
	
	public List<SituacaoCurso> listar(){
		return dao.listar();
	}

}
