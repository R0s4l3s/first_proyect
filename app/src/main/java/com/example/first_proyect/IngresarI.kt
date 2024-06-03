package com.example.first_proyect

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.ImageButton
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class IngresarI : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_ingresar_i)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
        val btnS: Button = findViewById(R.id.siguienteBI)
        btnS.setOnClickListener {
            val intent: Intent = Intent(this, Sistema_P::class.java)
            startActivity(intent)
        }
        val btnU: ImageButton = findViewById(R.id.bottonU)
        btnU.setOnClickListener{
            val intent: Intent = Intent(this, Eusuario::class.java)
            startActivity(intent)
        }
        val btnA: ImageButton = findViewById(R.id.bottonA)
        btnA.setOnClickListener{
            val intent: Intent = Intent(this, Ajustes::class.java)
            startActivity(intent)
        }
    }
}