package sicam.business;

import java.util.List;

import javax.annotation.PostConstruct;
import javax.ejb.LocalBean;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import sicam.dao.NomeCursoMilitarDao;

@LocalBean
@Stateless
public class NomeCursoMilitarBusiness {
	
	@PersistenceContext
	private EntityManager em;
	
	private NomeCursoMilitarDao dao;
	
	@PostConstruct
	private void init() {
		dao = new NomeCursoMilitarDao(em);
	}
	
	public List<String> autoCompleteNomeCursoMilitar(String s){
		return dao.autoCompleteNomeCursoMilitar(s);
	}

}
