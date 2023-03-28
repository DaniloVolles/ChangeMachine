package com.example.changemachine

import android.content.ContentValues
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Toast
import com.example.changemachine.databinding.ActivityChangeBinding
import com.example.changemachine.entity.*
import com.google.firebase.firestore.DocumentReference
import com.google.firebase.firestore.FirebaseFirestore

class Change : AppCompatActivity() {

    private lateinit var binding: ActivityChangeBinding
    private val coinRef = FirebaseFirestore.getInstance().collection("Coin")
    var reference: DocumentReference? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_change)

        binding = ActivityChangeBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.generateChange.setOnClickListener {

            calculateChange()

            coinRef.document("cent100")
                .addSnapshotListener { document, _ ->
                    if (document != null) {
                        val quantity = document.getLong("quantity")
                        binding.quantity100.text = quantity.toString()
                    }
                }

            coinRef.document("cent050")
                .addSnapshotListener { document, _ ->
                    if (document != null) {
                        val quantity = document.getLong("quantity")
                        binding.quantity050.text = quantity.toString()
                    }
                }
        }

    }

    fun countCoin (document: String) {
        coinRef
            .whereEqualTo("quantity", this)
            .get()
            .addOnSuccessListener { result ->
            for (document in result) {
//                Toast.makeText(this, "Moeda encontrada.", Toast.LENGTH_SHORT).show()
                reference = coinRef.document("/Coin/" + document.id)
//                calculateChange(reference!!)
                Log.d(ContentValues.TAG, "${document.id} => ${document.data}")
            }
        }
            .addOnFailureListener { exception ->
                Log.w(ContentValues.TAG, "Error getting documents", exception)
            }
    }

    private fun calculateChange() {

        var quantity100: Long = 100
        var quantity050: Long = 100
        var quantity025: Long = 100
        var quantity010: Long = 100
        var quantity005: Long = 100
        var quantity001: Long = 100

        val providedValue = binding.providedValue.text.toString().toDouble()
        val purchaseValue = binding.purchaseValue.text.toString().toDouble()

        val change = providedValue - purchaseValue
        var coinCounter = 0.00

        if (change != 0.00) {

            while (change > coinCounter) {

                val pointer = change - coinCounter

                while (pointer >= 1.00 && quantity100 != 0L) {
                    coinCounter += 1.00
                    quantity100--
                }
                while (pointer >= 0.50 && quantity050 != 0L) {
                    coinCounter += 0.50
                    quantity050--
                }
                while (pointer >= 0.25 && quantity025 != 0L) {
                    coinCounter += 0.25
                    quantity025--
                }
                while (pointer >= 0.10 && quantity010 != 0L) {
                    coinCounter += 0.10
                    quantity010--
                }
                while (pointer >= 0.05 && quantity005 != 0L) {
                    coinCounter += 0.05
                    quantity005--
                }
                while (pointer >= 0.01 && quantity001 != 0L) {
                    coinCounter += 0.01
                    quantity001--
                }

            }
        }
    }
}