package com.example.changemachine.entity

class Coin(private val value: Double, private var quantity: Int) {

    fun coinIn () {
        quantity++
    }

    fun coinOut () {
        quantity--
    }

    fun printStatusCoin () {
        println("Valor: $value, Quantidade: $quantity")
    }
}

