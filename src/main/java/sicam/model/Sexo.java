package sicam.model;

public enum Sexo {

	M("Masculino"), F("Feminino");

	private String label;

	private Sexo(String label) {
		this.label = label;
	}

	public String getLabel() {
		return label;
	}

}
