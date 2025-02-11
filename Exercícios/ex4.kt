/*  Programa que peça as 4 notas bimestrais e mostre a média */

fun main() {
   print("digite o primeiro num: ")
    var val1 = readLine()!!.toInt()
    print("digite o segundo num: ")
    var val2 = readLine()!!.toInt()
    print("digite o terceiro num: ")
    var val3 = readLine()!!.toInt()
    print("digite o quarto num: ")
    var val4 = readLine()!!.toInt()
    
    var res = (val1 + val2 + val3 + val4) / 4
    
    print("O resultado é $res")
}
