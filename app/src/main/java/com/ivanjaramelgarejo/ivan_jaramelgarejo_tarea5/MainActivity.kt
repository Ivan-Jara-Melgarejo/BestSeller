package com.ivanjaramelgarejo.ivan_jaramelgarejo_tarea5

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btnVendedores = findViewById<Button>(R.id.btnVendedores)
        val btnCapturarFoto = findViewById<Button>(R.id.btnCapturarFoto)
        val btnGraficoVentas = findViewById<Button>(R.id.btnGraficoVentas)

        btnVendedores.setOnClickListener {
            startActivity(Intent(this, VendedoresActivity::class.java))
        }

        btnCapturarFoto.setOnClickListener {
            startActivity(Intent(this, CapturaFotoActivity::class.java))
        }

        btnGraficoVentas.setOnClickListener {
            startActivity(Intent(this, GraficoVentasActivity::class.java))
        }
    }
}