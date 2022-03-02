package com.group3.calculatorapp

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.coroutines.*

@SuppressLint("CustomSplashScreen")
class SplashScreenActivity : AppCompatActivity() {
    private val time = 2000L

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash_screen)
        withCoroutine(time)
    }

    private fun withCoroutine(time: Long) {
        val mScope = CoroutineScope(Dispatchers.IO)
        mScope.launch {
            delay(time)
            withContext(Dispatchers.Main) {
                launchPostSplashActivity()
                mScope.cancel(null)
            }
        }
    }

    private fun launchPostSplashActivity() {
        val intent = Intent(this, MainActivity::class.java)
        startActivity(intent)
        finish()
    }
}