package sicam.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.NoResultException;

import sicam.dto.MilitarDTO;
import sicam.model.Militar;

public class MilitarDao {

	private EntityManager em;

	public MilitarDao(EntityManager em) {
		this.em = em;
	}

	public Militar salvar(Militar militar) {
		return em.merge(militar);
	}

	public List<MilitarDTO> pesquisarRg(String rg) {
		try {
			return em
					.createQuery(
							"SELECT new sicam.dto.MilitarDTO(m.id,m.nomeCompleto,m.postoGraduacao,m.nomeGuerra) FROM Militar m WHERE m.rg.numero = :reg",
							MilitarDTO.class).setParameter("reg", rg)
					.getResultList();
		} catch (NoResultException e) {
			return null;
		}
	}

	public List<MilitarDTO> pesquisarCpf(String cpf) {
		try {
			return em
					.createQuery(
							"SELECT new sicam.dto.MilitarDTO(m.id,m.nomeCompleto,m.postoGraduacao,m.nomeGuerra) FROM Militar m WHERE m.cpf = :reg",
							MilitarDTO.class).setParameter("reg", cpf)
					.getResultList();
		} catch (NoResultException e) {
			return null;
		}
	}

	public List<MilitarDTO> pesquisarNomeGuerra(String nome) {
		try {
			return em
					.createQuery(
							"SELECT new sicam.dto.MilitarDTO(m.id,m.nomeCompleto,m.postoGraduacao,m.nomeGuerra) FROM Militar m WHERE UPPER(TRANSLATE(m.nomeGuerra,'ÁÃÂÀáãâàÉÈÊéêèÍìÓóÔôÕõÚúÇç','AAAAaaaaEEEeeeIiOoOoOoUuCc')) = UPPER(TRANSLATE(:reg,'ÁÃÂÀáãâàÉÈÊéêèÍìÓóÔôÕõÚúÇç','AAAAaaaaEEEeeeIiOoOoOoUuCc'))",
							MilitarDTO.class)
					.setParameter("reg", nome.toUpperCase()).getResultList();
		} catch (NoResultException e) {
			return null;
		}
	}

	public List<MilitarDTO> pesquisarMatriculaE(String mat) {
		try {
			return em
					.createQuery(
							"SELECT new sicam.dto.MilitarDTO(m.id,m.nomeCompleto,m.postoGraduacao,m.nomeGuerra) FROM Militar m WHERE m.matricula = :reg",
							MilitarDTO.class).setParameter("reg", mat)
					.getResultList();
		} catch (NoResultException e) {
			return null;
		}
	}

	public List<MilitarDTO> pesquisarMatriculaF(String mat) {
		try {
			return em
					.createQuery(
							"SELECT new br.rr.gov.cbm.scam.dto.MilitarDTO(m.id,m.nomeCompleto,m.postoGraduacao,m.nomeGuerra) FROM Militar m WHERE m.siape = :reg",
							MilitarDTO.class).setParameter("reg", mat)
					.getResultList();
		} catch (NoResultException e) {
			return null;
		}
	}
}
