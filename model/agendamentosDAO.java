package model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

public class agendamentosDAO {
	Connection con;
	conexao cn=new conexao();
	
	// CRUD READ AGENDAMENTOS
	public ArrayList<agendamentos> listarAgendamentos() {
		//Criando objeto para acessar classe agendamentos
		ArrayList<agendamentos> agendamentos = new ArrayList<>();
		String read = "select c.nome_cliente, ag.valor_agendamento, ag.aceitar_agendamento, ag.status_agendamento, a.data_agenda, a.horario_agenda, s.descricao_servico, f.nome_funcionario, e.nomefant_empresa from agendamento as ag inner join cliente as c on ag.cliente = 1 inner join agenda as a on ag.agenda_empresa = 1 inner join servico_funcionario as sf on a.servico_funcionario = 1 inner join servico as s on sf.funcionario = 1 inner join funcionario as f on sf.servico = 1 inner join empresa as e on a.empresa = 2 group by ag.id_agendamento";
		try {
			con=cn.conectar();
			PreparedStatement pst = con.prepareStatement(read);
			
			
			ResultSet rs = pst.executeQuery();
			// While abaixo busca enquanto houver agendamentos
			while (rs.next()) {
				//Váriaveis que recebem os dados do banco									
				String cliente = rs.getString(1);
				String valor_agendamento = rs.getString(2);
				String aceitar_agendamento = rs.getString(3);
				String status_agendamento = rs.getString(4);
				String data_agenda = rs.getString(5);
				String horario_agenda = rs.getString(6);
				String descricao_servico = rs.getString(7);
				String nome_funcionario = rs.getString(8);
				String nomefant_empresa = rs.getString(9);
				
				//Popular ArrayList
				agendamentos.add(new agendamentos(cliente, valor_agendamento, aceitar_agendamento, status_agendamento, data_agenda, horario_agenda, descricao_servico, nome_funcionario, nomefant_empresa));
			}
			con.close();
			return agendamentos;
		} catch (Exception e) {
			System.out.println(e);
			return null;
		}
	}
}