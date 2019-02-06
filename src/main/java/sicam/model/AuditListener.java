package sicam.model;

import org.hibernate.envers.RevisionListener;

import sicam.util.UsuarioLogadoUtil;

public class AuditListener implements RevisionListener {

	@Override
	public void newRevision(Object revisionEntity) {
		AuditEntity revEntity = (AuditEntity) revisionEntity;
		revEntity.setUsuarioId(UsuarioLogadoUtil.getUsuarioLogado().getId());
		revEntity.setUsuarioNome(UsuarioLogadoUtil.getUsuarioLogado().getNome());
		
	}

}
