/**
 * 
 */

function validarPrestador() {
	let nome = frmCadastroPrest.nome.value
	let telefone = frmCadastroPrest.telefone.value
	let cpfcnpj = frmCadastroPrest.cpfcnpj.value
	let email = frmCadastroPrest.email.value
	let senha = frmCadastroPrest.senha.value
	
	
	let prestador = frmCadastroPrest.prestador.value
	let fisicoremoto = frmCadastroPrest.fisicoremoto.value
	let ramo = frmCadastroPrest.ramo.value
	let nomefant = frmCadastroPrest.nomefant.value
	
	let logradouro = frmCadastroPrest.logradouro.value
	let numero = frmCadastroPrest.numero.value
	let bairro = frmCadastroPrest.bairro.value
	let cidade = frmCadastroPrest.cidade.value
	let estado = frmCadastroPrest.estado.value
	let complemento = frmCadastroPrest.complemento.value
	let cep = frmCadastroPrest.cep.value
	
	let checkbox = frmCadastroPrest.checkbox.value
	
	alert('Cadastrado com sucesso! Vamos te redirecionar para a página de Login.')
	document.forms["frmCadastroPrest"].submit()	
	
	/**
	if (prestador === "") {
		alert('Preencha o campo Tipo de Prestador')
		frmCadastroPrest.prestador.focus()
		return false
	} else if (fisicoremoto === "") {
		alert('Preencha o campo de como presta seu serviço')
		frmCadastroPrest.fisicoremoto.focus()
		return false
	} else if (nome === "") {
		alert('Preencha o campo Nome')
		frmCadastroPrest.nome.focus()
		return false
	} else if (telefone === "") {
		alert('Preencha o campo Telefone')
		frmCadastroPrest.telefone.focus()
		return false
	} else if (cpfcnpj === "") {
		alert('Preencha o campo CPF/CNPJ')
		frmCadastroPrest.cpfcnpj.focus()
		return false
	} else if (email === "") {
		alert('Preencha o campo Email')
		frmCadastroPrest.email.focus()
		return false
	} else if (senha === "") {
		alert('Preencha o campo Senha')
		frmCadastroPrest.senha.focus()
		return false
	} else if (ramo === "") {
		alert('Preencha o campo Ramo')
		frmCadastroPrest.ramo.focus()
		return false
	} else if (nomefant === "") {
		alert('Preencha o campo Nome Fantasia')
		frmCadastroPrest.nomefant.focus()
		return false
	} else if (document.getElementById("checkbox").checked == false) {
		alert('Aceite os termos de Política de privacidade!')
		frmCadastroPrest.checkbox.focus()
		return false
	} else {
		alert('Cadastrado com sucesso! Vamos te redirecionar para a página de Login.')
		document.forms["frmCadastroPrest"].submit()	
	}
	*/
}