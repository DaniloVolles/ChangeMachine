package com.example.changemachine.entity

import android.util.Log
import com.google.firebase.firestore.FieldValue
import com.google.firebase.firestore.FirebaseFirestore

data class Coin(

    private val value: Double,
//    private var quantity: Long

    ) {

    private val db = FirebaseFirestore.getInstance()
    private val coinRef = db.collection("Coin")

    fun coinIn (objectDBCoin: String, inputCoin: Long) {

        coinRef.document(objectDBCoin)
            .update(
                "quantity",
                FieldValue.increment(inputCoin)
            ).addOnCompleteListener {
                Log.d("db", "Valor atualizado com sucesso")
            }
    }

    fun coinOut(objectDBCoin: String, inputCoin: Long) {

        coinRef.document(objectDBCoin)
            .update(
                "quantity",
                FieldValue.increment(-inputCoin)
            ).addOnCompleteListener {
                Log.d("db", "Valor atualizado com sucesso")
            }
    }
}

