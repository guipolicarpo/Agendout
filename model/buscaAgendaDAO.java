package model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

import javax.servlet.ServletRequest;

import com.mysql.cj.Session;
public class buscaAgendaDAO {	
	public String idempresa;
	
	Connection con;
	conexao cn=new conexao();

	
	// CRUD READ AGENDAMENTO
			public ArrayList<buscaAgenda> listarAgenda() {
				//Criando objeto para acessar classe agendamento
				ArrayList<buscaAgenda> agendar = new ArrayList<>();
				String read = "select a.id_agenda, a.data_agenda, a.horario_agenda, a.disponivel_agenda, s.descricao_servico, s.tempo_servico, s.preco_servico, s.ativo_servico, f.nome_funcionario, f.ativo_funcionario from agenda as a inner join empresa as e on a.empresa = "+ idempresa +" inner join servico as s on e.id_empresa = "+ idempresa +" inner join funcionario as f on e.id_empresa = "+ idempresa +" group by a.id_agenda";
				try {
					con=cn.conectar();
					PreparedStatement pst = con.prepareStatement(read);
					
					ResultSet rs = pst.executeQuery();
					// While abaixo busca enquanto houver empresas
					while (rs.next()) {
						//Váriaveis que recebem os dados do banco	
						String id_agenda = rs.getString(1);
						String data_agenda = rs.getString(2);
						String horario_agenda = rs.getString(3);
						String disponivel_agenda = rs.getString(4);
						String descricao_servico = rs.getString(5);
						String tempo_servico = rs.getString(6);
						String preco_servico = rs.getString(7);
						String ativo_servico = rs.getString(8);
						String nome_funcionario = rs.getString(9);
						String ativo_funcionario = rs.getString(10);
						//Popular ArrayList
						agendar.add(new buscaAgenda(id_agenda, data_agenda, horario_agenda, disponivel_agenda, descricao_servico, tempo_servico, preco_servico, ativo_servico, nome_funcionario, ativo_funcionario));
					}
					con.close();
					return agendar;
				} catch (Exception e) {
					System.out.println(e);
					return null;
				}
			}

}

