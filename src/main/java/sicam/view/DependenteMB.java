package sicam.view;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

import sicam.model.Dependente;

@ManagedBean
@ViewScoped
public class DependenteMB {
	
	private Dependente dependente = new Dependente();

	public Dependente getDependente() {
		return dependente;
	}

	public void setDependente(Dependente dependente) {
		this.dependente = dependente;
	}
	
	

}
