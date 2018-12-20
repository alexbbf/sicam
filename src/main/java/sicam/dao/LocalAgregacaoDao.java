package sicam.dao;

import java.text.Normalizer;
import java.util.List;

import javax.persistence.EntityManager;

import sicam.model.LocalAgregacao;

public class LocalAgregacaoDao {

	private EntityManager em;

	public LocalAgregacaoDao(EntityManager em) {
		this.em = em;
	}

	public List<LocalAgregacao> autoCompleteLocalAgregacao(String s) {
		s = Normalizer.normalize(s, Normalizer.Form.NFD)
				.replaceAll("[^\\p{ASCII}]", "").toUpperCase();

		return em
				.createQuery(
						"SELECT b FROM LocalAgregacao b WHERE UPPER(TRANSLATE(b.descricao,'ÁÃÂÀáãâàÉÈÊéêèÍìÓóÔôÕõÚúÇç','AAAAaaaaEEEeeeIiOoOoOoUuCc')) LIKE '"
								+ s
								+ "%' OR UPPER(TRANSLATE(b.sigla,'ÁÃÂÀáãâàÉÈÊéêèÍìÓóÔôÕõÚúÇç','AAAAaaaaEEEeeeIiOoOoOoUuCc')) LIKE '"
								+ s + "%'", LocalAgregacao.class)
				.getResultList();
	}

}
