package sicam.util;

import javax.faces.context.FacesContext;

import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;

import sicam.model.Militar;
import sicam.security.UsuarioSistema;

public class UsuarioLogadoUtil {
	
	public static Militar getUsuarioLogado() {
		UsuarioSistema usuario = null;
		try {
			UsernamePasswordAuthenticationToken auth = (UsernamePasswordAuthenticationToken) FacesContext
					.getCurrentInstance().getExternalContext()
					.getUserPrincipal();

			if (auth != null && auth.getPrincipal() != null) {
				usuario = (UsuarioSistema) auth.getPrincipal();
			}
		} catch (NullPointerException npe) {
			npe.printStackTrace();
			return null;
		}
		return usuario.getMilitar();
	}

}
