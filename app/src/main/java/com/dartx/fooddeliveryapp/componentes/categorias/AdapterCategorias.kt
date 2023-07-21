package com.dartx.fooddeliveryapp.componentes.categorias

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.dartx.fooddeliveryapp.R

class AdapterCategorias (val lista: List<String>): RecyclerView.Adapter<ViewHolderCategorias>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolderCategorias {
        var card = LayoutInflater.from(parent.context).inflate(R.layout.card_categorias, parent, false)
        return ViewHolderCategorias(card)
    }

    override fun getItemCount(): Int {
        return lista.count()
    }

    override fun onBindViewHolder(holder: ViewHolderCategorias, position: Int) {
        val item = lista[position]
        holder.nombreCategoria.text = item
    }
}