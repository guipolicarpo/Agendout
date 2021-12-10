package model;

public class agendamentos {
	private String cliente;
	private String valor_agendamento;
	private String aceitar_agendamento;
	private String status_agendamento;
	private String data_agenda;
	private String horario_agenda;
	private String descricao_servico;
	private String nome_funcionario;
	private String nomefant_empresa;
	
	
	public agendamentos(String cliente, String valor_agendamento, String aceitar_agendamento, String status_agendamento, String data_agenda, String horario_agenda, String descricao_servico, String nome_funcionario, String nomefant_empresa) {
		super();
		this.cliente = cliente;
		this.valor_agendamento = valor_agendamento;
		this.aceitar_agendamento = aceitar_agendamento;
		this.status_agendamento = status_agendamento;
		this.data_agenda = data_agenda;
		this.horario_agenda = horario_agenda;
		this.descricao_servico = descricao_servico;
		this.nome_funcionario = nome_funcionario;
		this.nomefant_empresa = nomefant_empresa;
	}
	
	public String getNomefant_empresa() {
		return nomefant_empresa;
	}

	public void setNomefant_empresa(String nomefant_empresa) {
		this.nomefant_empresa = nomefant_empresa;
	}

	public String getDescricao_servico() {
		return descricao_servico;
	}

	public void setDescricao_servico(String descricao_servico) {
		this.descricao_servico = descricao_servico;
	}

	public String getNome_funcionario() {
		return nome_funcionario;
	}

	public void setNome_funcionario(String nome_funcionario) {
		this.nome_funcionario = nome_funcionario;
	}

	public agendamentos() {
		super();
	}

	public String getCliente() {
		return cliente;
	}

	public void setCliente(String cliente) {
		this.cliente = cliente;
	}

	public String getValor_agendamento() {
		return valor_agendamento;
	}

	public void setValor_agendamento(String valor_agendamento) {
		this.valor_agendamento = valor_agendamento;
	}

	public String getAceitar_agendamento() {
		return aceitar_agendamento;
	}

	public void setAceitar_agendamento(String aceitar_agendamento) {
		this.aceitar_agendamento = aceitar_agendamento;
	}

	public String getStatus_agendamento() {
		return status_agendamento;
	}

	public void setStatus_agendamento(String status_agendamento) {
		this.status_agendamento = status_agendamento;
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
	
}
