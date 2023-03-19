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
                        binding.quantityView.text = quantity.toString()
                    }
                }
        }
    }
}