package com.example.changemachine

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.changemachine.ui.fillCashFunction

class FillCashDesk : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_fill_cash_desk)

        fillCashFunction()
    }
}