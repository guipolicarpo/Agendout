package model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

public class cadastroClienteDAO {
	Connection con;
	conexao cn=new conexao();


	// CRUD CREATE CLIENTE
	public void createCadastro(cadastroCliente cadastro) {
		String create = "insert into cliente (nome_cliente, telefone_cliente, email_cliente, senha_cliente, ativo_cliente) values (?,?,?,?,?)";
		try {
			// ABRIR CONEXÃO
			con=cn.conectar();
			// PREPARAR QUERY PARA EXECUÇÃO
			PreparedStatement pst = con.prepareStatement(create);
			// SUBSTITUIR "?" POR VARIÁVEIS
			pst.setString(1, cadastro.getNome_cliente());
			pst.setString(2, cadastro.getTelefone_cliente());
			pst.setString(3, cadastro.getEmail_cliente());
			pst.setString(4, cadastro.getSenha_cliente());
			pst.setInt(5, 1);
			// EXECUTAR QUERY
			pst.executeUpdate();
			// ENCERRAR CONEXÃO COM BANCO
			con.close();
		} catch (Exception e) {
			System.out.println(e);
		}
	}
	
	// CRUD READ TABELA CLIENTE
	public ArrayList<cadastroCliente> listarContatos() {
		//Criando objeto para acessar classe JavaBeans
		ArrayList<cadastroCliente> contatos = new ArrayList<>();
		String read = "select * from cliente order by id_cliente";
		try {
			con=cn.conectar();
			PreparedStatement pst = con.prepareStatement(read);
			ResultSet rs = pst.executeQuery();
			// While abaixo busca enquanto houver usuarios
			while (rs.next()) {
				//Váriaveis que recebem os dados do banco
				String id_cliente = rs.getString(1);
				String nome_cliente = rs.getString(2);
				String telefone_cliente = rs.getString(3);
				String email_cliente = rs.getString(4);
				String senha_cliente = rs.getString(5);
				String ativo_cliente = rs.getString(6);
				//Popular ArrayList
				contatos.add(new cadastroCliente(id_cliente, nome_cliente, telefone_cliente, email_cliente, senha_cliente, ativo_cliente));
			}
			con.close();
			return contatos;
		} catch (Exception e) {
			System.out.println(e);
			return null;
		}
	}
}
