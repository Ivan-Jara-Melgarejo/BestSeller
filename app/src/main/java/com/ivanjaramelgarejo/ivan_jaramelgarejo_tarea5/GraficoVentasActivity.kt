package com.ivanjaramelgarejo.ivan_jaramelgarejo_tarea5

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class GraficoVentasActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        val entries = listOf(BarEntry(0f, 50f), BarEntry(1f, 80f), BarEntry(2f, 120f))
        val dataSet = BarDataSet(entries, "Ventas")
        val data = BarData(dataSet)

        barChart.data = data
        barChart.invalidate()
    }
}