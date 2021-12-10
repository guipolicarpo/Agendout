/**
 * Validação de Cadastro
 */

function validarCliente() {
	let nome = frmCadastro.nome.value
	let email = frmCadastro.email.value
	let telefone = frmCadastro.telefone.value
	let senha = frmCadastro.senha.value
	let checkbox = frmCadastro.checkbox.value
	
	if (nome === "") {
		alert('Preencha o campo Nome')
		frmCadastro.nome.focus()
		return false
	} else if (telefone === "") {
		alert('Preencha o campo Telefone')
		frmCadastro.telefone.focus()
		return false
	} else if (email === "") {
		alert('Preencha o campo Email')
		frmCadastro.email.focus()
		return false
	} else if (senha === "") {
		alert('Preencha o campo Senha')
		frmCadastro.senha.focus()
		return false
	} else if (document.getElementById("checkbox").checked == false) {
		alert('Aceite os termos de Política de privacidade!')
		frmCadastro.checkbox.focus()
		return false
	} else {
		alert('Cadastrado com sucesso! Vamos te redirecionar para a página de Login.')
		document.forms["frmCadastro"].submit()	
	}
}