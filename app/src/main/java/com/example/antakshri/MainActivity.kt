package com.example.antakshri

import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    private lateinit var changeButton: Button
    private lateinit var textView: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val closeButton: Button = findViewById(R.id.closeButton)
        closeButton.setOnClickListener {
            finish() // Close the activity (and the app)
        }

        changeButton = findViewById(R.id.changeButton)
        textView = findViewById(R.id.textView)

        changeButton.setOnClickListener {
            val randomChar = generateRandomCapitalChar()
            textView.text = randomChar.toString()
        }
    }

    private fun generateRandomCapitalChar(): Char {
        val uppercaseStart = 'A'.toInt()
        val uppercaseEnd = 'Z'.toInt()
        val randomAscii = (uppercaseStart..uppercaseEnd).random()
        return randomAscii.toChar()
    }
}
