package sicam.dao;

import javax.persistence.EntityManager;

import sicam.model.Militar;

public class MilitarDao {

	private EntityManager em;
	
	public MilitarDao(EntityManager em){
		this.em = em;
	}
	
	public Militar salvar(Militar militar){
		return em.merge(militar);
	}
}
