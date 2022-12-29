package com.example.appfitnessnote.ui.view

import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.DividerItemDecoration
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.appfitnessnote.R
import com.example.appfitnessnote.databinding.ActivityCargarRutinaBinding
import com.example.appfitnessnote.ui.view.adapters.itemsRutina.RutinaAdapter

class CargarRutina : AppCompatActivity() {
    private lateinit var binding : ActivityCargarRutinaBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityCargarRutinaBinding.inflate(layoutInflater)
        setContentView(binding.root)

        initRecyclerView()

        supportActionBar!!.setDisplayHomeAsUpEnabled(true)

    }

    fun initRecyclerView(){

        val listOfRoutines = mutableListOf<String>("Pecho", "Espalda", "Pierna")

        val manager = LinearLayoutManager(this)
        val decoration = DividerItemDecoration(this, manager.orientation)

        val adapter = RutinaAdapter(listOfRoutines)

        val recycler = binding.recyclerViewRutinas
        recycler.layoutManager = manager
        recycler.adapter = adapter

        recycler.addItemDecoration(decoration)
    }

    override fun onBackPressed() {
        super.onBackPressed()
        this.overridePendingTransition(0,0)
        this.finish()
    }

    override fun onSupportNavigateUp(): Boolean {
        this.onBackPressed()
        return true
    }
}