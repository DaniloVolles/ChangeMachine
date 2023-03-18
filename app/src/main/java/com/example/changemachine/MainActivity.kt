package com.example.changemachine

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

import com.example.changemachine.databinding.ActivityMainBinding
import com.example.changemachine.ui.*

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.viewDB.setOnClickListener {
            val intent = Intent(this,ViewCoins::class.java)
            startActivity(intent)
        }

        binding.fillCashDeskBtn.setOnClickListener {
            val intent = Intent(this, FillCashDesk::class.java)
            startActivity(intent)
        }

        binding.withdrawalBtn.setOnClickListener {
            sangriaFunction()
        }

        binding.changeBtn.setOnClickListener {
            trocoFunction()
        }
    }
}