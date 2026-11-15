package com.example.domek_inf04

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import android.widget.TextView
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)

        val buttonLike = findViewById<Button>(R.id.buttonLike)
        val buttonDelete = findViewById<Button>(R.id.buttonDelete)
        val textLike = findViewById<TextView>(R.id.textLike)

        var likes = 0

        buttonLike.setOnClickListener {
            likes++
            textLike.text = "$likes polubień"
        }

        buttonDelete.setOnClickListener {
            if (likes > 0) {
                likes --
            }
            textLike.text = "$likes polubień"
        }

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
    }
}