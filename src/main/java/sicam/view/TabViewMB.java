package sicam.view;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

@ManagedBean
@ViewScoped
public class TabViewMB {
	private int activetab;

	public int getActivetab() {
		return activetab;
	}

	public void setActivetab(int activetab) {
		this.activetab = activetab;
	}

	public void nextTab(int index) {
		activetab = index;
	}
}
