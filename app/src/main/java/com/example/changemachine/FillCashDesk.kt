package com.example.changemachine

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.EditText
import com.example.changemachine.databinding.ActivityFillCashDeskBinding
import com.example.changemachine.entity.cent100
import com.google.firebase.firestore.FieldValue
import com.google.firebase.firestore.FirebaseFirestore

class FillCashDesk : AppCompatActivity() {

    private lateinit var count100ET: EditText
    private lateinit var count050ET: EditText
    private lateinit var count025ET: EditText
    private lateinit var count010ET: EditText
    private lateinit var count005ET: EditText
    private lateinit var count001ET: EditText

    private lateinit var binding: ActivityFillCashDeskBinding
    private val db = FirebaseFirestore.getInstance()


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_fill_cash_desk)


        binding = ActivityFillCashDeskBinding.inflate(layoutInflater)
        setContentView(binding.root)

        // R$1.00
        count100ET = findViewById(R.id.count100)

        binding.btn100Plus.setOnClickListener {
            display100(count100ET.text.toString().toInt() + 1)
        }
        binding.btn100Minus.setOnClickListener {
            display100(count100ET.text.toString().toInt() - 1)
        }

        // R$0.50
        count050ET = findViewById(R.id.count050)

        binding.btn050Plus.setOnClickListener {
            display050(count050ET.text.toString().toInt() + 1)
        }
        binding.btn050Minus.setOnClickListener {
            display050(count050ET.text.toString().toInt() - 1)
        }

        // R$0.25
        count025ET = findViewById(R.id.count025)

        binding.btn025Plus.setOnClickListener {
            display025(count025ET.text.toString().toInt() + 1)
        }
        binding.btn025Minus.setOnClickListener {
            display025(count025ET.text.toString().toInt() - 1)
        }

        // R$0.10
        count010ET = findViewById(R.id.count010)

        binding.btn010Plus.setOnClickListener {
            display010(count010ET.text.toString().toInt() + 1)
        }
        binding.btn010Minus.setOnClickListener {
            display010(count010ET.text.toString().toInt() - 1)
        }

        // R$0.05
        count005ET = findViewById(R.id.count005)

        binding.btn005Plus.setOnClickListener {
            display005(count005ET.text.toString().toInt() + 1)
        }
        binding.btn005Minus.setOnClickListener {
            display005(count005ET.text.toString().toInt() - 1)
        }

        // R$0.01
        count001ET = findViewById(R.id.count001)

        binding.btn001Plus.setOnClickListener {
            display001(count001ET.text.toString().toInt() + 1)
        }
        binding.btn001Minus.setOnClickListener {
            display001(count001ET.text.toString().toInt() - 1)
        }

        // Salvar
        binding.saveBtn.setOnClickListener {
            db.collection("Coin").document("cent100")
                .update(
                    "quantity",
                    FieldValue.increment(10)
                ).addOnCompleteListener {
                    Log.d("db", "Valor atualizado com sucesso")
                }
        }
    }

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