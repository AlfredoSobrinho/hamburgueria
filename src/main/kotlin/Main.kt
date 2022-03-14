import Hamburgueria.*

fun main() {

    println("Bem -vindo a Hambúrgueria DEV BURGUERS!")
    println("Digite seu nome: ")
    var nome=readLine()!!
    println("Digite seu CPF: ")
    var cpf=readLine()!!
    println("Digite seu endereço: ")
    var endereco=readLine()!!
    println("Digite seu telefone: ")
    var telefone=readLine()!!
    println("Digite seu e-mail: ")
    var email=readLine()!!


    var etapa1 = Cadastro(nome,cpf,endereco,telefone,email)

    println("\n")

    Pedido.pedidoCliente(etapa1)

}