package com.dartx.fooddeliveryapp.componentes.productos

import android.view.LayoutInflater
import android.view.ViewGroup
import com.dartx.fooddeliveryapp.R
import androidx.recyclerview.widget.RecyclerView
import com.dartx.fooddeliveryapp.model.Producto

class AdapterProductos (val lista: List<Producto>): RecyclerView.Adapter<ViewHolderProductos>(){
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolderProductos {
        val card = LayoutInflater.from(parent.context).inflate(R.layout.card_producto,parent,false)
        return  ViewHolderProductos(card)
    }

    override fun getItemCount(): Int {
        return lista.size
    }

    override fun onBindViewHolder(holder: ViewHolderProductos, position: Int) {
        //unir la data
        holder.productoNombre.text = lista[position].nombre
        holder.productoCategoria.text = lista[position].categoria
        holder.productoPrecioRegular.text = lista[position].precioRegular
        holder.productoPrecioDescuento.text = lista[position].precioDescuento
        holder.productoDescPorcentaje.text = lista[position].descuentoPorcentaje
    }
}