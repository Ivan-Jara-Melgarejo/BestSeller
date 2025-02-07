package com.ivanjaramelgarejo.ivan_jaramelgarejo_tarea5

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class VendedorAdapter(private val vendedores: List<Vendedor>, private val onClick: (Int) -> Unit) :
    RecyclerView.Adapter<VendedorAdapter.VendedorViewHolder>() {

    class VendedorViewHolder(view: View) : RecyclerView.ViewHolder(view) {
        val nombre: TextView = view.findViewById(R.id.txtNombre)
        val area: TextView = view.findViewById(R.id.txtArea)
        val foto: ImageView = view.findViewById(R.id.imgVendedor)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): VendedorViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.item_vendedor, parent, false)
        return VendedorViewHolder(view)
    }

    override fun onBindViewHolder(holder: VendedorViewHolder, position: Int) {
        val vendedor = vendedores[position]
        holder.nombre.text = vendedor.nombre
        holder.area.text = vendedor.area
        holder.foto.setImageResource(vendedor.foto)

        holder.itemView.setOnClickListener { onClick(position) }
    }

    override fun getItemCount() = vendedores.size
}