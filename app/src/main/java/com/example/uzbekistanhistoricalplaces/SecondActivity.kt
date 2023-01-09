package com.example.uzbekistanhistoricalplaces

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.uzbekistanhistoricalplaces.databinding.ActivitySecondBinding

class SecondActivity : AppCompatActivity() {
    lateinit var binding:ActivitySecondBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding=ActivitySecondBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.Samarqand.setOnClickListener{
            startActivity(Intent(this, RoyxatSamarqand::class.java))
        }
        binding.Khorezm.setOnClickListener{
            startActivity(Intent(this, RoyxatKhorezm::class.java))
    }
        binding.Bukhara.setOnClickListener {
            startActivity(Intent(this, RoyxatBukhara::class.java))
        }
            binding.Tashkent.setOnClickListener{
                startActivity(Intent(this, RoyxatTashkent::class.java))
            }
}
}