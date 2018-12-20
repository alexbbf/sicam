package sicam.business;

import java.util.List;

import javax.annotation.PostConstruct;
import javax.ejb.LocalBean;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import sicam.dao.LocalAgregacaoDao;
import sicam.model.LocalAgregacao;

@LocalBean
@Stateless
public class LocalAgregacaoBusiness {
		
	@PersistenceContext
	private EntityManager em;
	
	private LocalAgregacaoDao dao;
	
	@PostConstruct
	private void init() {
		dao = new LocalAgregacaoDao(em);

	}
	
	public List<LocalAgregacao> autoCompleteLocalAgregacao(String s) {
		return dao.autoCompleteLocalAgregacao(s);
	}
}
