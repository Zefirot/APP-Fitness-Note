package com.example.appfitnessnote.ui.view

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.appfitnessnote.R
import com.example.appfitnessnote.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityMainBinding.inflate(layoutInflater)

        setContentView(binding.root)

        binding.buttonCargarRutinas.setOnClickListener{
            val i = Intent(this, CargarRutina::class.java)
            i.addFlags(Intent.FLAG_ACTIVITY_NO_ANIMATION)
            startActivity(i)
        }


    }
}