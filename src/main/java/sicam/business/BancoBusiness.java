package sicam.business;

import java.util.List;

import javax.annotation.PostConstruct;
import javax.ejb.LocalBean;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import sicam.dao.BancoDao;
import sicam.model.Banco;

@LocalBean
@Stateless
public class BancoBusiness {
	
	@PersistenceContext
	private EntityManager entityManager;
	
	private BancoDao dao;
	
	@PostConstruct
	private void init() {
		dao = new BancoDao(entityManager);
	}

	public List<Banco> listar(){
		return dao.listar();
	}
}
