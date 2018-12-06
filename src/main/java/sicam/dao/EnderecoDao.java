package sicam.dao;

import java.text.Normalizer;
import java.util.List;

import javax.persistence.EntityManager;

import sicam.model.Bairro;
import sicam.model.Municipio;

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

	public List<Bairro> autoCompleteBairro(String s) {
		s = Normalizer.normalize(s, Normalizer.Form.NFD)
				.replaceAll("[^\\p{ASCII}]", "").toUpperCase();

		return em
				.createQuery(
						"SELECT b FROM Bairro b WHERE UPPER(TRANSLATE(b.descricao,'ÁÃÂÀáãâàÉÈÊéêèÍìÓóÔôÕõÚúÇç','AAAAaaaaEEEeeeIiOoOoOoUuCc')) LIKE '"
								+ s + "%'", Bairro.class).getResultList();
	}

	public List<Municipio> autoCompleteMunicipioRR(String s) {
		s = Normalizer.normalize(s, Normalizer.Form.NFD)
				.replaceAll("[^\\p{ASCII}]", "").toUpperCase();

		return em
				.createQuery(
						"SELECT m FROM Municipio m WHERE UPPER(TRANSLATE(m.descricao,'ÁÃÂÀáãâàÉÈÊéêèÍìÓóÔôÕõÚúÇç','AAAAaaaaEEEeeeIiOoOoOoUuCc')) LIKE '"
								+ s + "%' AND m.estado = 4", Municipio.class).getResultList();
	}

}
