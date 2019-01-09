package sicam.security;

import java.util.Collection;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.User;

import sicam.model.Militar;


public class UsuarioSistema extends User {

	
	private static final long serialVersionUID = 8279242352016800739L;
	
	private Militar militar;
	
	public UsuarioSistema(Militar militar,
			Collection<? extends GrantedAuthority> authorities) {
		super(militar.getCpf(),militar.getSenha(), authorities);
		this.militar = militar;
	}
	
	public Militar getMilitar() {
		return militar;
	}

}
