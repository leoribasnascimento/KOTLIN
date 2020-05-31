package exercicios

fun main(args: Array<String>) {

    val n1:Float
    val n2:Float

    println("$red")
    println("--------------------------------------")
    println("           NOTAS ESTUDONAUTA          ")
    println("--------------------------------------")

    println("$rst")
    print("Nota 1: ")
    n1 = readLine()!!.toFloat()
    print("Nota 2: ")
    n2 = readLine()!!.toFloat()

    println("$yel")
    println("------------- RESULTADOS -------------")
    println("As notas do aluno foram $n1 e $n2.")
    println("A média final foi ${(n1.plus(n2))/2}.")
    println("--------------------------------------")


}