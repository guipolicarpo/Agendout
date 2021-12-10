package model;

public class agendar {
	private String cliente;
	private String valor_agendamento;
	private String aceitar_agendamento;
	private String status_agendamento;
	private String agenda_empresa;
	
	
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


	public String getAgenda_empresa() {
		return agenda_empresa;
	}


	public void setAgenda_empresa(String agenda_empresa) {
		this.agenda_empresa = agenda_empresa;
	}


	public agendar() {
		super();
	}


	public agendar(String cliente, String valor_agendamento, String aceitar_agendamento, String status_agendamento,
			String agenda_empresa) {
		super();
		this.cliente = cliente;
		this.valor_agendamento = valor_agendamento;
		this.aceitar_agendamento = aceitar_agendamento;
		this.status_agendamento = status_agendamento;
		this.agenda_empresa = agenda_empresa;
	}
	
	
}
