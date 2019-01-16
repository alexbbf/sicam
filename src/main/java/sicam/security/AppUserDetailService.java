package sicam.security;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import javax.ejb.EJB;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;

import sicam.business.MilitarBusiness;
import sicam.model.Militar;
import sicam.model.Permissao;

public class AppUserDetailService implements UserDetailsService {
	
	
	@EJB(mappedName = "java:global/sicam/MilitarBusiness")
	private MilitarBusiness business;
	
	
	@Override
	public UserDetails loadUserByUsername(String cpf)
			throws UsernameNotFoundException {
		Militar militar = business.selecionaPorCpf(cpf);
		UsuarioSistema user = null;
		
		if (militar != null) {
			user = new UsuarioSistema(militar, getGrupos(militar));
			
		}
		
		return user;
	}

	private Collection<? extends GrantedAuthority> getGrupos(Militar militar) {
		List<SimpleGrantedAuthority> grupos = new ArrayList<SimpleGrantedAuthority>();
		for(Permissao perm : militar.getPermissoes()){
			grupos.add( new SimpleGrantedAuthority(perm.getGrupo().name()));
		}
			
			
		return grupos;
	}
	

}
