package model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

public class funcionariosDAO {
	Connection con;
	conexao cn=new conexao();
	
	// CRUD READ FUNCIONARIOS
	public ArrayList<funcionarios> listarFuncionarios() {
		//Criando objeto para acessar classe funcionarios
		ArrayList<funcionarios> funcionarios = new ArrayList<>();
		String read = "select * from funcionario order by id_funcionario";
		try {
			con=cn.conectar();
			PreparedStatement pst = con.prepareStatement(read);
			
			
			ResultSet rs = pst.executeQuery();
			// While abaixo busca enquanto houver funcionarios
			while (rs.next()) {
				//Váriaveis que recebem os dados do banco					
				String nome_funcionario = rs.getString(1);
				String email_funcionario = rs.getString(2);
				String senha_funcionario = rs.getString(3);
				String ativo_funcionario = rs.getString(4);
				
				//Popular ArrayList
				funcionarios.add(new funcionarios(nome_funcionario, email_funcionario, senha_funcionario, ativo_funcionario));
			}
			con.close();
			return funcionarios;
		} catch (Exception e) {
			System.out.println(e);
			return null;
		}
	}
}
