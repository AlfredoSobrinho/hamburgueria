package Hamburgueria

open class Cadastro (nome:String, cpf:String,endereco:String,var telefone:String,var email:String):Pessoa(nome,cpf,endereco) {

     var primeiraVez = true

    fun nomeCliente(): String {
        println("Digite o seu nome:")
        var nome = readLine()!!
        return (nome)
    }

    fun enderecoCliente(): String {
        println("Digite o seu endereço:")
        var endereco = readLine()!!
        return (endereco)
    }

    fun telefoneCliente(): String {
        println("Digite o seu telefone:")
        var telefone = readLine()!!
        return (telefone)
    }

    fun emailCliente(): String {
        println("Digite o seu e-mail:")
        var email = readLine()!!
        return (email)
    }

    fun primeiraVezCliente() {
        if(primeiraVez){
            primeiraVez=false
        }
    }
}









