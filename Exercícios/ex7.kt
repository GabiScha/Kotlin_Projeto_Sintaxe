/* Programa que calcule a área de um quadrado, em seguida mostre
o dobro desta área para o usuário. */

fun main() {
   print("digite o valor lado ")
    var val1 = readLine()!!.toInt()
   
    var area = (val1 * val1)
    
    var res = area * 2
    
    print("O resultado é $res")
}