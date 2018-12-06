package sicam.business;

import java.util.List;

import javax.annotation.PostConstruct;
import javax.ejb.LocalBean;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import sicam.dao.EnderecoDao;
import sicam.model.Bairro;

@LocalBean
@Stateless
public class EnderecoBusiness {

	@PersistenceContext
	private EntityManager em;

	private EnderecoDao dao;
	
	@PostConstruct
	private void init() {
		dao = new EnderecoDao(em);
	}	
	
	public List<String> autoCompleteLogradouro(String s){
		return dao.autoCompleteLogradouro(s);
	}

	public List<Bairro> autoCompleteBairro(String s) {
		return dao.autoCompleteBairro(s);
	}
}
