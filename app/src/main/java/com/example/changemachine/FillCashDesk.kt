package com.example.changemachine

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.example.changemachine.databinding.ActivityFillCashDeskBinding
import com.example.changemachine.entity.*
import com.google.firebase.firestore.FirebaseFirestore

class FillCashDesk : AppCompatActivity() {

    private lateinit var binding: ActivityFillCashDeskBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_fill_cash_desk)


        binding = ActivityFillCashDeskBinding.inflate(layoutInflater)
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
            Toast.makeText(this, "Moedas adicionadas", Toast.LENGTH_SHORT).show()
            finish()
        }
    }

    private fun save100() {
        val input100 = binding.count100.text.toString().toLong()
        cent100.coinIn("cent100", input100)
    }
    private fun save050() {
        val input050 = binding.count050.text.toString().toLong()
        cent050.coinIn("cent050", input050)
    }
    private fun save025() {
        val input025 = binding.count025.text.toString().toLong()
        cent025.coinIn("cent025", input025)
    }
    private fun save010() {
        val input010 = binding.count010.text.toString().toLong()
        cent010.coinIn("cent010", input010)
    }
    private fun save005() {
        val input005 = binding.count005.text.toString().toLong()
        cent005.coinIn("cent005", input005)
    }
    private fun save001() {
        val input001 = binding.count001.text.toString().toLong()
        cent001.coinIn("cent001", input001)
    }

    private fun display100 (number: Int) {
        if (number < 0) {
            Toast.makeText(this, "O número deve ser positivo", Toast.LENGTH_SHORT).show()
            return
        } else {
            binding.count100.setText("$number")
        }
    }
    private fun display050 (number: Int) {
        if (number < 0) {
            Toast.makeText(this, "O número deve ser positivo", Toast.LENGTH_SHORT).show()
            return
        } else {
            binding.count050.setText("$number")
        }
    }
    private fun display025 (number: Int) {
        if (number < 0) {
            Toast.makeText(this, "O número deve ser positivo", Toast.LENGTH_SHORT).show()
            return
        } else {
            binding.count025.setText("$number")
        }
    }
    private fun display010 (number: Int) {
        if (number < 0) {
            Toast.makeText(this, "O número deve ser positivo", Toast.LENGTH_SHORT).show()
            return
        } else {
            binding.count010.setText("$number")
        }
    }
    private fun display005 (number: Int) {
        if (number < 0) {
            Toast.makeText(this, "O número deve ser positivo", Toast.LENGTH_SHORT).show()
            return
        } else {
            binding.count005.setText("$number")
        }
    }
    private fun display001 (number: Int) {
        if (number < 0) {
            Toast.makeText(this, "O número deve ser positivo", Toast.LENGTH_SHORT).show()
            return
        } else {
            binding.count001.setText("$number")
        }
    }
}