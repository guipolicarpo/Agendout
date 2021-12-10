package model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

public class agendarDAO {
	Connection con;
	conexao cn=new conexao();
	
	// CRUD CREATE AGENDAMENTO
		public void createAgendar(agendar agendar) {
			String create = "insert into agendamento (cliente, valor_agendamento, aceitar_agendamento, status_agendamento, agenda_empresa) values (?,?,?,?,?)";
			try {
				// ABRIR CONEX�O
				con=cn.conectar();
				// PREPARAR QUERY PARA EXECU��O
				PreparedStatement pst = con.prepareStatement(create);
				// SUBSTITUIR "?" POR VARI�VEIS
				pst.setString(1, agendar.getCliente());
				pst.setString(2, agendar.getValor_agendamento());
				pst.setInt(3, 0);
				pst.setInt(4, 0);
				pst.setString(5, agendar.getAgenda_empresa());
				// EXECUTAR QUERY
				pst.executeUpdate();
				// ENCERRAR CONEX�O COM BANCO
				con.close();
			} catch (Exception e) {
				System.out.println(e);
			}
		}

}
