package com.example.changemachine.ui

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast
import com.example.changemachine.R
import com.example.changemachine.databinding.ActivityWithdrawalBinding
import com.example.changemachine.entity.*

class Withdrawal : AppCompatActivity(), View.OnClickListener {

    private lateinit var binding: ActivityWithdrawalBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_withdrawal)

        binding = ActivityWithdrawalBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btn001Minus.setOnClickListener(this)
        binding.btn001Plus.setOnClickListener(this)

        binding.btn005Minus.setOnClickListener(this)
        binding.btn005Plus.setOnClickListener(this)

        binding.btn010Minus.setOnClickListener(this)
        binding.btn010Plus.setOnClickListener(this)

        binding.btn025Minus.setOnClickListener(this)
        binding.btn025Plus.setOnClickListener(this)

        binding.btn050Minus.setOnClickListener(this)
        binding.btn050Plus.setOnClickListener(this)

        binding.btn100Minus.setOnClickListener(this)
        binding.btn100Plus.setOnClickListener(this)


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

    override fun onClick(view: View) {
        when(view.id) {
            R.id.btn001Plus -> textCountPlus(binding.count001)
            R.id.btn001Minus -> textCountMinus(binding.count001)

            R.id.btn005Plus -> textCountPlus(binding.count005)
            R.id.btn005Minus -> textCountMinus(binding.count005)

            R.id.btn010Plus -> textCountPlus(binding.count010)
            R.id.btn010Minus -> textCountMinus(binding.count010)

            R.id.btn025Plus -> textCountPlus(binding.count025)
            R.id.btn025Minus -> textCountMinus(binding.count025)

            R.id.btn050Plus -> textCountPlus(binding.count050)
            R.id.btn050Minus -> textCountMinus(binding.count050)

            R.id.btn100Plus -> textCountPlus(binding.count100)
            R.id.btn100Minus -> textCountMinus(binding.count100)
        }
    }

    private fun textCountPlus (view: View): Int {
        return view.id.toString().toInt() - 1
    }

    private fun textCountMinus (view: View): Int {
        return view.id.toString().toInt() + 1
    }

    // Save Functions

    private fun saveCoin (view: View){

    }

    private fun save100() {
        val input100 = binding.count100.text.toString().toLong()
        cent100.coinOut("cent100", input100)
    }
    private fun save050() {
        val input050 = binding.count050.text.toString().toLong()
        cent050.coinOut("cent050", input050)
    }
    private fun save025() {
        val input025 = binding.count025.text.toString().toLong()
        cent025.coinOut("cent025", input025)
    }
    private fun save010() {
        val input010 = binding.count010.text.toString().toLong()
        cent010.coinOut("cent010", input010)
    }
    private fun save005() {
        val input005 = binding.count005.text.toString().toLong()
        cent005.coinOut("cent005", input005)
    }
    private fun save001() {
        val input001 = binding.count001.text.toString().toLong()
        cent001.coinOut("cent001", input001)
    }

    // Display functions
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