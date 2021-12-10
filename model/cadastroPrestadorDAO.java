package model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

public class cadastroPrestadorDAO {
	
	Connection con;
	conexao cn=new conexao();
	
	// CRUD CREATE PRESTADOR
		public void createCadastroPrestador(cadastroPrestador cadastroPrestador) {
			String create = "insert into empresa (tipo_empresa, nomefant_empresa, logradouro_empresa, numero_empresa, bairro_empresa, cidade_empresa, estado_empresa, complemento_empresa, cep_empresa, nome_empresa, cpfcnpj_empresa, telefone_empresa, email_empresa, senha_empresa, ativo_empresa, autonomo_empresa, remoto_empresa) values (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
			try {
				// ABRIR CONEXÃO
				con=cn.conectar();
				// PREPARAR QUERY PARA EXECUÇÃO
				PreparedStatement pst = con.prepareStatement(create);
				// SUBSTITUIR "?" POR VARIÁVEIS
				pst.setString(1, cadastroPrestador.getTipo_empresa());
				pst.setString(2, cadastroPrestador.getNomefant_empresa());
				pst.setString(3, cadastroPrestador.getLogradouro_empresa());
				pst.setString(4, cadastroPrestador.getNumero_empresa());
				pst.setString(5, cadastroPrestador.getBairro_empresa());
				pst.setString(6, cadastroPrestador.getCidade_empresa());
				pst.setString(7, cadastroPrestador.getEstado_empresa());
				pst.setString(8, cadastroPrestador.getComplemento_empresa());
				pst.setString(9, cadastroPrestador.getCep_empresa());
				pst.setString(10, cadastroPrestador.getNome_empresa());
				pst.setString(11, cadastroPrestador.getCpfcnpj_empresa());
				pst.setString(12, cadastroPrestador.getTelefone_empresa());
				pst.setString(13, cadastroPrestador.getEmail_empresa());
				pst.setString(14, cadastroPrestador.getSenha_empresa());
				pst.setInt(15, 1);
				pst.setString(16, cadastroPrestador.getAutonomo_empresa());
				pst.setString(17, cadastroPrestador.getRemoto_empresa());
				// EXECUTAR QUERY
				pst.executeUpdate();
				// ENCERRAR CONEXÃO COM BANCO
				con.close();
			} catch (Exception e) {
				System.out.println(e);
			}
		}
		
		// CRUD READ EMPRESA
		public ArrayList<cadastroPrestador> listarEmpresas() {
			//Criando objeto para acessar classe cadastroPrestador
			ArrayList<cadastroPrestador> empresas = new ArrayList<>();
			String read = "select * from empresa order by id_empresa";
			try {
				con=cn.conectar();
				PreparedStatement pst = con.prepareStatement(read);
				ResultSet rs = pst.executeQuery();
				// While abaixo busca enquanto houver empresas
				while (rs.next()) {
					//Váriaveis que recebem os dados do banco
					String id_empresa = rs.getString(1);
					String tipo_empresa = rs.getString(2);
					String nomefant_empresa = rs.getString(3);
					String logradouro_empresa = rs.getString(4);
					String numero_empresa = rs.getString(5);
					String bairro_empresa = rs.getString(6);
					String cidade_empresa = rs.getString(7);
					String estado_empresa = rs.getString(8);
					String complemento_empresa = rs.getString(9);
					String cep_empresa = rs.getString(10);
					String nome_empresa = rs.getString(11);
					String cpfcnpj_empresa = rs.getString(12);
					String telefone_empresa = rs.getString(13);
					String email_empresa = rs.getString(14);
					String senha_empresa = rs.getString(15);
					String ativo_empresa = rs.getString(16);
					String autonomo_empresa = rs.getString(17);
					String remoto_empresa = rs.getString(18);
					//Popular ArrayList
					empresas.add(new cadastroPrestador(id_empresa, tipo_empresa, nomefant_empresa, logradouro_empresa, numero_empresa, bairro_empresa, cidade_empresa, estado_empresa, 
							complemento_empresa, cep_empresa, nome_empresa, cpfcnpj_empresa, telefone_empresa, email_empresa, senha_empresa, ativo_empresa, autonomo_empresa, remoto_empresa, remoto_empresa));
				}
				con.close();
				return empresas;
			} catch (Exception e) {
				System.out.println(e);
				return null;
			}
		}
}
