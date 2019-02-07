package sicam.model;

import javax.persistence.Entity;

import org.hibernate.envers.DefaultRevisionEntity;
import org.hibernate.envers.RevisionEntity;

@Entity
@RevisionEntity(AuditListener.class)
public class AuditEntity extends DefaultRevisionEntity {

	private static final long serialVersionUID = 1L;

	private Integer usuarioId;

	private String usuarioNome;

	public Integer getUsuarioId() {
		return usuarioId;
	}

	public void setUsuarioId(Integer usuarioId) {
		this.usuarioId = usuarioId;
	}

	public String getUsuarioNome() {
		return usuarioNome;
	}

	public void setUsuarioNome(String usuarioNome) {
		this.usuarioNome = usuarioNome;
	}



}
