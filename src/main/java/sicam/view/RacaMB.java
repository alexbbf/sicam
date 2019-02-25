package sicam.view;

import java.util.List;

import javax.ejb.EJB;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

import sicam.business.RacaBusiness;
import sicam.model.Raca;

@ManagedBean
@SessionScoped
public class RacaMB {

	@EJB
	private RacaBusiness business;

	public List<Raca> getRacas() {
		return business.listar();
	}
}
