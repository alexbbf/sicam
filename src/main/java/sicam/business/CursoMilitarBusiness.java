package sicam.business;

import java.util.List;

import javax.annotation.PostConstruct;
import javax.ejb.LocalBean;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import sicam.dao.CursoMilitarDao;

@LocalBean
@Stateless
public class CursoMilitarBusiness {

	@PersistenceContext
	private EntityManager em;

	private CursoMilitarDao dao;

	@PostConstruct
	private void init() {
		dao = new CursoMilitarDao(em);
	}
	
	public List<String> autoCompleteInstituicaoCursoMilitar(String s) {
		return dao.autoCompleteInstituicaoCursoMilitar(s);
	}

}
