package model;

public class funcionarios {
	private String nome_funcionario;
	private String email_funcionario;
	private String senha_funcionario;
	private String ativo_funcionario;
	
	public funcionarios(String nome_funcionario, String email_funcionario, String senha_funcionario, String ativo_funcionario) {
		super();
		this.nome_funcionario = nome_funcionario;
		this.email_funcionario = email_funcionario;
		this.senha_funcionario = senha_funcionario;
		this.ativo_funcionario = ativo_funcionario;
	}
	
	public funcionarios() {
		super();
	}

	public String getNome_funcionario() {
		return nome_funcionario;
	}

	public void setNome_funcionario(String nome_funcionario) {
		this.nome_funcionario = nome_funcionario;
	}

	public String getEmail_funcionario() {
		return email_funcionario;
	}

	public void setEmail_funcionario(String email_funcionario) {
		this.email_funcionario = email_funcionario;
	}

	public String getSenha_funcionario() {
		return senha_funcionario;
	}

	public void setSenha_funcionario(String senha_funcionario) {
		this.senha_funcionario = senha_funcionario;
	}

	public String getAtivo_funcionario() {
		return ativo_funcionario;
	}

	public void setAtivo_funcionario(String ativo_funcionario) {
		this.ativo_funcionario = ativo_funcionario;
	}
	
}
