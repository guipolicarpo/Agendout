<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<%@ page import="model.cadastroCliente"%>
<%@ page import="java.util.ArrayList"%>
<%
    ArrayList<cadastroCliente> lista = (ArrayList<cadastroCliente>)
  request.getAttribute("contatos");
%>
   
<!DOCTYPE html>
<html lang="pt-br">
<head>
<meta charset="utf-8">
<title>Painel | Agendout</title>
</head>
<body>	
		<h1>Listagem de Usuarios</h1>
		<table class="table">
  <thead>
    <tr>
      <th scope="col">Id</th>
      <th scope="col">Nome</th>
      <th scope="col">Telefone</th>
      <th scope="col">Email</th>
      <th scope="col">Senha</th>
      <th scope="col">Ativo</th>
    </tr>
  </thead>
  <tbody>
    <%for (int i = 0; i < lista.size(); i++) { %>
    	<tr>
    		<td><%=lista.get(i).getId_cliente() %> </td>
    		<td><%=lista.get(i).getNome_cliente() %> </td>
    		<td><%=lista.get(i).getTelefone_cliente() %> </td>
    		<td><%=lista.get(i).getEmail_cliente() %> </td>
    		<td><%=lista.get(i).getSenha_cliente() %> </td>
    		<td><%=lista.get(i).getAtivo_cliente() %> </td>
    	</tr>
    <%} %>
  </tbody>
</table>
</body>
</html>