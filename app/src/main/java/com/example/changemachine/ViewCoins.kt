package com.example.changemachine

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.changemachine.databinding.ActivityFillCashDeskBinding
import com.example.changemachine.databinding.ActivityViewCoinsBinding
import com.example.changemachine.ui.viewDBFunction
import com.google.firebase.firestore.FirebaseFirestore

class ViewCoins : AppCompatActivity() {

    private lateinit var binding: ActivityViewCoinsBinding
    private val db = FirebaseFirestore.getInstance()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_view_coins)

        binding = ActivityViewCoinsBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.viewCoins.setOnClickListener {
            db.collection("Coin").document("cent100")
                .addSnapshotListener { document, _ ->
                    if (document != null) {
                        val quantity = document.getLong("quantity")
                        binding.quantity100.text = quantity.toString()
                    }
                }
            db.collection("Coin").document("cent050")
                .addSnapshotListener { document, _ ->
                    if (document != null) {
                        val quantity = document.getLong("quantity")
                        binding.quantity050.text = quantity.toString()
                    }
                }
            db.collection("Coin").document("cent025")
                .addSnapshotListener { document, _ ->
                    if (document != null) {
                        val quantity = document.getLong("quantity")
                        binding.quantity025.text = quantity.toString()
                    }
                }
            db.collection("Coin").document("cent010")
                .addSnapshotListener { document, _ ->
                    if (document != null) {
                        val quantity = document.getLong("quantity")
                        binding.quantity010.text = quantity.toString()
                    }
                }
            db.collection("Coin").document("cent005")
                .addSnapshotListener { document, _ ->
                    if (document != null) {
                        val quantity = document.getLong("quantity")
                        binding.quantity005.text = quantity.toString()
                    }
                }
            db.collection("Coin").document("cent001")
                .addSnapshotListener { document, _ ->
                    if (document != null) {
                        val quantity = document.getLong("quantity")
                        binding.quantity001.text = quantity.toString()
                    }
                }
        }
    }
}