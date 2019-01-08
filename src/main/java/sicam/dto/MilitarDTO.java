package sicam.dto;

import javax.persistence.ManyToOne;

import sicam.model.PostoGraduacao;


public class MilitarDTO {
	
	public MilitarDTO(Integer id, String nomeCompleto) {
		this.id = id;
		this.nomeCompleto = nomeCompleto;
	}

	public MilitarDTO() {
	}

	public MilitarDTO(Integer id, String nomeCompleto,
			PostoGraduacao postoGraduacao, String nomeGuerra) {
		this.id = id;
		this.nomeCompleto = nomeCompleto;
		this.postoGraduacao = postoGraduacao;
		this.nomeGuerra = nomeGuerra;
	}

	private Integer id;

	private String nomeCompleto;

	@ManyToOne
	private PostoGraduacao postoGraduacao;

	private String cpf;

	private String matricula;

	private String nomeGuerra;

	public String getNomeGuerra() {
		return nomeGuerra;
	}

	public void setNomeGuerra(String nomeGuerra) {
		this.nomeGuerra = nomeGuerra;
	}

	public PostoGraduacao getPostoGraduacao() {
		return postoGraduacao;
	}

	public void setPostoGraduacao(PostoGraduacao postoGraduacao) {
		this.postoGraduacao = postoGraduacao;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public String getMatricula() {
		return matricula;
	}

	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getNomeCompleto() {
		return nomeCompleto;
	}

	public void setNomeCompleto(String nomeCompleto) {
		this.nomeCompleto = nomeCompleto;
	}

}
