package model;

public class login {
	//String id_cliente;
	String email_cliente;
	String senha_cliente;
	
	public login(String email_cliente, String senha_cliente, String id_cliente) {
		super();
		this.email_cliente = email_cliente;
		this.senha_cliente = senha_cliente;
		//this.id_cliente = id_cliente;
	}

	//public String getId_cliente() {
	//	return id_cliente;
	//}

	//public void setId_cliente(String id_cliente) {
	//	this.id_cliente = id_cliente;
	//}

	public login() {
		super(); 
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
	
}
