package model;

public class cadastroCliente {
	//private String id_cliente;
	private String nome_cliente;
	private String telefone_cliente;
	private String email_cliente;
	private String senha_cliente;
	private String ativo_cliente;
	
	public cadastroCliente(String id_cliente, String nome_cliente, String telefone_cliente,
			String email_cliente, String senha_cliente, String ativo_cliente) {
		super();
		//this.id_cliente = id_cliente;
		this.nome_cliente = nome_cliente;
		this.telefone_cliente = telefone_cliente;
		this.email_cliente = email_cliente;
		this.senha_cliente = senha_cliente;
		this.ativo_cliente = ativo_cliente;
	}

	public cadastroCliente() {
		super();
	}

	//public String getId_cliente() {
	//	return id_cliente;
	//}

	//public void setId_cliente(String id_cliente) {
	//	this.id_cliente = id_cliente;
	//}

	public String getNome_cliente() {
		return nome_cliente;
	}

	public void setNome_cliente(String nome_cliente) {
		this.nome_cliente = nome_cliente;
	}

	public String getTelefone_cliente() {
		return telefone_cliente;
	}

	public void setTelefone_cliente(String telefone_cliente) {
		this.telefone_cliente = telefone_cliente;
	}

	public String getEmail_cliente() {
		return email_cliente;
	}

	public void setEmail_cliente(String email_cliente) {
		this.email_cliente = email_cliente;
	}

	public String getSenha_cliente() {
		return senha_cliente;
	}

	public void setSenha_cliente(String senha_cliente) {
		this.senha_cliente = senha_cliente;
	}

	public String getAtivo_cliente() {
		return ativo_cliente;
	}

	public void setAtivo_cliente(String ativo_cliente) {
		this.ativo_cliente = ativo_cliente;
	}
}
