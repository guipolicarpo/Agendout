package controller;

import java.sql.Connection;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.cadastroClienteDAO;
import model.cadastroCliente;
import model.conexao;
import model.login;
import model.loginDAO;
import model.cadastroPrestador;
import model.cadastroPrestadorDAO;
import model.buscaAgenda;
import model.buscaAgendaDAO;
import model.servicos;
import model.servicosDAO;
import model.funcionarios;
import model.funcionariosDAO;
import model.agendamentos;
import model.agendamentosDAO;
import model.agendar;
import model.agendarDAO;

@WebServlet(urlPatterns = { "/Controller", "/main", "/listarUsuarios", "/listarPrestador", "/insertCliente", "/insertPrest", "/login", "/sair", "/telaLogin", "/telaHome", "/telaEsqueceuSenha", "/telaCadastroUsuario", 
		"/telaTipoCadastro", "/telaCadastroPrestador", "/telaInicio", "/buscaAgenda", "/inicioPrest", "/funcionariosPrest", "/servicosPrest", "/meusAgendamentos", "/agendar" })
public class Controller extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	cadastroClienteDAO dao = new cadastroClienteDAO();
	cadastroCliente cliente = new cadastroCliente();

	loginDAO dao2 = new loginDAO();
	login log = new login();
	
	cadastroPrestador prestador = new cadastroPrestador();
	cadastroPrestadorDAO dao3 = new cadastroPrestadorDAO();
	
	buscaAgenda agenda = new buscaAgenda();
	buscaAgendaDAO dao4 = new buscaAgendaDAO();
	
	servicos servico = new servicos();
	servicosDAO dao5 = new servicosDAO();
	
	funcionarios funcionario = new funcionarios();
	funcionariosDAO dao6 = new funcionariosDAO();
	
	agendamentos agendamento = new agendamentos();
	agendamentosDAO dao7 = new agendamentosDAO(); 
	
	agendar agendar = new agendar();
	agendarDAO dao8 = new agendarDAO();
	
	
	//Conexão com o banco
	Connection con;
	conexao cn = new conexao();

	public Controller() {
		super();
	}
	
	//DO GET

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String action = request.getServletPath();
		if (action.equals("/main")) {
			if (dao2.result == true) {
				telaMain(request, response);
			} else {
				response.sendRedirect("telaLogin");
			}
		} else if (action.equals("/listarUsuarios")) {
			if (dao2.result == true) {
				listarUsuarios(request, response);
			} else {
				response.sendRedirect("telaLogin");
			}
		} else if (action.equals("/listarPrestador")) {
			if (dao2.result == true) {
				listarPrestador(request, response);
			} else {
				response.sendRedirect("telaLogin");
			}
		}else if (action.equals("/inicioPrest")) {
			if (dao2.result == true) {
				inicioPrest(request, response);
			} else {
				response.sendRedirect("telaLogin");
			}
		}else if (action.equals("/funcionariosPrest")) {
			if (dao2.result == true) {
				funcionariosPrest(request, response);
			} else {
				response.sendRedirect("telaLogin");
			}
		}else if (action.equals("/servicosPrest")) {
			if (dao2.result == true) {
				servicosPrest(request, response);
			} else {
				response.sendRedirect("telaLogin");
			}
		}else if (action.equals("/meusAgendamentos")) {
			if (dao2.result == true) {
				meusAgendamentos(request, response);
			} else {
				response.sendRedirect("telaLogin");
			}
		}else if (action.equals("/telaInicio")) {
			if (dao2.result == true) {
				listarPrestador(request, response);
			} else {
				response.sendRedirect("telaLogin");
			}
		}else if (action.equals("/buscaAgenda")) {
			if (dao2.result == true) {
				buscaAgenda(request, response);
			} else {
				response.sendRedirect("telaLogin");
			}
		}else if (action.equals("/agendar")) {
			if (dao2.result == true) {
				agendar(request, response);
			} else {
				response.sendRedirect("telaLogin");
			}
		}else if (action.equals("/insertCliente")) {
			novoCadastro(request, response);
		}else if (action.equals("/insertPrest")) {
			cadastroPrestador(request, response);
		} else if (action.equals("/login")) {
			login(request, response);
		} else if (action.equals("/sair")) {
			sair(request, response);
		} else if (action.equals("/telaLogin")) {
			telaLogin(request, response);
		}else if (action.equals("/telaHome")) {
			telaHome(request, response);
		}else if (action.equals("/telaEsqueceuSenha")) {
			telaEsqueceuSenha(request, response);
		}else if (action.equals("/telaCadastroUsuario")) {
			telaCadastroUsuario(request, response);
		}else if (action.equals("/telaTipoCadastro")) {
			telaTipoCadastro(request, response);
		}else if (action.equals("/telaCadastroPrestador")) {
			telaCadastroPrestador(request, response);
		}else {
			response.sendRedirect("telaHome");
		}
	}
	
	// AGENDAR
		protected void agendar(HttpServletRequest request, HttpServletResponse response)
				throws ServletException, IOException {

			// SETAR VARIÁVEIS
			//agendar.setCliente(log.getId_cliente());
			//agendar.setValor_agendamento(agenda.getPreco_servico());
			//agendar.setAgenda_empresa("idagenda");

			// INVOCAR MÉTODO CREATE CADASTRO
			//dao8.createAgendar(agendar);

			// REDIRECIONAR PARA TELA DE LOGIN
			//response.sendRedirect("telaInicio");
		}
	
	// BUSCAR AGENDA	
		protected void buscaAgenda(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// Criando um objeto que ira receber os dados
		dao4.idempresa = request.getParameter("idEmpresa");		
		ArrayList<buscaAgenda> listarAgenda = dao4.listarAgenda();
		// Encaminhar cadastros
		request.setAttribute("agendar", listarAgenda);
		RequestDispatcher rd = request.getRequestDispatcher("agendamento.jsp");
		rd.forward(request, response);
		}
		
	// LISTAR AGENDAMENTOS
	protected void meusAgendamentos(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// Criando um objeto que ira receber os dados
		ArrayList<agendamentos> agendamentos = dao7.listarAgendamentos();
		// Encaminhar cadastros
		request.setAttribute("agendamentos", agendamentos);
		RequestDispatcher rd = request.getRequestDispatcher("meusAgendamentos.jsp");
		rd.forward(request, response);
		}	
		
	// INICIO PRESTADOR
	protected void inicioPrest(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// Criando um objeto que ira receber os dados
		ArrayList<agendamentos> agendamentos = dao7.listarAgendamentos();
		// Encaminhar cadastros
		request.setAttribute("agendamentos", agendamentos);
		RequestDispatcher rd = request.getRequestDispatcher("inicioPrest.jsp");
		rd.forward(request, response);
		}			
		
	// LISTAR SERVIÇOS
	protected void funcionariosPrest(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// Criando um objeto que ira receber os dados
		ArrayList<funcionarios> funcionarios = dao6.listarFuncionarios();
		// Encaminhar cadastro
		request.setAttribute("funcionarios", funcionarios);
		RequestDispatcher rd = request.getRequestDispatcher("funcionariosPrest.jsp");
		rd.forward(request, response);
		}	
		
	// LISTAR SERVIÇOS
	protected void servicosPrest(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// Criando um objeto que ira receber os dados
		ArrayList<servicos> servicos = dao5.listarServicos();
		// Encaminhar cadastros
		request.setAttribute("servicos", servicos);
		RequestDispatcher rd = request.getRequestDispatcher("servicosPrest.jsp");
		rd.forward(request, response);
	}
	
	// LISTAR CADASTRO EMPRESAS
	protected void listarPrestador(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// Criando um objeto que ira receber os dados
		ArrayList<cadastroPrestador> listaPrest = dao3.listarEmpresas();
		// Encaminhar cadastros
		request.setAttribute("empresas", listaPrest);
		RequestDispatcher rd = request.getRequestDispatcher("inicio.jsp");
		rd.forward(request, response);
	}

	// LISTAR CADASTRO CLIENTES
	protected void listarUsuarios(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// Criando um objeto que ira receber os dados
		ArrayList<cadastroCliente> lista = dao.listarContatos();
		// Encaminhar cadastros
		request.setAttribute("contatos", lista);
		RequestDispatcher rd = request.getRequestDispatcher("listaClientes.jsp");
		rd.forward(request, response);
	}

	// CADASTRAR CLIENTE
	protected void novoCadastro(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		// SETAR VARIÁVEIS
		cliente.setNome_cliente(request.getParameter("nome"));
		cliente.setEmail_cliente(request.getParameter("email"));
		cliente.setTelefone_cliente(request.getParameter("telefone"));
		cliente.setSenha_cliente(request.getParameter("senha"));

		// INVOCAR MÉTODO CREATE CADASTRO
		dao.createCadastro(cliente);

		// REDIRECIONAR PARA TELA DE LOGIN
		response.sendRedirect("telaLogin");
	}
	
	//CADASTRAR PRESTADOR
	protected void cadastroPrestador(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		
		//SETAR VARIÁVEIS
		prestador.setNome_empresa(request.getParameter("nome"));	
		prestador.setTelefone_empresa(request.getParameter("telefone"));
		prestador.setCpfcnpj_empresa(request.getParameter("cpfcnpj"));
		prestador.setEmail_empresa(request.getParameter("email"));
		prestador.setSenha_empresa(request.getParameter("senha"));
		
		prestador.setAutonomo_empresa(request.getParameter("prestador"));
		prestador.setRemoto_empresa(request.getParameter("fisicoremoto"));
		prestador.setTipo_empresa(request.getParameter("ramo"));
		prestador.setNomefant_empresa(request.getParameter("nomefant"));
		
		prestador.setLogradouro_empresa(request.getParameter("logradouro"));
		prestador.setNumero_empresa(request.getParameter("numero"));
		prestador.setBairro_empresa(request.getParameter("bairro"));
		prestador.setCidade_empresa(request.getParameter("cidade"));
		prestador.setEstado_empresa(request.getParameter("estado"));
		prestador.setComplemento_empresa(request.getParameter("complemento"));
		prestador.setCep_empresa(request.getParameter("cep"));
			
		//INVOCAR MÉTODO CREATE CADASTRO
		dao3.createCadastroPrestador(prestador);
		
		// REDIRECIONAR PARA TELA DE LOGIN
		response.sendRedirect("telaLogin");
	}

	// LOGIN
	protected void login(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		log.setEmail_cliente(request.getParameter("email"));
		log.setSenha_cliente(request.getParameter("senha"));
		dao2.validar(log);
		if (dao2.result == true) {
			response.sendRedirect("telaInicio");
		} else {
			response.sendRedirect("telaLogin");
		}
		
	}
	
	// SAIR
	protected void sair(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		log.setEmail_cliente(null);
		if (log.getEmail_cliente() == null) {
			dao2.result = false;
			response.sendRedirect("telaHome");
		}
	}
	
	// REDIRECIONAR PARA TELA MAIN
		protected void telaMain(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
			RequestDispatcher rd = request.getRequestDispatcher("main.jsp");
			rd.forward(request, response);
			//response.sendRedirect("main.jsp");
	}
	
	// REDIRECIONAR PARA TELA LOGIN
	protected void telaLogin(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		RequestDispatcher rd = request.getRequestDispatcher("login.jsp");
		rd.forward(request, response);
		//response.sendRedirect("login.jsp");
	}
	
	// REDIRECIONAR PARA TELA INDEX
	protected void telaHome(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		RequestDispatcher rd = request.getRequestDispatcher("index.html");
		rd.forward(request, response);
		//response.sendRedirect("index.html");
	}
	
	// REDIRECIONAR PARA TELA CADASTRO CLIENTE
		protected void telaCadastroUsuario(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
			RequestDispatcher rd = request.getRequestDispatcher("cadastro-usuario.jsp");
			rd.forward(request, response);
			//response.sendRedirect("cadastro-usuario.jsp");
	}
	
	// REDIRECIONAR PARA TELA ESQUECEU SENHA
		protected void telaEsqueceuSenha(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
			RequestDispatcher rd = request.getRequestDispatcher("esqueceu-senha.jsp");
			rd.forward(request, response);
			//response.sendRedirect("esqueceu-senha.jsp");
	}
		
	// REDIRECIONAR PARA TELA TIPO CADASTRO
		protected void telaTipoCadastro(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
			RequestDispatcher rd = request.getRequestDispatcher("tipo-cadastro.html");
			rd.forward(request, response);
			}	
		
	// REDIRECIONAR PARA TELA CADASTRO PRESTADOR
		protected void telaCadastroPrestador(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
			RequestDispatcher rd = request.getRequestDispatcher("cadastro-prestador.jsp");
			rd.forward(request, response);
			}	
	// REDIRECIONAR PARA TELA INICIO
			protected void telaInicio(HttpServletRequest request, HttpServletResponse response)
				throws ServletException, IOException {
				RequestDispatcher rd = request.getRequestDispatcher("listarPrestador");
				rd.forward(request, response);
				}
				
}
