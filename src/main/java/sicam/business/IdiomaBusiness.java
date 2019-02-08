package sicam.business;

import java.util.List;

import javax.annotation.PostConstruct;
import javax.ejb.LocalBean;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import sicam.dao.IdiomaDao;
import sicam.model.Idioma;

@LocalBean
@Stateless
public class IdiomaBusiness {

	@PersistenceContext
	private EntityManager em;
	
	private IdiomaDao dao;
	
	@PostConstruct
	private void init() {
		dao = new IdiomaDao(em);
	}
	
	public List<Idioma> listar(){
		return dao.listar();
	}
}
