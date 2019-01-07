package sicam.business;

import java.util.List;

import javax.annotation.PostConstruct;
import javax.ejb.LocalBean;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import sicam.dao.SetorDao;
import sicam.model.Setor;

@LocalBean
@Stateless
public class SetorBusiness {
	
	@PersistenceContext
	private EntityManager em;
	
	private SetorDao dao;
	
	@PostConstruct
	private void init() {
		dao = new SetorDao(em);
	}
	
	public List<Setor> listar(){
		return dao.listar();
	}
}
