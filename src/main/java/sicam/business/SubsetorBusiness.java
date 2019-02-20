package sicam.business;

import java.util.List;

import javax.annotation.PostConstruct;
import javax.ejb.LocalBean;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import sicam.dao.SubSetorDao;
import sicam.model.SubSetor;

@LocalBean
@Stateless
public class SubsetorBusiness {
	
	@PersistenceContext
	private EntityManager em;
	
	private SubSetorDao dao;
	
	@PostConstruct
	private void init() {
		dao = new SubSetorDao(em);
	}
	
	public List<SubSetor> listar(){
		return dao.listar();
	}

}
