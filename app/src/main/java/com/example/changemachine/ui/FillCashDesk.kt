package com.example.changemachine.ui

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.EditText
import android.widget.Toast
import com.example.changemachine.Constants
import com.example.changemachine.R
import com.example.changemachine.databinding.ActivityFillCashDeskBinding
import com.example.changemachine.entity.*

class FillCashDesk : AppCompatActivity(), View.OnClickListener {

    private lateinit var binding: ActivityFillCashDeskBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_fill_cash_desk)


        binding = ActivityFillCashDeskBinding.inflate(layoutInflater)
        setContentView(binding.root)

        buttonsBinding()
    }

    override fun onClick(view: View) {
        when (view.id) {
            // 001
            R.id.btn001Plus  -> display(binding.count001, binding.count001.text.toString().toInt() + 1)
            R.id.btn001Minus -> display(binding.count001, binding.count001.text.toString().toInt() - 1)
            // 005
            R.id.btn005Plus  -> display(binding.count005, binding.count005.text.toString().toInt() + 1)
            R.id.btn005Minus -> display(binding.count005, binding.count005.text.toString().toInt() - 1)
            // 010
            R.id.btn010Plus  -> display(binding.count010, binding.count010.text.toString().toInt() + 1)
            R.id.btn010Minus -> display(binding.count010, binding.count010.text.toString().toInt() - 1)
            // 025
            R.id.btn025Plus  -> display(binding.count025, binding.count025.text.toString().toInt() + 1)
            R.id.btn025Minus -> display(binding.count025, binding.count025.text.toString().toInt() - 1)
            // 050
            R.id.btn050Plus  -> display(binding.count050, binding.count050.text.toString().toInt() + 1)
            R.id.btn050Minus -> display(binding.count050, binding.count050.text.toString().toInt() - 1)
            // 100
            // R.id.btn100Plus -> display100(binding.count100.text.toString().toInt() + 1)
            R.id.btn100Minus -> display(binding.count100, binding.count100.text.toString().toInt() - 1)
            R.id.btn100Plus -> display(
                binding.count100,
                binding.count100.text.toString().toInt() + 1
            )
            // Save
            R.id.saveBtn -> {
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
    }

    //    private fun handleCount(text: EditText, operation: Int) {
//        if (operation == Constants.OPERATION.MINUS) {
//            display(text.toString().toInt() - 1, 9)
//        }
//    }
//
    private fun display(text: EditText, number: Int) {
        if (number < 0) {
            Toast.makeText(this, R.string.must_positive, Toast.LENGTH_SHORT).show()
        } else {
            text.setText("$number")
        }
    }


    private fun display100(number: Int) {
        if (number < 0) {
            Toast.makeText(this, "O número deve ser positivo", Toast.LENGTH_SHORT).show()
            return
        } else {
            binding.count100.setText("$number")
        }
    }

    private fun display050(number: Int) {
        if (number < 0) {
            Toast.makeText(this, "O número deve ser positivo", Toast.LENGTH_SHORT).show()
            return
        } else {
            binding.count050.setText("$number")
        }
    }

    private fun display025(number: Int) {
        if (number < 0) {
            Toast.makeText(this, "O número deve ser positivo", Toast.LENGTH_SHORT).show()
            return
        } else {
            binding.count025.setText("$number")
        }
    }

    private fun display010(number: Int) {
        if (number < 0) {
            Toast.makeText(this, "O número deve ser positivo", Toast.LENGTH_SHORT).show()
            return
        } else {
            binding.count010.setText("$number")
        }
    }

    private fun display005(number: Int) {
        if (number < 0) {
            Toast.makeText(this, "O número deve ser positivo", Toast.LENGTH_SHORT).show()
            return
        } else {
            binding.count005.setText("$number")
        }
    }

    private fun display001(number: Int) {
        if (number < 0) {
            Toast.makeText(this, "O número deve ser positivo", Toast.LENGTH_SHORT).show()
            return
        } else {
            binding.count001.setText("$number")
        }
    }

    private fun buttonsBinding() {
        // R$1.00
        binding.btn100Plus.setOnClickListener(this)
        binding.btn100Minus.setOnClickListener(this)
        binding.count100.setOnClickListener(this)

        // R$0.50
        binding.btn050Plus.setOnClickListener(this)
        binding.btn050Minus.setOnClickListener(this)
        binding.count050.setOnClickListener(this)

        // R$0.25
        binding.btn025Plus.setOnClickListener(this)
        binding.btn025Minus.setOnClickListener(this)
        binding.count025.setOnClickListener(this)

        // R$0.10
        binding.btn010Plus.setOnClickListener(this)
        binding.btn010Minus.setOnClickListener(this)
        binding.count010.setOnClickListener(this)

        // R$0.05
        binding.btn005Plus.setOnClickListener(this)
        binding.btn005Minus.setOnClickListener(this)
        binding.count005.setOnClickListener(this)

        // R$0.01
        binding.btn001Plus.setOnClickListener(this)
        binding.btn001Minus.setOnClickListener(this)
        binding.count001.setOnClickListener(this)

        // Salvar
        binding.saveBtn.setOnClickListener(this)
    }

    private fun save100() {
        TODO()
    }

    private fun save050() {
        TODO()
    }

    private fun save025() {
        TODO()
    }

    private fun save010() {
        TODO()
    }

    private fun save005() {
        TODO()
    }

    private fun save001() {
        TODO()
    }
}
