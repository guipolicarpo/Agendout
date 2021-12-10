package model;

public class cadastroPrestador {
	private String id_empresa;
	private String tipo_empresa;
	private String nomefant_empresa;
	private String logradouro_empresa;
	private String numero_empresa;
	private String bairro_empresa;
	private String cidade_empresa;
	private String estado_empresa;
	private String complemento_empresa;
	private String cep_empresa;
	private String nome_empresa;
	private String cpfcnpj_empresa;
	private String telefone_empresa;
	private String email_empresa;
	private String senha_empresa;
	private String ativo_empresa;
	private String autonomo_empresa;
	private String remoto_empresa;
	
	public cadastroPrestador(String id_empresa, String tipo_empresa, String nomefant_empresa, String logradouro_empresa, String numero_empresa, String bairro_empresa, String cidade_empresa, 
			String estado_empresa, String complemento_empresa, String cep_empresa, String nome_empresa, String cpf_empresa, String cpfcnpj_empresa, String telefone_empresa, String email_empresa,
			String senha_empresa, String ativo_empresa, String autonomo_empresa, String remoto_empresa) {
		super();
		this.id_empresa = id_empresa;
		this.tipo_empresa = tipo_empresa;
		this.nomefant_empresa = nomefant_empresa;
		this.logradouro_empresa = logradouro_empresa;
		this.numero_empresa = numero_empresa;
		this.bairro_empresa = bairro_empresa;
		this.cidade_empresa = cidade_empresa;
		this.estado_empresa = estado_empresa;
		this.complemento_empresa = complemento_empresa;
		this.cep_empresa = cep_empresa;
		this.nome_empresa = nome_empresa;
		this.cpfcnpj_empresa = cpfcnpj_empresa;
		this.telefone_empresa = telefone_empresa;
		this.email_empresa = email_empresa;
		this.senha_empresa = senha_empresa;
		this.ativo_empresa = ativo_empresa;
		this.autonomo_empresa = autonomo_empresa;
		this.remoto_empresa = remoto_empresa;
	}
	
	public cadastroPrestador() {
		super();
	}

	public String getId_empresa() {
		return id_empresa;
	}

	public void setId_empresa(String id_empresa) {
		this.id_empresa = id_empresa;
	}

	public String getTipo_empresa() {
		return tipo_empresa;
	}

	public void setTipo_empresa(String tipo_empresa) {
		this.tipo_empresa = tipo_empresa;
	}

	public String getNomefant_empresa() {
		return nomefant_empresa;
	}

	public void setNomefant_empresa(String nomefant_empresa) {
		this.nomefant_empresa = nomefant_empresa;
	}

	public String getLogradouro_empresa() {
		return logradouro_empresa;
	}

	public void setLogradouro_empresa(String logradouro_empresa) {
		this.logradouro_empresa = logradouro_empresa;
	}

	public String getNumero_empresa() {
		return numero_empresa;
	}

	public void setNumero_empresa(String numero_empresa) {
		this.numero_empresa = numero_empresa;
	}

	public String getBairro_empresa() {
		return bairro_empresa;
	}

	public void setBairro_empresa(String bairro_empresa) {
		this.bairro_empresa = bairro_empresa;
	}

	public String getCidade_empresa() {
		return cidade_empresa;
	}

	public void setCidade_empresa(String cidade_empresa) {
		this.cidade_empresa = cidade_empresa;
	}

	public String getEstado_empresa() {
		return estado_empresa;
	}

	public void setEstado_empresa(String estado_empresa) {
		this.estado_empresa = estado_empresa;
	}

	public String getComplemento_empresa() {
		return complemento_empresa;
	}

	public void setComplemento_empresa(String complemento_empresa) {
		this.complemento_empresa = complemento_empresa;
	}

	public String getCep_empresa() {
		return cep_empresa;
	}

	public void setCep_empresa(String cep_empresa) {
		this.cep_empresa = cep_empresa;
	}

	public String getNome_empresa() {
		return nome_empresa;
	}

	public void setNome_empresa(String nome_empresa) {
		this.nome_empresa = nome_empresa;
	}

	public String getCpfcnpj_empresa() {
		return cpfcnpj_empresa;
	}

	public void setCpfcnpj_empresa(String cpfcnpj_empresa) {
		this.cpfcnpj_empresa = cpfcnpj_empresa;
	}

	public String getTelefone_empresa() {
		return telefone_empresa;
	}

	public void setTelefone_empresa(String telefone_empresa) {
		this.telefone_empresa = telefone_empresa;
	}

	public String getEmail_empresa() {
		return email_empresa;
	}

	public void setEmail_empresa(String email_empresa) {
		this.email_empresa = email_empresa;
	}

	public String getSenha_empresa() {
		return senha_empresa;
	}

	public void setSenha_empresa(String senha_empresa) {
		this.senha_empresa = senha_empresa;
	}

	public String getAtivo_empresa() {
		return ativo_empresa;
	}

	public void setAtivo_empresa(String ativo_empresa) {
		this.ativo_empresa = ativo_empresa;
	}

	public String getAutonomo_empresa() {
		return autonomo_empresa;
	}

	public void setAutonomo_empresa(String autonomo_empresa) {
		this.autonomo_empresa = autonomo_empresa;
	}

	public String getRemoto_empresa() {
		return remoto_empresa;
	}

	public void setRemoto_empresa(String remoto_empresa) {
		this.remoto_empresa = remoto_empresa;
	}
}
