/* Faça um Programa que peça a temperatura em graus Fahrenheit,
transforme e mostre a temperatura em graus Celsius. */

fun main() {
   print("Temperatura em Fahr: ")
    var fahr = readLine()!!.toInt()
   
   
    var res = (fahr - 32) * 5/9
   
    
    print("O em celsius é $res")
}
