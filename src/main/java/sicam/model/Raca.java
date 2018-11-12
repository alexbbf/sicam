package sicam.model;

public enum Raca {
	PARDA("Parda"), PRETA("Preta"), BRANCA("Branca"), AMARELO("Amarelo"), INDIGENA(
			"Indígena");

	private String label;

	private Raca(String label) {
		this.label = label;
	}

	public String getLabel() {
		return label;
	}
}
