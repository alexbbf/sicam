package sicam.business;

import java.util.List;

import javax.annotation.PostConstruct;
import javax.ejb.LocalBean;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import sicam.dao.RacaDao;
import sicam.model.Raca;

@LocalBean
@Stateless
public class RacaBusiness {
	
	@PersistenceContext
	private EntityManager em;
	
	private RacaDao dao;
	
	@PostConstruct
	private void init() {
		dao = new RacaDao(em);
	}
	
	public List<Raca> listar(){
		return dao.listar();
	}
	
	
	

}
