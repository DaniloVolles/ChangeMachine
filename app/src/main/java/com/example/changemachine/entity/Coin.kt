package com.example.changemachine.entity

import android.util.Log
import com.google.firebase.firestore.FieldValue
import com.google.firebase.firestore.FirebaseFirestore

data class Coin(

    private val value: Double,
    private var quantity: Long

    ) {

    private val db = FirebaseFirestore.getInstance()

    fun coinIn (objectDBCoin: String, inputCoin: Long, amount: Long) {

        db.collection("Coin").document(objectDBCoin)
            .update(
                "quantity",
                FieldValue.increment(inputCoin*amount)
            ).addOnCompleteListener {
                Log.d("db", "Valor atualizado com sucesso")
            }
    }

    fun coinOut(objectDBCoin: String, inputCoin: Long, amount: Long) {

        db.collection("Coin").document(objectDBCoin)
            .update(
                "quantity",
                FieldValue.increment(-inputCoin*amount)
            ).addOnCompleteListener {
                Log.d("db", "Valor atualizado com sucesso")
            }
    }

    fun printStatus() {
        println("Value: $value, Quantity: $quantity")
    }

}

