package sicam.business;

import java.util.List;

import javax.annotation.PostConstruct;
import javax.ejb.LocalBean;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import sicam.dao.CursoCivilDao;

@LocalBean
@Stateless
public class CursoCivilBusiness {
	
	@PersistenceContext
	private EntityManager em;
	
	private CursoCivilDao dao;
	
	@PostConstruct
	private void init() {
		dao = new CursoCivilDao(em);
	}
	
	public List<String> autoCompleteNomeCursoCivil(String s) {
		return dao.autoCompleteNomeCursoCivil(s);
	}
	
	public List<String> autoCompleteInstituicaoCursoCivil(String s) {
		return dao.autoCompleteInstituicaoCursoCivil(s);
	}

}
