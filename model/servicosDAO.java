package model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

public class servicosDAO {
	Connection con;
	conexao cn=new conexao();
	
	// CRUD READ SERVIÇOS
				public ArrayList<servicos> listarServicos() {
					//Criando objeto para acessar classe servicos
					ArrayList<servicos> servicos = new ArrayList<>();
					String read = "select * from servico order by id_servico";
					try {
						con=cn.conectar();
						PreparedStatement pst = con.prepareStatement(read);
						
						
						ResultSet rs = pst.executeQuery();
						// While abaixo busca enquanto houver servicos
						while (rs.next()) {
							//Váriaveis que recebem os dados do banco					
							String descricao_servico = rs.getString(1);
							String tempo_servico = rs.getString(2);
							String preco_servico = rs.getString(3);
							String ativo_servico = rs.getString(4);
							
							//Popular ArrayList
							servicos.add(new servicos(descricao_servico, tempo_servico, preco_servico, ativo_servico));
						}
						con.close();
						return servicos;
					} catch (Exception e) {
						System.out.println(e);
						return null;
					}
				}
}
