package com.example.uzbekistanhistoricalplaces

import android.content.Intent
import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.example.uzbekistanhistoricalplaces.Dataclass.info
import com.example.uzbekistanhistoricalplaces.databinding.ActivityMalumotBinding

class Malumot : AppCompatActivity() {
lateinit var binding:ActivityMalumotBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding= ActivityMalumotBinding.inflate(layoutInflater)
        setContentView(binding.root)
        val malumot=intent.extras?.getParcelable<info>("info")
        binding.texview.text=malumot?.name
        Toast.makeText(this,malumot?.name, Toast.LENGTH_SHORT).show()
        binding.imglocation.setOnClickListener{
            val intent=Intent(this,MapActivity::class.java)
            startActivity(intent)
            val Info=intent.extras?.getParcelable<info>("info")
        }
    }
}