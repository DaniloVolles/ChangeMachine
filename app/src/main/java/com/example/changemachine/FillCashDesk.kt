package com.example.changemachine

/*
Aqui nessa página, eu precisei misturar o lambda com o formato padrão da "findView" por que
estava dando um problema de tipo nas "funções" de increase/decrease de cada moeda.
Consegui resolver. Caso eu tenha sucesso e bem-ventura no tempo, pretendo olhar com mais
calma para a lógica desta activity.
 */

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import com.example.changemachine.databinding.ActivityFillCashDeskBinding
import com.google.firebase.firestore.FieldValue
import com.google.firebase.firestore.FirebaseFirestore

class FillCashDesk : AppCompatActivity() {

    private lateinit var binding: ActivityFillCashDeskBinding
    private val db = FirebaseFirestore.getInstance()


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