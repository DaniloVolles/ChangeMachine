package com.example.changemachine.entity

// BankNote -> bknt

class BankNote (private val value: Double, private var quantity: Int) {

    fun bkntIn () {
        quantity++
    }

    fun bkntOut () {
        quantity--
    }

    fun printStatusBkNt () {
        println("Valor: $value, Quantidade: $quantity")
    }
}