package sicam.model;

public enum NivelIdioma {
	
	BASICO("Básico"),INTERMEDIARIO("Intermediario"),AVANCADO("Avançado"),FLUENTE("Fluente");

	private String label;
	
	private NivelIdioma(String label) {
		this.label = label;
	}
	public String getLabel() {
		return label;
	}
}
