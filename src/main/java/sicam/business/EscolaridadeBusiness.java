package sicam.business;

import java.util.List;

import javax.annotation.PostConstruct;
import javax.ejb.LocalBean;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import sicam.dao.EscolaridadeDao;
import sicam.model.Escolaridade;

@LocalBean
@Stateless
public class EscolaridadeBusiness {
	
	@PersistenceContext
	private EntityManager em;
	
	private EscolaridadeDao dao;
	
	@PostConstruct
	private void init() {
		dao = new EscolaridadeDao(em);
	}
	
	public List<Escolaridade> listar() {
		return dao.listar();
	}
	
	

}
