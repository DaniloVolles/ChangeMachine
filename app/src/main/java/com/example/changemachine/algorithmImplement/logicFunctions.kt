package com.example.changemachine.algorithmImplement

import com.example.changemachine.entity.Coin

fun main() {

    // MOEDAS
    val cent001 = Coin (0.01, 100)
    val cent005 = Coin (0.05, 100)
    val cent010 = Coin (0.10, 100)
    val cent025 = Coin (0.25, 100)
    val cent050 = Coin (0.50, 100)
    val cent100 = Coin (1.00, 100)

    val arrayDeMoedas = arrayOf(cent100, cent050, cent025, cent010, cent005, cent001)
//    val arrayDeMoedas = arrayOf(1.00, 0.50, 0.25, 0.10, 0.05, 0.01)
//    var i = 0
    var grupoMoedas = 0

    // É O PROGRAMA
    println("Seja bem vindo ao sistema de trocos!")

    println("Por favor, informe o valor da sua compra: ")
    val valorCompra = readln().toDouble()

    println("Por favor, informe o valor pago: ")
    val valorPago = readln().toDouble()

    val troco = valorPago - valorCompra // ** out: 1.25 **
    var somaDeMoedas = 0.00
    var i = 0

    if (troco != 0.00) {

        // O troco deve necessariamente ser menor do que a soma de moedas para incluir um novo valor.
        // O índice do array nunca pode ser maior do que o número de ítens desse array.
        while (troco > somaDeMoedas && i <= arrayDeMoedas.size - 1) {

            val indicador = troco - somaDeMoedas
//            somaDeMoedas += arrayDeMoedas[i]

            if (indicador >= 1.00) {
                cent100.coinOut()
                cent100.printStatus()
            } else if (indicador >= 0.50) {
                cent050.coinOut()
                cent050.printStatus()
            } else if (indicador >= 0.25) {
                cent025.coinOut()
                cent025.printStatus()
            } else if (indicador >= 0.10) {
                cent010.coinOut()
                cent010.printStatus()
            } else if (indicador >= 0.05) {
                cent005.coinOut()
                cent005.printStatus()
            } else if (indicador >= 0.01) {
                cent001.coinOut()
                cent001.printStatus()
            }

        }

        cent100.printStatus()

        println("O seu troco será: $somaDeMoedas")
        println("A quantidade de moedas é ")

    } else {
        println("Não há troco para essa transação!")
    }



}