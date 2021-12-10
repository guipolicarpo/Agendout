package model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class loginDAO{
	
	Connection con;
	conexao cn=new conexao();
	PreparedStatement ps;
	public boolean result = false;

	public void validar(login login) {
		String sql = "select * from cliente where email_cliente=? and senha_cliente=?";
	    try {
	        // abrir a conexão
	    	con=cn.conectar();
	        // Preparar a query para execução no banco de dados
	        PreparedStatement pst = con.prepareStatement(sql);
	        // Substituir os parâmetros
	        pst.setString(1, login.getEmail_cliente());
	        pst.setString(2, login.getSenha_cliente());

	        ResultSet rs = pst.executeQuery();

	        if(rs.next()){
	        	//String id_cliente = rs.getString(1);
	        	//login.setId_cliente(id_cliente);
	            result = true;
	        }else{
	            result = false;
	        }
	        con.close();
	    } catch (SQLException e) {
	        System.out.println(e);
	    }
	}

}
    
