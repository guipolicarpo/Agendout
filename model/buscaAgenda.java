package model;

public class buscaAgenda {
	private String id_agenda;
	private String data_agenda;
	private String horario_agenda;
	private String disponivel_agenda;
	private String descricao_servico;
	private String tempo_servico;
	private String preco_servico;
	private String ativo_servico;
	private String nome_funcionario;
	private String ativo_funcionario;
	
	public buscaAgenda() {
		super();
	}
	
	public buscaAgenda(String id_agenda, String data_agenda, String horario_agenda, String disponivel_agenda, String descricao_servico, String tempo_servico, String preco_servico, String ativo_servico, String nome_funcionario, 
			String ativo_funcionario) {
		super();
		this.id_agenda = id_agenda;
		this.data_agenda = data_agenda;
		this.horario_agenda = horario_agenda;
		this.disponivel_agenda = disponivel_agenda;
		this.descricao_servico = descricao_servico;
		this.tempo_servico = tempo_servico;
		this.preco_servico = preco_servico;
		this.ativo_servico = ativo_servico;
		this.nome_funcionario = nome_funcionario;
		this.ativo_funcionario = ativo_funcionario;
		
	}
	
	public String getId_agenda() {
		return id_agenda;
	}

	public void setId_agenda(String id_agenda) {
		this.id_agenda = id_agenda;
	}

	public String getData_agenda() {
		return data_agenda;
	}

	public void setData_agenda(String data_agenda) {
		this.data_agenda = data_agenda;
	}

	public String getHorario_agenda() {
		return horario_agenda;
	}

	public void setHorario_agenda(String horario_agenda) {
		this.horario_agenda = horario_agenda;
	}

	public String getDisponivel_agenda() {
		return disponivel_agenda;
	}

	public void setDisponivel_agenda(String disponivel_agenda) {
		this.disponivel_agenda = disponivel_agenda;
	}

	public String getDescricao_servico() {
		return descricao_servico;
	}

	public void setDescricao_servico(String descricao_servico) {
		this.descricao_servico = descricao_servico;
	}

	public String getTempo_servico() {
		return tempo_servico;
	}

	public void setTempo_servico(String tempo_servico) {
		this.tempo_servico = tempo_servico;
	}

	public String getPreco_servico() {
		return preco_servico;
	}

	public void setPreco_servico(String preco_servico) {
		this.preco_servico = preco_servico;
	}

	public String getAtivo_servico() {
		return ativo_servico;
	}

	public void setAtivo_servico(String ativo_servico) {
		this.ativo_servico = ativo_servico;
	}

	public String getNome_funcionario() {
		return nome_funcionario;
	}

	public void setNome_funcionario(String nome_funcionario) {
		this.nome_funcionario = nome_funcionario;
	}

	public String getAtivo_funcionario() {
		return ativo_funcionario;
	}

	public void setAtivo_funcionario(String ativo_funcionario) {
		this.ativo_funcionario = ativo_funcionario;
	}
}
