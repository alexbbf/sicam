package sicam.model;

public enum ChavePesquisaMilitar {

	NOME_GUERRA("Nome de Guerra"), CPF("CPF"), MATRICULA_E("Matrícula (E)"), MATRICULA_F(
			"Matricula(F)"), RG("RG");

	private String label;

	private ChavePesquisaMilitar(String label) {
		this.label = label;
	}

	public String getLabel() {
		return label;
	}

}
