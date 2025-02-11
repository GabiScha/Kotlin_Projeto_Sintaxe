/* . Faça um Programa que peça a temperatura em graus Celsius, transforme
e mostre em graus Fahrenheit. */

fun main() {
   print("Temperatura em Cels: ")
    var cel = readLine()!!.toInt()
   
   
    var res = ( cel * 9/5) + 32
   
    
    print("O em celsius é $res")
}
