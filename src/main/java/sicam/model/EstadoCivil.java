package sicam.model;

public enum EstadoCivil {
	SOLTEIRO("Solteiro(a)"), CASADO("Casado(a)"), VIUVO("Viúvo(a)"), DIVORCIADO(
			"Divorciado(a)"), UNIAO_ESTAVEL("União estável");

	private String label;

	private EstadoCivil(String label) {
		this.label = label;
	}

	public String getLabel() {
		return label;
	}

}
