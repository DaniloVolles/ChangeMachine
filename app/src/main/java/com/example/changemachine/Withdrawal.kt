package com.example.changemachine

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Toast
import com.example.changemachine.databinding.ActivityWithdrawalBinding
import com.example.changemachine.entity.*
import com.google.firebase.firestore.FieldValue
import com.google.firebase.firestore.FirebaseFirestore

class Withdrawal : AppCompatActivity() {

    private lateinit var binding: ActivityWithdrawalBinding
    private val db = FirebaseFirestore.getInstance()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_withdrawal)

        binding = ActivityWithdrawalBinding.inflate(layoutInflater)
        setContentView(binding.root)

        // R$1.00
        binding.btn100Plus.setOnClickListener {
            display100(binding.count100.text.toString().toInt() + 1)
        }
        binding.btn100Minus.setOnClickListener {
            display100(binding.count100.text.toString().toInt() - 1)
        }

        // R$0.50

        binding.btn050Plus.setOnClickListener {
            display050(binding.count050.text.toString().toInt() + 1)
        }
        binding.btn050Minus.setOnClickListener {
            display050(binding.count050.text.toString().toInt() - 1)
        }

        // R$0.25

        binding.btn025Plus.setOnClickListener {
            display025(binding.count025.text.toString().toInt() + 1)
        }
        binding.btn025Minus.setOnClickListener {
            display025(binding.count025.text.toString().toInt() - 1)
        }

        // R$0.10

        binding.btn010Plus.setOnClickListener {
            display010(binding.count010.text.toString().toInt() + 1)
        }
        binding.btn010Minus.setOnClickListener {
            display010(binding.count010.text.toString().toInt() - 1)
        }

        // R$0.05

        binding.btn005Plus.setOnClickListener {
            display005(binding.count005.text.toString().toInt() + 1)
        }
        binding.btn005Minus.setOnClickListener {
            display005(binding.count005.text.toString().toInt() - 1)
        }

        // R$0.01

        binding.btn001Plus.setOnClickListener {
            display001(binding.count001.text.toString().toInt() + 1)
        }
        binding.btn001Minus.setOnClickListener {
            display001(binding.count001.text.toString().toInt() - 1)
        }

        // Salvar
        binding.saveBtn.setOnClickListener {
            save100()
            save050()
            save025()
            save010()
            save005()
            save001()
            Toast.makeText(this, "Moedas sacadas", Toast.LENGTH_SHORT).show()
        }
    }


    // Save Functions
    private fun save100() {
        val input100 = binding.count100.text.toString().toLong()
        cent100.coinOut("cent100", input100, 1)
    }
    private fun save050() {
        val input050 = binding.count050.text.toString().toLong()
        cent050.coinOut("cent050", input050, 1)
    }
    private fun save025() {
        val input025 = binding.count025.text.toString().toLong()
        cent025.coinOut("cent025", input025, 1)
    }
    private fun save010() {
        val input010 = binding.count010.text.toString().toLong()
        cent010.coinOut("cent010", input010, 1)
    }
    private fun save005() {
        val input005 = binding.count005.text.toString().toLong()
        cent005.coinOut("cent005", input005, 1)
    }
    private fun save001() {
        val input001 = binding.count001.text.toString().toLong()
        cent001.coinOut("cent001", input001, 1)
    }

    // Display functions
    private fun display100 (number: Int) {
        binding.count100.setText("$number")
    }
    private fun display050 (number: Int) {
        binding.count050.setText("$number")
    }
    private fun display025 (number: Int) {
        binding.count025.setText("$number")
    }
    private fun display010 (number: Int) {
        binding.count010.setText("$number")
    }
    private fun display005 (number: Int) {
        binding.count005.setText("$number")
    }
    private fun display001 (number: Int) {
        binding.count001.setText("$number")
    }
}