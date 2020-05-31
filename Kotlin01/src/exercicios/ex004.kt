package exercicios

fun main(args: Array<String>) {

    val v1:Int
    val v2:Int

    println("$red")
    println("--------------------------------------")
    println("             DOIS VALORES             ")
    println("--------------------------------------")

    println("$rst")
    print("Valor 1: ")
    v1 = readLine()!!.toInt()
    print("Valor 2: ")
    v2 = readLine()!!.toInt()

    println("$yel")
    println("------------- RESULTADOS -------------")
    println("Soma:           $blu $v1 + $v2 = $yel${v1.plus(v2)}")
    println("Subtração:      $blu $v1 - $v2 = $yel${v1.minus(v2)}")
    println("Multiplicação:  $blu $v1 * $v2 = $yel${v1.times(v2)}")
    println("Divisão:        $blu $v1 / $v2 = $yel${v1.div(v2.toFloat())}")
    println("Módulo:         $blu $v1 % $v2 = $yel${v1.rem(v2)}")
    println("--------------------------------------")



}