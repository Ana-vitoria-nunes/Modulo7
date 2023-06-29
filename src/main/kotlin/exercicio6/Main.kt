package exercicio6

import java.text.DecimalFormat

fun main(){
    println("Digite um valor em dólar: ")
    val resposta= readln().toDouble()
    val convesao= Conversao(resposta).converterDolar()

    println("$resposta dolares convertido para real fica $convesao")
}