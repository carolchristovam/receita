package com.example.receita.recipes

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.receita.databinding.ActivityBrownieBinding
import com.example.receita.databinding.ActivityCapuccinoBinding
import com.example.receita.databinding.ActivityMainBinding

class DarkBrownieActivity : AppCompatActivity() {

    private lateinit var binding: ActivityBrownieBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityBrownieBinding.inflate(layoutInflater)

        setContentView(binding.root)
        setupClickListeners()
    }

    private fun setupClickListeners() {
        binding.backArrowIMG.setOnClickListener {
            onBackPressed()
        }
    }



}