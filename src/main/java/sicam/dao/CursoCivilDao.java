package sicam.dao;

import java.text.Normalizer;
import java.util.List;

import javax.persistence.EntityManager;

public class CursoCivilDao {
	
	private EntityManager em;
	
	public CursoCivilDao(EntityManager em) {
		this.em = em;
	}
	
	public List<String> autoCompleteNomeCursoCivil(String s) {
		s = Normalizer.normalize(s, Normalizer.Form.NFD)
				.replaceAll("[^\\p{ASCII}]", "").toUpperCase();

		return em
				.createQuery(
						"SELECT c.nome FROM CursoCivil c WHERE UPPER(TRANSLATE(c.nome,'ÁÃÂÀáãâàÉÈÊéêèÍìÓóÔôÕõÚúÇç','AAAAaaaaEEEeeeIiOoOoOoUuCc')) LIKE '"
								+ s + "%'", String.class).getResultList();
	}
	
	public List<String> autoCompleteInstituicaoCursoCivil(String s) {
		s = Normalizer.normalize(s, Normalizer.Form.NFD)
				.replaceAll("[^\\p{ASCII}]", "").toUpperCase();

		return em
				.createQuery(
						"SELECT c.instituicao FROM CursoCivil c WHERE UPPER(TRANSLATE(c.instituicao,'ÁÃÂÀáãâàÉÈÊéêèÍìÓóÔôÕõÚúÇç','AAAAaaaaEEEeeeIiOoOoOoUuCc')) LIKE '"
								+ s + "%'", String.class).getResultList();
	}

}
