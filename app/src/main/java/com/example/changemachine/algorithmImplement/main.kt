package com.example.changemachine.algorithmImplement

fun main() {

    // MOEDAS
//    val cent01 = Coin (0.01)
//    val cent05 = Coin (0.05)
//    val cent10 = Coin (0.10)
//    val cent25 = Coin (0.25)
//    val cent50 = Coin (0.50)
//    val cent100 = Coin (1.00)

    val arrayDeMoedas = arrayOf(1.00, 0.50, 0.25, 0.10, 0.05, 0.01)
    var i = 0
    var grupoMoedas = 0

    // É O PROGRAMA
    println("Seja bem vindo ao sistema de trocos!")

    println("Por favor, informe o valor da sua compra: ")
    val valorCompra = readln().toDouble()

    println("Por favor, informe o valor pago: ")
    val valorPago = readln().toDouble()

    val troco = valorPago - valorCompra

    if (troco != 0.00) {

//        arrayDeMoedas[i]
//
//        while (arrayDeMoedas[i] < troco) {
//            var somaMoedas = arrayDeMoedas[i]
//            i++
//        }

    } else {
        println("Não há troco para essa transação!")
    }

}