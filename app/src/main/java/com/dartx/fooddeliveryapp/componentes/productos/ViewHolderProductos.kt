package com.dartx.fooddeliveryapp.componentes.productos

import android.view.View
import android.widget.ImageView
import android.widget.TextView
import androidx.appcompat.widget.LinearLayoutCompat
import androidx.constraintlayout.widget.ConstraintLayout
import androidx.recyclerview.widget.RecyclerView
import com.dartx.fooddeliveryapp.R

class ViewHolderProductos (card: View): RecyclerView.ViewHolder(card) {
    val productoImagen: ImageView
    val productoNombre: TextView
    var productoCategoria: TextView
    val productoPrecioDescuento: TextView
    val productoPrecioRegular: TextView
    val productoDescPorcentaje: TextView

    init {
        productoImagen = card.findViewById(R.id.imageViewProducto)
        productoNombre = card.findViewById(R.id.TextViewNombreProducto)
        productoCategoria = card.findViewById(R.id.TextViewNombreCat)
        productoPrecioDescuento = card.findViewById(R.id.TextViewPrecioDescuento)
        productoPrecioRegular = card.findViewById(R.id.TextViewPrecioRegular)
        productoDescPorcentaje = card.findViewById(R.id.textViewDescuentoProducto)
    }
}