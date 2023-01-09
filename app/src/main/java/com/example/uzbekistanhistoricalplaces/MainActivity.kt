package com.example.uzbekistanhistoricalplaces

import android.app.Activity
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import com.example.uzbekistanhistoricalplaces.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var binding:ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding= ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        Handler().postDelayed(Runnable{
            val intent=Intent(this, SecondActivity::class.java)
            startActivity(intent)
            finish()
        }, 3000)
    }
}