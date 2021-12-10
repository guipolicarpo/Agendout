<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<!DOCTYPE html>
<html :class="{ 'theme-dark': dark }" x-data="data()" lang="pt-br">
  <head>
    <meta charset="UTF-8" />
    <meta name="viewport" content="width=device-width, initial-scale=1.0" />
    <title>Agendout | Cadastro</title>
    <link rel = "icon" href = "./images/icone.png"/>
    <link
      href="https://fonts.googleapis.com/css2?family=Inter:wght@400;500;600;700;800&display=swap"
      rel="stylesheet"
    />
    <link rel="stylesheet" href="assets/css/tailwind.output.css" />
    <link rel="stylesheet" href="css/style.css">
    <script
      src="https://cdn.jsdelivr.net/gh/alpinejs/alpine@v2.x.x/dist/alpine.min.js"
      defer
    ></script>
    <script src="assets/js/init-alpine.js"></script>
  </head>
  <body>
  <nav class="navbar navbar-expand-lg navbar-dark ftco_navbar bg-dark ftco-navbar-light" id="ftco-navbar">
	    <div class="container">
	      <a class="navbar-brand" href="telaHome">Agendout</a>
	    </div>
  </nav>
    <div class="flex items-center min-h-screen p-6 bg-gray-50 dark:bg-gray-900">
      <div
        class="flex-1 h-full max-w-4xl mx-auto overflow-hidden bg-white rounded-lg shadow-xl dark:bg-gray-800"
      >
        <div class="flex flex-col overflow-y-auto md:flex-row">
          <div class="h-32 md:h-auto md:w-1/2">
            <img
              aria-hidden="true"
              class="object-cover w-full h-full dark:hidden"
              src="assets/img/loginimg2.jpg"
              alt="Office"
            />
            <img
              aria-hidden="true"
              class="hidden object-cover w-full h-full dark:block"
              src="assets/img/loginimg2.jpg"
              alt="Office"
            />
          </div>
          <div class="flex items-center justify-center p-6 sm:p-12 md:w-1/2">
          
            <div class="w-full">
            <form name="frmCadastroPrest" action="insertPrest">
				<h1
                class="mb-4 text-xl font-semibold text-gray-700 dark:text-gray-200"
              	>
                Informações pessoais
              	</h1>          
              <label class="block text-sm">
                <span class="text-gray-700 dark:text-gray-400">Nome completo</span>
                <input
                  class="block w-full mt-1 text-sm dark:border-gray-600 dark:bg-gray-700 focus:border-purple-400 focus:outline-none focus:shadow-outline-purple dark:text-gray-300 dark:focus:shadow-outline-gray form-input"
                  placeholder="Nome Completo"
                  type="text" 
                  name="nome"
                />
              </label>
              <label class="block mt-4 text-sm">
                <span class="text-gray-700 dark:text-gray-400">Telefone</span>
                <input
                  class="block w-full mt-1 text-sm dark:border-gray-600 dark:bg-gray-700 focus:border-purple-400 focus:outline-none focus:shadow-outline-purple dark:text-gray-300 dark:focus:shadow-outline-gray form-input"
                  placeholder="DDD + Telefone (Somente Números)"
                  type="text" 
                  name="telefone"
                />
              </label>
              <label class="block mt-4 text-sm">
                <span class="text-gray-700 dark:text-gray-400">CPF/CNPJ</span>
                <input
                  class="block w-full mt-1 text-sm dark:border-gray-600 dark:bg-gray-700 focus:border-purple-400 focus:outline-none focus:shadow-outline-purple dark:text-gray-300 dark:focus:shadow-outline-gray form-input"
                  placeholder="(Somente Números)"
                  type="text" 
                  name="cpfcnpj"
                />
              </label>
              <label class="block mt-4 text-sm">
                <span class="text-gray-700 dark:text-gray-400">Email</span>
                <input
                  class="block w-full mt-1 text-sm dark:border-gray-600 dark:bg-gray-700 focus:border-purple-400 focus:outline-none focus:shadow-outline-purple dark:text-gray-300 dark:focus:shadow-outline-gray form-input"
                  placeholder="exemplo@email.com"
                  type="email" 
                  name="email"
                />
              </label>
              <label class="block mt-4 text-sm">
                <span class="text-gray-700 dark:text-gray-400">Senha</span>
                <input
                  class="block w-full mt-1 text-sm dark:border-gray-600 dark:bg-gray-700 focus:border-purple-400 focus:outline-none focus:shadow-outline-purple dark:text-gray-300 dark:focus:shadow-outline-gray form-input"
                  placeholder="***************"
                  type="password"
                  name="senha"
                />
              </label>
              <br>
              <h1
                class="mb-4 text-xl font-semibold text-gray-700 dark:text-gray-200"
              	>
                Informações da empresa
              </h1>
              <label class="block mt-4 text-sm">
                <span class="text-gray-700 dark:text-gray-400">
                  Qual prestador você é?
                </span>
                <select name="prestador"
                  class="block w-full mt-1 text-sm dark:text-gray-300 dark:border-gray-600 dark:bg-gray-700 form-select focus:border-purple-400 focus:outline-none focus:shadow-outline-purple dark:focus:shadow-outline-gray"
                >
				<option selected value="">Selecione</option>
				<option value="0">Sou administrador de uma empresa</option>
				<option value="1">Sou um profissional autonônomo</option>
                </select>
              	</label>
              	
              	<label class="block mt-4 text-sm">
                <span class="text-gray-700 dark:text-gray-400">
                  Como você presta seus serviços?
                </span>
                <select name="fisicoremoto"
                  class="block w-full mt-1 text-sm dark:text-gray-300 dark:border-gray-600 dark:bg-gray-700 form-select focus:border-purple-400 focus:outline-none focus:shadow-outline-purple dark:focus:shadow-outline-gray"
                >
				<option selected value="">Selecione</option>
				<option value="0">Possuo um endereço físico</option>
				<option value="1">Presto meus serviços remotamente</option>
                </select>
              	</label>
              	
              	<label class="block mt-4 text-sm">
                <span class="text-gray-700 dark:text-gray-400">
                  Qual seu ramo de serviço?
                </span>
                <select name="ramo"
                  class="block w-full mt-1 text-sm dark:text-gray-300 dark:border-gray-600 dark:bg-gray-700 form-select focus:border-purple-400 focus:outline-none focus:shadow-outline-purple dark:focus:shadow-outline-gray"
                >
				<option selected value="">Selecione</option>
				<option value="Cabeleireiro">Cabeleireiro</option>
				<option value="Professor">Professor</option>
				<option value="Personal Trainer">Personal Trainer</option>
				<option value="Manicure">Manicure</option>
				<option value="Massagista">Massagista</option>
                </select>
              	</label>  
              	             	           
              <label class="block mt-4 text-sm">
                <span class="text-gray-700 dark:text-gray-400">Nome Fantasia</span>
                <input
                  class="block w-full mt-1 text-sm dark:border-gray-600 dark:bg-gray-700 focus:border-purple-400 focus:outline-none focus:shadow-outline-purple dark:text-gray-300 dark:focus:shadow-outline-gray form-input"
                  placeholder="Esse é o nome que vai aparecer para seus clientes"
                  type="text" 
                  name="nomefant"
                />
              </label>
              <br>
              <h1
                class="mb-4 text-xl font-semibold text-gray-700 dark:text-gray-200"
              	>
                Endereço
              </h1>
              <label class="block mt-4 text-sm">
                <span class="text-gray-700 dark:text-gray-400">Logradouro</span>
                <input
                  class="block w-full mt-1 text-sm dark:border-gray-600 dark:bg-gray-700 focus:border-purple-400 focus:outline-none focus:shadow-outline-purple dark:text-gray-300 dark:focus:shadow-outline-gray form-input"
                  placeholder="Rua/Avenida/Praça"
                  type="text" 
                  name="logradouro"
                />
              </label>
              <label class="block mt-4 text-sm">
                <span class="text-gray-700 dark:text-gray-400">Nº</span>
                <input
                  class="block w-full mt-1 text-sm dark:border-gray-600 dark:bg-gray-700 focus:border-purple-400 focus:outline-none focus:shadow-outline-purple dark:text-gray-300 dark:focus:shadow-outline-gray form-input"
                  placeholder=""
                  type="text" 
                  name="numero"
                />
              </label>
              <label class="block mt-4 text-sm">
                <span class="text-gray-700 dark:text-gray-400">Bairro</span>
                <input
                  class="block w-full mt-1 text-sm dark:border-gray-600 dark:bg-gray-700 focus:border-purple-400 focus:outline-none focus:shadow-outline-purple dark:text-gray-300 dark:focus:shadow-outline-gray form-input"
                  placeholder=""
                  type="text"
                  name="bairro"
                />
              </label>
              <label class="block mt-4 text-sm">
                <span class="text-gray-700 dark:text-gray-400">Cidade</span>
                <input
                  class="block w-full mt-1 text-sm dark:border-gray-600 dark:bg-gray-700 focus:border-purple-400 focus:outline-none focus:shadow-outline-purple dark:text-gray-300 dark:focus:shadow-outline-gray form-input"
                  placeholder=""
                  type="text"
                  name="cidade"
                />
              </label>
              
              <label class="block mt-4 text-sm">
                <span class="text-gray-700 dark:text-gray-400">
                  Estado
                </span>
                <select name="estado"
                  class="block w-full mt-1 text-sm dark:text-gray-300 dark:border-gray-600 dark:bg-gray-700 form-select focus:border-purple-400 focus:outline-none focus:shadow-outline-purple dark:focus:shadow-outline-gray"
                >
				<option value="">Selecione</option>
    			<option value="AC">Acre</option>
    			<option value="AL">Alagoas</option>
    			<option value="AP">Amapá</option>
    			<option value="AM">Amazonas</option>
    			<option value="BA">Bahia</option>
    			<option value="CE">Ceará</option>
    			<option value="DF">Distrito Federal</option>
    			<option value="ES">Espirito Santo</option>
    			<option value="GO">Goiás</option>
    			<option value="MA">Maranhão</option>
    			<option value="MS">Mato Grosso do Sul</option>
    			<option value="MT">Mato Grosso</option>
    			<option value="MG">Minas Gerais</option>
    			<option value="PA">Pará</option>
    			<option value="PB">Paraíba</option>
    			<option value="PR">Paraná</option>
    			<option value="PE">Pernambuco</option>
    			<option value="PI">Piauí</option>
    			<option value="RJ">Rio de Janeiro</option>
    			<option value="RN">Rio Grande do Norte</option>
    			<option value="RS">Rio Grande do Sul</option>
    			<option value="RO">Rondônia</option>
    			<option value="RR">Roraima</option>
    			<option value="SC">Santa Catarina</option>
    			<option value="SP">São Paulo</option>
    			<option value="SE">Sergipe</option>
    			<option value="TO">Tocantins</option>
                </select>
              	</label> 
              	
              <label class="block mt-4 text-sm">
                <span class="text-gray-700 dark:text-gray-400">Complemento</span>
                <input
                  class="block w-full mt-1 text-sm dark:border-gray-600 dark:bg-gray-700 focus:border-purple-400 focus:outline-none focus:shadow-outline-purple dark:text-gray-300 dark:focus:shadow-outline-gray form-input"
                  placeholder=""
                  type="text"
                  name="complemento"
                />
              </label>
              <label class="block mt-4 text-sm">
                <span class="text-gray-700 dark:text-gray-400">CEP</span>
                <input
                  class="block w-full mt-1 text-sm dark:border-gray-600 dark:bg-gray-700 focus:border-purple-400 focus:outline-none focus:shadow-outline-purple dark:text-gray-300 dark:focus:shadow-outline-gray form-input"
                  placeholder="(Somente números)"
                  type="text"
                  name="cep"
                />
              </label>
              	
              <div class="flex mt-6 text-sm">
                <label class="flex items-center dark:text-gray-400">
                  <input
                    type="checkbox"
                    id="checkbox"
                    class="text-purple-600 form-checkbox focus:border-purple-400 focus:outline-none focus:shadow-outline-purple dark:focus:shadow-outline-gray"
                  />
                  <span class="ml-2">
                    Concordo com a 
                    <span class="underline">Política de privacidade</span>
                  </span>
                </label>
              </div>

              <a
                class="block w-full px-4 py-2 mt-4 text-sm font-medium leading-5 text-center text-white transition-colors duration-150 bg-purple-600 border border-transparent rounded-lg active:bg-purple-600 hover:bg-purple-700 focus:outline-none focus:shadow-outline-purple"
                onclick="validarPrestador()"
              >
                Criar conta
              </a>

              <hr class="my-8" />

              <p class="mt-4">
                <a
                  class="text-sm font-medium text-purple-600 dark:text-purple-400 hover:underline"
                  href="telaLogin"
                >
                  Já possui uma conta? Login
                </a>
              </p>
              </form>
            </div>
          </div>
        </div>
      </div>
    </div>
    
  <script src="scripts/validadorCadastroPrestador.js"></script>
  </body>
</html>
