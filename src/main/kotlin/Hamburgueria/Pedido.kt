package Hamburgueria

open class Pedido {

    companion object {

        fun pedidoCliente(cadastro: Cadastro) {

            if (cadastro.primeiraVez) {
                println("Essa é sua primeira compra!")
                println("Você ganhou um Cupcake!")
                cadastro.primeiraVezCliente()
            }

            println("MENU")
            println("Escolha uma opção deliciosa abaixo:")
            println("1 - Combo Salada (x-salada,batata frita,refrigerante lata) ")
            println("2 - Combo Chicken (steak de frango,batata frita,refrigerante lata)")
            println("3 - Combo Tudão (x-tudo,batata frita,refrigerante lata)")
            println("4 - Combo Cheddar (hambúrger,batata frita com cheddar,refrigerante lata)")
            println("5 - Combo Veggie (hambúrguer de soja, batata frita,refrigerante lata")
            println("6 - Sair")
            var opcao = readLine()!!.toInt()

            when (opcao) {

                1 -> {
                    println("Você escolheu o Combo Salada")
                    pagamentoCliente()
                }
                2 -> {
                    println("Você escolheu o Combo Chicken")
                    pagamentoCliente()
                }
                3 -> {
                    println("Você escolheu o Combo Tudão")
                    pagamentoCliente()
                }
                4 -> {
                    println("Você escolheu o Combo Tudão")
                    pagamentoCliente()
                }
                5 -> {
                    println("Você escolheu o Combo Veggie")
                    pagamentoCliente()
                }
                6 -> println("Você saiu! Obrigado")
            }

            while (opcao == 6) {
                break
            }


            while (opcao < 1 || opcao > 6) {
                println("\nOPÇÃO INVALIDA!!!!\n")
                println("\nDigite novamente:\n")
                var opcao = readLine()!!.toInt()


                when (opcao) {

                    1 -> {
                        println("Você escolheu o Combo Salada")
                        pagamentoCliente()
                    }
                    2 -> {
                        println("Você escolheu o Combo Chicken")
                        pagamentoCliente()
                    }
                    3 -> {
                        println("Você escolheu o Combo Tudão")
                        pagamentoCliente()
                    }
                    4 -> {
                        println("Você escolheu o Combo Tudão")
                        pagamentoCliente()
                    }
                    5 -> {
                        println("Você escolheu o Combo Veggie")
                        pagamentoCliente()
                    }
                    6 ->{
                        println("Você saiu! Obrigado")
                        break}
                }

            }
        }


        private fun pagamentoCliente() {
            println("Escolha uma opção de pagamento:")
            println("1 - Dinheiro")
            println("2 - Cartão ou Pix")
            println("3 - Cancelar")
            var opcao = readLine()!!.toInt()

            when (opcao) {
                1 -> troco()
                2 -> cartao()
                3 -> cancelar()
            }

            while (opcao < 1 || opcao > 3) {
                println("\nOPÇÃO INVALIDA!!!!\n")
                println("\nDigite Novamente:\n")
                println("Escolha uma opção de pagamento:")
                println("1 - Dinheiro")
                println("2 - Cartão ou Pix")
                println("3 - Cancelar")
                opcao = readLine()!!.toInt()

                when (opcao) {
                    1 -> troco()
                    2 -> cartao()
                    3 -> cancelar()
                }
            }
        }

        private fun sair() {
            println("Obrigado!")

        }

        private fun cancelar() {
            println("Pedido Cancelado!")
        }

        private fun troco() {
            println("Você vai precisar de troco?")
            println("Informe a opção: ")
            println("1 - Sim")
            println("2 - Não")
            var opc = readLine()!!.toInt()

            when (opc) {
                1 ->{println("Quanto ?")
                    var valor= readLine()!!.toDouble()
                    println("Você pediu troco para ${(valor)}")
                }
                2 -> println("Não")
            }
            println("Pedido recebido!")
            println("Lembre-se de pagar na entrega!")

        }

        private fun cartao() {
            println("Pedido recebido!")
            println("Lembre-se de pagar na entrega!")
        }

    }
}

