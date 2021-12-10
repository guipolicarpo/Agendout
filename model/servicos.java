package model;

public class servicos {
	private String descricao_servico;
	private String tempo_servico;
	private String preco_servico;
	private String ativo_servico;
	
	public servicos(String descricao_servico, String tempo_servico, String preco_servico, String ativo_servico) {
		super();
		this.descricao_servico = descricao_servico;
		this.tempo_servico = tempo_servico;
		this.preco_servico = preco_servico;
		this.ativo_servico = ativo_servico;
	}
	
	public servicos() {
		super();
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
	
	
}
