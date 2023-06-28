package com.example.receita.recipes

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.receita.databinding.ActivityCapuccinoBinding
import com.example.receita.databinding.ActivityMainBinding

class CappuccinoActivity : AppCompatActivity() {

    private lateinit var binding: ActivityCapuccinoBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityCapuccinoBinding.inflate(layoutInflater)

        setContentView(binding.root)
    }

    private fun openCappuccinoScreen() {

    }

}