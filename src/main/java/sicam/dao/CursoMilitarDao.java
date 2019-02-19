package sicam.dao;

import java.text.Normalizer;
import java.util.List;

import javax.persistence.EntityManager;

public class CursoMilitarDao {
	
	private EntityManager em;
	
	public CursoMilitarDao(EntityManager em) {
		this.em = em;
	}
	
	public List<String> autoCompleteInstituicaoCursoMilitar(String s) {
		s = Normalizer.normalize(s, Normalizer.Form.NFD)
				.replaceAll("[^\\p{ASCII}]", "").toUpperCase();

		return em
				.createQuery(
						"SELECT c.instituicao FROM CursoMilitar c WHERE UPPER(TRANSLATE(c.instituicao,'ÁÃÂÀáãâàÉÈÊéêèÍìÓóÔôÕõÚúÇç','AAAAaaaaEEEeeeIiOoOoOoUuCc')) LIKE '"
								+ s + "%'", String.class).getResultList();
	}

}
