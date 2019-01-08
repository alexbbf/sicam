package sicam.business;

import java.util.List;

import javax.annotation.PostConstruct;
import javax.ejb.LocalBean;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import sicam.dao.MilitarDao;
import sicam.dto.MilitarDTO;
import sicam.model.ChavePesquisaMilitar;
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
	
	public List<MilitarDTO> pesquisar(String palavraPesquisa, ChavePesquisaMilitar chavePesquisa) {
		
		if (chavePesquisa.equals(ChavePesquisaMilitar.CPF)) {
			return dao.pesquisarCpf(palavraPesquisa);
		} else if (chavePesquisa.equals(ChavePesquisaMilitar.RG)) {
			return dao.pesquisarRg(palavraPesquisa);
		} else if (chavePesquisa.equals(ChavePesquisaMilitar.NOME_GUERRA)) {
			return dao.pesquisarNomeGuerra(palavraPesquisa);
		} else if (chavePesquisa.equals(ChavePesquisaMilitar.MATRICULA_E)) {
			return dao.pesquisarMatriculaE(palavraPesquisa);
		} else if (chavePesquisa.equals(ChavePesquisaMilitar.MATRICULA_F)) {
			return dao.pesquisarMatriculaF(palavraPesquisa);
		} else {
			return null;
		}
	}

}
