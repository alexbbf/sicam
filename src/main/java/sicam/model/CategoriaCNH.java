package sicam.model;

public enum CategoriaCNH {

	A("A"), B("B"), C("C"), D("D"), E("E"), AB("AB"), AC("AC"), AD("AD"), AE(
			"AE");

	private String label;

	private CategoriaCNH(String label) {
		this.label = label;
	}

	public String getLabel() {
		return label;
	}

}
