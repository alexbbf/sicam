package sicam.security;

import javax.enterprise.inject.Specializes;
import javax.faces.bean.ApplicationScoped;
import javax.faces.bean.ManagedBean;

import com.github.adminfaces.template.session.AdminSession;

@ManagedBean
@ApplicationScoped
@Specializes
public class Seguranca extends AdminSession {

	@Override
	public boolean isLoggedIn() {

		return true;
	}

}
