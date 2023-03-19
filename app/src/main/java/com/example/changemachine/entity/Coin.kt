package com.example.changemachine.entity

data class Coin(private val value: Double, private var quantity: Long) {

    fun coinIn() {
        quantity++
    }

    fun coinOut() {
        quantity--
    }

    fun printStatus() {
        println("Value: $value, Quantity: $quantity")
    }
}

