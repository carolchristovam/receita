package com.example.receita.recipes

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.receita.databinding.ActivityBrigadeiroBinding
import com.example.receita.databinding.ActivityCapuccinoBinding
import com.example.receita.databinding.ActivityMainBinding
import com.example.receita.databinding.ActivityMilkCakeBinding

class MilkCakeActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMilkCakeBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMilkCakeBinding.inflate(layoutInflater)

        setContentView(binding.root)
        setupClickListeners()
    }

    private fun setupClickListeners() {
        binding.backArrowIMG.setOnClickListener {
            onBackPressed()
        }
    }


}