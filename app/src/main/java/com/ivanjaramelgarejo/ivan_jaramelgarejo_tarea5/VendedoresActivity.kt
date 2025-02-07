package com.ivanjaramelgarejo.ivan_jaramelgarejo_tarea5

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class VendedoresActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_vendedores)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
        val listaVendedores = listOf(
            Vendedor("Juan Pérez", "Electrodomésticos", R.drawable.vendedor1),
            Vendedor("Ana Gómez", "Moda", R.drawable.vendedor2),
            Vendedor("Carlos Rojas", "Tecnología", R.drawable.vendedor3),
            Vendedor("María López", "Deportes", R.drawable.vendedor4),
            Vendedor("Pedro Martínez", "Muebles", R.drawable.vendedor5)
        )

        val adapter = VendedorAdapter(listaVendedores) { position ->
            if (position == 2) {
                val mediaPlayer = MediaPlayer.create(this, R.raw.sonido_vendedor)
                mediaPlayer.start()
            }
        }
        recyclerVendedores.adapter = adapter
        recyclerVendedores.layoutManager = LinearLayoutManager(this)
    }
}