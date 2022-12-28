package com.example.appfitnessnote.ui.view.adapters.itemsRutina

import android.view.View
import androidx.recyclerview.widget.RecyclerView
import com.example.appfitnessnote.databinding.ItemRutinaBinding

class RutinaViewHolder(view: View) : RecyclerView.ViewHolder(view) {

    private val binding = ItemRutinaBinding.bind(view)

    fun render(nombre:String){
        binding.textViewNombreRutina.text = nombre
    }

}