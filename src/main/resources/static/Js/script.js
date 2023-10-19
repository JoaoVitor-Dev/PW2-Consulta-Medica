let input_paciente = document.getElementById("input-paciente")
let btn_close = document.getElementById("btn-close")
let modal = document.getElementById("modal")
let fundo = document.getElementById("fundo")
let id_paciente = document.getElementById("id-paciente")

input_paciente.addEventListener("keypress", mostraModal)
btn_close.addEventListener("click", fecharModal)

function fecharModal(){
    modal.style.display = "none"
    fundo.style.display = "none"
}

function pegaValor(){
    console.log(input_paciente.value)
}

function mostraModal(){
    console.log(modal)
    modal.style.display = "block"
    fundo.style.display = "flex"
}

function capturaPaciente(id, nome){
    console.log(id)
    id_paciente.value = id
    input_paciente.value = nome
    fecharModal()
}
