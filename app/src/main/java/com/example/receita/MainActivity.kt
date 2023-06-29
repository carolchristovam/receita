package com.example.receita

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.receita.databinding.ActivityMainBinding
import com.example.receita.recipes.BananaShakeActivity
import com.example.receita.recipes.BrigadeiroActivity
import com.example.receita.recipes.CappuccinoActivity
import com.example.receita.recipes.DarkBrownieActivity
import com.example.receita.recipes.MilkCakeActivity

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)

        setContentView(binding.root)

        setupClickListeners()
    }

    private fun openCappuccinoScreen() {
        startActivity(Intent(this, CappuccinoActivity::class.java))
    }
    private fun openBrownieScreen() {
        startActivity(Intent(this, DarkBrownieActivity::class.java))
    }

    private fun openBrigadeiroScreen() {
        startActivity(Intent(this, BrigadeiroActivity::class.java))
    }

    private fun openMilkCakeScreen() {
        startActivity(Intent(this, MilkCakeActivity::class.java))
    }

    private fun openBananaShakeScreen() {
        startActivity(Intent(this, BananaShakeActivity::class.java))
    }


    private fun setupClickListeners() {
        binding.cappuccinoBTN.setOnClickListener {
            openCappuccinoScreen()
        }

        binding.brownieBTN.setOnClickListener {
            openBrownieScreen()
        }

        binding.brigadeiroBTN.setOnClickListener {
            openBrigadeiroScreen()
        }

        binding.milkCakeBTN.setOnClickListener {
            openMilkCakeScreen()
        }

        binding.bananaShakeBTN.setOnClickListener {
            openBananaShakeScreen()
        }



    }

}