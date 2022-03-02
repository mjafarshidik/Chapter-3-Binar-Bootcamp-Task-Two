package com.group3.calculatorapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val btnMoveToCalculation: Button = findViewById(R.id.btnMoveToCalculation)
        btnMoveToCalculation.setOnClickListener() {
            val moveIntent = Intent(this@MainActivity, CalculationActivity::class.java)
            startActivity(moveIntent)
        }
    }
}