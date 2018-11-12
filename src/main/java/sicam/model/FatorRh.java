package sicam.model;

public enum FatorRh {
	POSITIVO("+"), NEGATIVO("-");

	private String label;

	private FatorRh(String label) {
		this.label = label;
	}

	public String getLabel() {
		return label;
	}
}
