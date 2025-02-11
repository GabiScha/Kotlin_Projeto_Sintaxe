/* Programa que peça o raio de um círculo, calcule e mostre sua
área. */

fun main() {
   print("digite o valor do raio ")
    var val1 = readLine()!!.toInt()
   
    var pi = 3.14
    
    var res = pi * (val1 * val1)
    
    print("O resultado é $res")
}
