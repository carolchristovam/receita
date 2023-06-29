package com.example.receita.recipes

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.receita.databinding.ActivityBrigadeiroBinding
import com.example.receita.databinding.ActivityCapuccinoBinding
import com.example.receita.databinding.ActivityMainBinding

class BrigadeiroActivity : AppCompatActivity() {

    private lateinit var binding: ActivityBrigadeiroBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityBrigadeiroBinding.inflate(layoutInflater)

        setContentView(binding.root)
        setupClickListeners()
    }

    private fun setupClickListeners() {
        binding.backArrowIMG.setOnClickListener {
            onBackPressed()
        }
    }


}