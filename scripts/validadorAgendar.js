/**
 * 
 */

function validarAgendar(){
	let funcionario = frmAgendar.funcionario.value
	let servico = frmAgendar.servico.value
	let data = frmAgendar.data.value
	let hora = frmAgendar.hora.value
	let idagenda = frmAgendar.idagenda.value
	
	if (funcionario === "") {
		alert('Selecione o campo Funcionário')
		frmAgendar.funcionario.focus()
		return false
	} else if (servico === "") {
		alert('Selecione o campo Serviço')
		frmAgendar.servico.focus()
		return false
	} else if (data === "") {
		alert('Selecione o campo Data')
		frmAgendar.data.focus()
		return false
	} else if (hora === "") {
		alert('Selecione o campo Hora')
		frmAgendar.hora.focus()
		return false
	} else {
		alert('Sua solicitação de agendamento foi enviada com sucesso.')
		document.forms["frmAgendar"].submit()
	}
}