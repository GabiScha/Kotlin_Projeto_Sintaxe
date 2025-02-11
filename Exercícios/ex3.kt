/*  Programa que peça dois números e imprima a soma */

fun main() {
    print("digite o primeiro num: ")
    var val1 = readLine()!!.toInt()
    print("digite o segundo num: ")
    var val2 = readLine()!!.toInt()
    
    var res = val1 + val2
    
    print("O resultado é $res")
}