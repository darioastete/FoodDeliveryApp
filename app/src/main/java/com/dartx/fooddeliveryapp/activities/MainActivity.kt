package com.dartx.fooddeliveryapp.activities

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.dartx.fooddeliveryapp.componentes.categorias.AdapterCategorias
import com.dartx.fooddeliveryapp.R
import com.dartx.fooddeliveryapp.componentes.productos.AdapterProductos
import com.dartx.fooddeliveryapp.model.Producto

class MainActivity : AppCompatActivity() {
    lateinit var recyvlerViewCategorias: RecyclerView

    lateinit var recyvlerViewProductos: RecyclerView


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        recyvlerViewCategorias = findViewById(R.id.recyvlerViewCategorias)
        recyvlerViewProductos = findViewById(R.id.recyvlerViewPopulares)

        //val categorias = ["Pizzas","Burguer", "Makis" , "Postres", "Bebidas"]
        val categorias = ArrayList<String>()
        categorias.add("Pizzas")
        categorias.add("Pizzas")
        categorias.add("Pizzas")
        categorias.add("Pizzas")

        val productosA = arrayListOf<Producto>()
        productosA.add(Producto("Pizza Pepperoni","Pizzas", "S/. 30.00","S/. 20.00","50%"))
        productosA.add(Producto("Maki","Makis", "S/. 40.00","S/. 35.00","30%"))
        productosA.add(Producto("Pastel","Pasteles", "S/. 150.00","S/. 20.00","30%"))

        val adapter = AdapterCategorias(categorias)
        val adapterProductos = AdapterProductos(productosA)

        recyvlerViewCategorias.layoutManager = LinearLayoutManager(this,LinearLayoutManager.HORIZONTAL,false)
        recyvlerViewCategorias.adapter = adapter

        recyvlerViewProductos.layoutManager = LinearLayoutManager(this,LinearLayoutManager.VERTICAL,false)
        recyvlerViewProductos.adapter = adapterProductos

    }
}