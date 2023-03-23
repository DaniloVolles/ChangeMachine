package com.example.changemachine

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import com.example.changemachine.databinding.ActivityViewCoinsBinding
import com.google.firebase.firestore.FirebaseFirestore

class ViewCoins : AppCompatActivity() {

    private lateinit var binding: ActivityViewCoinsBinding
    private val db = FirebaseFirestore.getInstance().collection("Coin")

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_view_coins)

        binding = ActivityViewCoinsBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.viewCoins.setOnClickListener {
            db.document("cent100")
                .addSnapshotListener { document, _ ->
                    if (document != null) {
                        val quantity = document.getLong("quantity")
                        binding.quantity100.text = quantity.toString()
                    }
                }
            db.document("cent050")
                .addSnapshotListener { document, _ ->
                    if (document != null) {
                        val quantity = document.getLong("quantity")
                        binding.quantity050.text = quantity.toString()
                    }
                }
            db.document("cent025")
                .addSnapshotListener { document, _ ->
                    if (document != null) {
                        val quantity = document.getLong("quantity")
                        binding.quantity025.text = quantity.toString()
                    }
                }
            db.document("cent010")
                .addSnapshotListener { document, _ ->
                    if (document != null) {
                        val quantity = document.getLong("quantity")
                        binding.quantity010.text = quantity.toString()
                    }
                }
            db.document("cent005")
                .addSnapshotListener { document, _ ->
                    if (document != null) {
                        val quantity = document.getLong("quantity")
                        binding.quantity005.text = quantity.toString()
                    }
                }
            db.document("cent001")
                .addSnapshotListener { document, _ ->
                    if (document != null) {
                        val quantity = document.getLong("quantity")
                        binding.quantity001.text = quantity.toString()
                    }
                }
        }
    }
}