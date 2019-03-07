package sicam.business;

import java.util.List;

import javax.annotation.PostConstruct;
import javax.ejb.LocalBean;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import sicam.dao.TipoDependenteDao;
import sicam.model.TipoDependente;

@LocalBean
@Stateless
public class TipoDependenteBusiness {
	
	@PersistenceContext
	private EntityManager em;
	
	private TipoDependenteDao dao;
	
	@PostConstruct
	private void init() {
		dao = new TipoDependenteDao(em);

	}
	
	public List<TipoDependente> listar(){
		return dao.listar();
	}

}
