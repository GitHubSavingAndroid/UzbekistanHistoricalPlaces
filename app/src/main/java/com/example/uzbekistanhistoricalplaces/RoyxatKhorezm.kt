package com.example.uzbekistanhistoricalplaces

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.uzbekistanhistoricalplaces.Dataclass.info
import com.example.uzbekistanhistoricalplaces.RecyclerAdapter.RecyclerAdapter
import com.example.uzbekistanhistoricalplaces.databinding.ActivityRoyxatKhorezmBinding
import com.google.android.gms.maps.model.LatLng

class RoyxatKhorezm : AppCompatActivity() {
    lateinit var binding:ActivityRoyxatKhorezmBinding
    lateinit var recAdapter: RecyclerAdapter
    val informations= arrayListOf<info>(
        info("https://tourweek.ru/storage/web/source/uploads/ckeditor/Screenshot_1418.png",
            "Ichan qal`a",
        LatLng(41.46251300494567, 60.364823025902034)
        ),
        info("https://img-fotki.yandex.ru/get/909303/31161678.114/0_174fe5_f4c810fb_orig.jpg",
            "Kalta Minor",
        LatLng(41.454279447993, 60.34834353479111)),
        info("https://oasisinternational.travel/ru/wp-content/uploads/2020/01/Khiva-Pakhkavon-Mahmud-Mausoleum-JZ.jpg",
            "Pahlavon Mahmud maqbarasi",
        LatLng(41.37701534070422, 60.35935869734002)),
        info("https://pixy.org/src/37/373527.jpg",
            "Sherg`ozixon madrasasi",
        LatLng(41.37671745148019, 60.35883302063282)),
        info("https://khivamuseum.uz/sites/default/files/arab_muhammadxon_madrasasi.jpg",
            "Muhammad Amin Inoq madrasasi",
        LatLng(41.37833228741542, 60.360567626175424)),
        info( "https://lh3.googleusercontent.com/p/AF1QipMxWIa-Fe9ohF2kprHCMd8cYnziyJ3_H6poILF5=s680-w680-h510",
            "Olloqulixon madrasasi",
        LatLng(41.3776334394035, 60.36214999918761)),
        info( "https://abasayyoh.com/uploaded_images/attractions/1/225.jpg",
            "Muhammad Aminxon madrasasi",
        LatLng(41.3780733753463, 60.357466239881084)),
        info( "https://upload.tury.club/data/12ac3b53d69d8c8f0e0452f9acd9aea1/Ly4UqUt7/IVFRIfU9.jpg",
            "Muhammad Rahimxon madrasasi",
        LatLng(41.37893304948337, 60.35936547219968)),
    )
        override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding=ActivityRoyxatKhorezmBinding.inflate(layoutInflater)
        setContentView(binding.root)
            recAdapter= RecyclerAdapter{}
            val layoutManager= LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false)
            binding.tableKhorezm.layoutManager=layoutManager
            binding.tableKhorezm.adapter=recAdapter
            recAdapter.submitList(informations)
        }
}