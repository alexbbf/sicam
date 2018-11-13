package sicam.model;

public enum Vinculo {
	ESTADUAL("Estadual"), FEDERAL("Federal");

	private String label;

	private Vinculo(String label) {
		this.label = label;
	}

	public String getLabel() {
		return label;
	}

}
