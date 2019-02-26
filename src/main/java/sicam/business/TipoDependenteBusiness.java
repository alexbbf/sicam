package sicam.business;

import javax.ejb.LocalBean;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

@LocalBean
@Stateless
public class TipoDependenteBusiness {
	
	@PersistenceContext
	private EntityManager em;

}
