package sicam.dao;

import java.text.Normalizer;
import java.util.List;

import javax.persistence.EntityManager;

public class EnderecoDao {

	private EntityManager em;

	public EnderecoDao(EntityManager em) {
		this.em = em;
	}

	public List<String> autoCompleteLogradouro(String s) {
		s = Normalizer.normalize(s, Normalizer.Form.NFD)
				.replaceAll("[^\\p{ASCII}]", "").toUpperCase();

		return em
				.createQuery(
						"SELECT c.logradouro FROM Endereco c WHERE UPPER(TRANSLATE(c.logradouro,'ÁÃÂÀáãâàÉÈÊéêèÍìÓóÔôÕõÚúÇç','AAAAaaaaEEEeeeIiOoOoOoUuCc')) LIKE '"
								+ s + "%'", String.class).getResultList();
	}

}
