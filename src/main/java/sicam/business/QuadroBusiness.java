package sicam.business;

import java.util.List;

import javax.annotation.PostConstruct;
import javax.ejb.LocalBean;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import sicam.dao.QuadroDao;
import sicam.model.Quadro;

@LocalBean
@Stateless
public class QuadroBusiness {
	
	@PersistenceContext
	private EntityManager entityManager;
	
	private QuadroDao dao;
	
	@PostConstruct
	private void init() {
		dao = new QuadroDao(entityManager);
	}
	
	public List<Quadro> listar(){
		return dao.listar();
	}

}
