package sicam.security;

import javax.enterprise.inject.Specializes;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.faces.context.FacesContext;

import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;

import com.github.adminfaces.template.session.AdminSession;

@ManagedBean
@SessionScoped
@Specializes
public class Seguranca extends AdminSession {

	private static final long serialVersionUID = -6467516579153162374L;

	public String getNomeUsuario() {
		String nome = null;

		UsuarioSistema usuarioLogado = getUsuarioLogado();

		if (usuarioLogado != null) {
			nome = usuarioLogado.getMilitar().getPostoGraduacao()
					.getDescricao()
					+ " " + usuarioLogado.getMilitar().getNomeGuerra();
		}

		return nome;
	}

	private UsuarioSistema getUsuarioLogado() {
		UsuarioSistema usuario = null;

		UsernamePasswordAuthenticationToken auth = (UsernamePasswordAuthenticationToken) FacesContext
				.getCurrentInstance().getExternalContext().getUserPrincipal();

		if (auth != null && auth.getPrincipal() != null) {
			usuario = (UsuarioSistema) auth.getPrincipal();
		}

		return usuario;
	}

	@Override
	public boolean isLoggedIn() {

		return true;
//		return (getNomeUsuario() != null);
	}

}
