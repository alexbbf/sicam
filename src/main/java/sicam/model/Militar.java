package sicam.model;

import java.util.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
public class Militar {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;

	private String nome;

	@Enumerated(EnumType.STRING)
	private Sexo sexo;

	@ManyToOne
	private Raca raca;

	@Temporal(TemporalType.DATE)
	private Date dataNascimento;

	@Enumerated(EnumType.STRING)
	private TipoSanguineo tipoSanquineo;

	@Enumerated(EnumType.STRING)
	private FatorRh fatorRh;

	private String naturalidade;

	private String nomePai;

	private String nomeMae;

	@Enumerated(EnumType.STRING)
	private EstadoCivil estadoCivil;

	@ManyToOne(cascade = CascadeType.ALL)
	private Conjuge conjuge;

	@ManyToOne(cascade = CascadeType.ALL)
	private Endereco endereco;

	private String email;

	private String telefoneFixo;

	private String telefoneCelular1;

	private String telefoneCelular2;

	private String contatoEmergencia;

	private String telefoneContatoEmergencia;

	private String pisPasep;

	private String ctps;

	@ManyToOne(cascade = CascadeType.ALL)
	private TituloEleitor tituloEleitor;

	@ManyToOne(cascade = CascadeType.ALL)
	private CarteiraHabilitacao cnh;

	@ManyToOne(cascade = CascadeType.ALL)
	private RegistroGeral rg;

	private String cpf;

	@ManyToOne(cascade = CascadeType.ALL)
	private DadosBancarios dadosBancarios;

	private String nomeGuerra;

	@Enumerated(EnumType.STRING)
	private Vinculo vinculo;

	private String matricula;

	private String siape;

	@Temporal(TemporalType.DATE)
	private Date dataIncorporacao;

	@ManyToOne
	private Quadro quadro;

	@ManyToOne
	private PostoGraduacao postoGraduacao;

	@Temporal(TemporalType.DATE)
	private Date dataPromocao;

	@Enumerated(EnumType.STRING)
	private SituacaoMilitar situacaoMilitar;

	@Enumerated(EnumType.STRING)
	private SituacaoMilitarAtiva situacaoMilitarAtiva;

	@ManyToOne
	private Setor setor;

	@ManyToOne
	private Setor adisposicao;

	@ManyToOne
	private LocalAgregacao localAgregacao;

	@OneToMany(mappedBy = "militar", cascade = CascadeType.ALL, fetch = FetchType.EAGER)
	private List<MilitarCursoNotas> cursos;

	@OneToMany(mappedBy = "militar", cascade = CascadeType.ALL, fetch = FetchType.EAGER)
	private List<Permissao> permissoes;

	@ManyToOne
	private Escolaridade escolaridade;

	private String senha;

	@ManyToOne
	private Anexo foto;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Sexo getSexo() {
		return sexo;
	}

	public void setSexo(Sexo sexo) {
		this.sexo = sexo;
	}

	public Raca getRaca() {
		return raca;
	}

	public void setRaca(Raca raca) {
		this.raca = raca;
	}

	public Date getDataNascimento() {
		return dataNascimento;
	}

	public void setDataNascimento(Date dataNascimento) {
		this.dataNascimento = dataNascimento;
	}

	public String getNomePai() {
		return nomePai;
	}

	public void setNomePai(String nomePai) {
		this.nomePai = nomePai;
	}

	public String getNomeMae() {
		return nomeMae;
	}

	public void setNomeMae(String nomeMae) {
		this.nomeMae = nomeMae;
	}

	public TipoSanguineo getTipoSanquino() {
		return tipoSanquineo;
	}

	public void setTipoSanquino(TipoSanguineo tipoSanquino) {
		this.tipoSanquineo = tipoSanquino;
	}

	public FatorRh getFatorRh() {
		return fatorRh;
	}

	public void setFatorRh(FatorRh fatorRh) {
		this.fatorRh = fatorRh;
	}

	public EstadoCivil getEstadoCivil() {
		return estadoCivil;
	}

	public void setEstadoCivil(EstadoCivil estadoCivil) {
		this.estadoCivil = estadoCivil;
	}

	public Endereco getEndereco() {
		if (endereco == null) {
			endereco = new Endereco();
		}
		return endereco;
	}

	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	}

	public TipoSanguineo getTipoSanquineo() {
		return tipoSanquineo;
	}

	public void setTipoSanquineo(TipoSanguineo tipoSanquineo) {
		this.tipoSanquineo = tipoSanquineo;
	}

	public String getNaturalidade() {
		return naturalidade;
	}

	public void setNaturalidade(String naturalidade) {
		this.naturalidade = naturalidade;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getTelefoneFixo() {
		return telefoneFixo;
	}

	public void setTelefoneFixo(String telefoneFixo) {
		this.telefoneFixo = telefoneFixo;
	}

	public String getTelefoneCelular1() {
		return telefoneCelular1;
	}

	public void setTelefoneCelular1(String telefoneCelular1) {
		this.telefoneCelular1 = telefoneCelular1;
	}

	public String getTelefoneCelular2() {
		return telefoneCelular2;
	}

	public void setTelefoneCelular2(String telefoneCelular2) {
		this.telefoneCelular2 = telefoneCelular2;
	}

	public String getContatoEmergencia() {
		return contatoEmergencia;
	}

	public void setContatoEmergencia(String contatoEmergencia) {
		this.contatoEmergencia = contatoEmergencia;
	}

	public String getTelefoneContatoEmergencia() {
		return telefoneContatoEmergencia;
	}

	public void setTelefoneContatoEmergencia(String telefoneContatoEmergencia) {
		this.telefoneContatoEmergencia = telefoneContatoEmergencia;
	}

	public String getPisPasep() {
		return pisPasep;
	}

	public void setPisPasep(String pisPasep) {
		this.pisPasep = pisPasep;
	}

	public String getCtps() {
		return ctps;
	}

	public void setCtps(String ctps) {
		this.ctps = ctps;
	}

	public TituloEleitor getTituloEleitor() {
		if (tituloEleitor == null) {
			tituloEleitor = new TituloEleitor();
		}
		return tituloEleitor;
	}

	public void setTituloEleitor(TituloEleitor tituloEleitor) {
		this.tituloEleitor = tituloEleitor;
	}

	public CarteiraHabilitacao getCnh() {
		if (cnh == null) {
			cnh = new CarteiraHabilitacao();
		}
		return cnh;
	}

	public void setCnh(CarteiraHabilitacao cnh) {
		this.cnh = cnh;
	}

	public RegistroGeral getRg() {
		if (rg == null) {
			rg = new RegistroGeral();
		}
		return rg;
	}

	public void setRg(RegistroGeral rg) {
		this.rg = rg;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public DadosBancarios getDadosBancarios() {
		if (dadosBancarios == null) {
			dadosBancarios = new DadosBancarios();
		}
		return dadosBancarios;
	}

	public void setDadosBancarios(DadosBancarios dadosBancarios) {
		this.dadosBancarios = dadosBancarios;
	}

	public String getNomeGuerra() {
		return nomeGuerra;
	}

	public void setNomeGuerra(String nomeGuerra) {
		this.nomeGuerra = nomeGuerra;
	}

	public Vinculo getVinculo() {
		return vinculo;
	}

	public void setVinculo(Vinculo vinculo) {
		this.vinculo = vinculo;
	}

	public String getMatricula() {
		return matricula;
	}

	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}

	public String getSiape() {
		return siape;
	}

	public void setSiape(String siape) {
		this.siape = siape;
	}

	public Conjuge getConjuge() {
		if (conjuge == null) {
			conjuge = new Conjuge();
		}
		return conjuge;
	}

	public void setConjuge(Conjuge conjuge) {
		this.conjuge = conjuge;
	}

	public Date getDataIncorporacao() {
		return dataIncorporacao;
	}

	public void setDataIncorporacao(Date dataIncorporacao) {
		this.dataIncorporacao = dataIncorporacao;
	}

	public Quadro getQuadro() {
		return quadro;
	}

	public void setQuadro(Quadro quadro) {
		this.quadro = quadro;
	}

	public PostoGraduacao getPostoGraduacao() {
		return postoGraduacao;
	}

	public void setPostoGraduacao(PostoGraduacao postoGraduacao) {
		this.postoGraduacao = postoGraduacao;
	}

	public Date getDataPromocao() {
		return dataPromocao;
	}

	public void setDataPromocao(Date dataPromocao) {
		this.dataPromocao = dataPromocao;
	}

	public SituacaoMilitar getSituacaoMilitar() {
		return situacaoMilitar;
	}

	public void setSituacaoMilitar(SituacaoMilitar situacaoMilitar) {
		this.situacaoMilitar = situacaoMilitar;
	}

	public SituacaoMilitarAtiva getSituacaoMilitarAtiva() {
		return situacaoMilitarAtiva;
	}

	public void setSituacaoMilitarAtiva(
			SituacaoMilitarAtiva situacaoMilitarAtiva) {
		this.situacaoMilitarAtiva = situacaoMilitarAtiva;
	}

	public Setor getSetor() {
		return setor;
	}

	public void setSetor(Setor setor) {
		this.setor = setor;
	}

	public Setor getAdisposicao() {
		return adisposicao;
	}

	public void setAdisposicao(Setor adisposicao) {
		this.adisposicao = adisposicao;
	}

	public LocalAgregacao getLocalAgregacao() {
		return localAgregacao;
	}

	public void setLocalAgregacao(LocalAgregacao localAgregacao) {
		this.localAgregacao = localAgregacao;
	}

	public List<MilitarCursoNotas> getCursos() {
		return cursos;
	}

	public void setCursos(List<MilitarCursoNotas> cursos) {
		this.cursos = cursos;
	}

	public Escolaridade getEscolaridade() {
		return escolaridade;
	}

	public void setEscolaridade(Escolaridade escolaridade) {
		this.escolaridade = escolaridade;
	}

	public List<Permissao> getPermissoes() {
		return permissoes;
	}

	public void setPermissoes(List<Permissao> permissoes) {
		this.permissoes = permissoes;
	}

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}

	public Anexo getFoto() {
		return foto;
	}

	public void setFoto(Anexo foto) {
		this.foto = foto;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Militar other = (Militar) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		return true;
	}

}
