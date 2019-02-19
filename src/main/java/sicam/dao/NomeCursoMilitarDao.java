package sicam.dao;

import java.text.Normalizer;
import java.util.List;

import javax.persistence.EntityManager;

public class NomeCursoMilitarDao {
	
	private EntityManager em;
	
	public NomeCursoMilitarDao(EntityManager em) {
		this.em = em;
	}
	
	public List<String> autoCompleteNomeCursoMilitar(String s) {
		s = Normalizer.normalize(s, Normalizer.Form.NFD)
				.replaceAll("[^\\p{ASCII}]", "").toUpperCase();

		return em
				.createQuery(
						"SELECT c.descricao FROM NomeCursoMilitar c WHERE UPPER(TRANSLATE(c.descricao,'ÁÃÂÀáãâàÉÈÊéêèÍìÓóÔôÕõÚúÇç','AAAAaaaaEEEeeeIiOoOoOoUuCc')) LIKE '"
								+ s + "%'", String.class).getResultList();
	}

}
