package com.example.receita.recipes

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.receita.databinding.ActivityBananaShakeBinding
import com.example.receita.databinding.ActivityBrigadeiroBinding
import com.example.receita.databinding.ActivityCapuccinoBinding
import com.example.receita.databinding.ActivityMainBinding
import com.example.receita.databinding.ActivityMilkCakeBinding

class BananaShakeActivity : AppCompatActivity() {

    private lateinit var binding: ActivityBananaShakeBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityBananaShakeBinding.inflate(layoutInflater)

        setContentView(binding.root)
    }


}