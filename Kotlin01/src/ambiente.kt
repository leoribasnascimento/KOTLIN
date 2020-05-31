import java.time.LocalDateTime

fun main(args: Array<String>) {
   // CÓDIGOS PARA CORES
   val rst:String = "\u001b[00m"
   val bla:String = "\u001b[30m"
   val red:String = "\u001b[31m"
   val gre:String = "\u001b[32m"
   val yel:String = "\u001b[33m"
   val blu:String = "\u001b[34m"
   val mag:String = "\u001b[35m"
   val cya:String = "\u001b[36m"
   val whi:String = "\u001b[37m"

   val dh = LocalDateTime.now()
   println("Dia atual: ${dh.dayOfMonth}")
   println("Mês atual: ${dh.monthValue}")
   println("Ano atual: ${dh.year}")
   println("-----------------")
   println("Hora Atual: ${dh.hour}")
   println("Minuto atual: ${dh.minute}")
   println("Segundo Atual: ${dh.second}")

}



