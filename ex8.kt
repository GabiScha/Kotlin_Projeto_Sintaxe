/*  Programa que pergunte quanto você ganha por hora e o número
de horas trabalhadas no mês. Calcule e mostre o total do seu salário no
referido mês. */

fun main() {
   print("digite o quanto vc ganha por hora ")
    var val1 = readLine()!!.toInt()
   
   print("digite o numero de horas trabalhadas no mês ")
    var val2 = readLine()!!.toInt()
   
    var salario = (val1 * val2)
    
    print("O total do seu salário é $salario")
}
