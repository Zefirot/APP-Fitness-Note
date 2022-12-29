package com.example.appfitnessnote.ui.view.adapters.itemsRutina

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.appfitnessnote.R

class RutinaAdapter(
    private val rutinas : MutableList<String>
) : RecyclerView.Adapter<RutinaViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RutinaViewHolder {
        val layoutInflate = LayoutInflater.from(parent.context).inflate(R.layout.item_rutina, parent, false)
        println("asdasdasd")
        return RutinaViewHolder(layoutInflate)
    }

    override fun onBindViewHolder(holder: RutinaViewHolder, position: Int) {
        val item = rutinas[position]
        holder.render(item)
    }

    override fun getItemCount(): Int = rutinas.size

}