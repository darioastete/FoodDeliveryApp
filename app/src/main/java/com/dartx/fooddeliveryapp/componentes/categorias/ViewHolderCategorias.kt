package com.dartx.fooddeliveryapp.componentes.categorias

import android.view.View
import android.widget.ImageView
import android.widget.TextView
import androidx.appcompat.widget.LinearLayoutCompat
import androidx.constraintlayout.widget.ConstraintLayout
import androidx.recyclerview.widget.RecyclerView
import com.dartx.fooddeliveryapp.R

class ViewHolderCategorias (card: View): RecyclerView.ViewHolder(card) {
    val cardFondo: ConstraintLayout
    val circuloImagen: LinearLayoutCompat
    var categoriaImagen: ImageView
    val nombreCategoria: TextView

    init {
        cardFondo = card.findViewById(R.id.CardCategoriaComponent)
        circuloImagen = card.findViewById(R.id.LinearLayoutCirculo)
        categoriaImagen = card.findViewById(R.id.imageViewIconCategoria)
        nombreCategoria = card.findViewById(R.id.textViewNombreCategoria)
    }
}