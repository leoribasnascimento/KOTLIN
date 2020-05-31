package exercicios


fun main(args: Array<String>) {

    val nome:String
    val ano_nasc:Int
    val sal:Int
    println()
    println("$red------------------------------------")
    println("       CADASTRO ESTUDONAUTA         ")
    println("------------------------------------")

    print("${rst}Nome do Funcionário: ")
    nome= readLine()!!
    print("Ano de Nascimento: ")
    ano_nasc = readLine()!!.toIntOrNull()?:0
    print("Salário: R$")
    sal = readLine()!!.toIntOrNull()?:0
    println()
    println()
    print("$yel")
    println("---------- FICHA FUNCIONAL ----------")
    println("Nome:           $nome")
    println("Nascimento:     $ano_nasc")
    println("Salário:        R$$sal,00")
    println("-------------------------------------")
}