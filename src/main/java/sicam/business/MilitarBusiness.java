package sicam.business;

import javax.annotation.PostConstruct;
import javax.ejb.LocalBean;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import sicam.dao.MilitarDao;
import sicam.model.Militar;

@LocalBean
@Stateless
public class MilitarBusiness {
	
	@PersistenceContext
	private EntityManager em;
	
	private MilitarDao dao;
	
	@PostConstruct
	private void init() {
		dao = new MilitarDao(em);
	}		
	
	public Militar salvar(Militar m){
		return dao.salvar(m);
	}

}
