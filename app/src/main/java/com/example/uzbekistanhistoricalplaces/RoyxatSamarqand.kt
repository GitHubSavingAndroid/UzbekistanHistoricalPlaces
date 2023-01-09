package com.example.uzbekistanhistoricalplaces

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.uzbekistanhistoricalplaces.Dataclass.info
import com.example.uzbekistanhistoricalplaces.RecyclerAdapter.RecyclerAdapter
import com.example.uzbekistanhistoricalplaces.databinding.ActivityRoyxatSamarqandBinding
import com.google.android.gms.maps.model.LatLng

class RoyxatSamarqand : AppCompatActivity() {
    lateinit var binding:ActivityRoyxatSamarqandBinding
    lateinit var recAdapter: RecyclerAdapter
    val informations= arrayListOf<info>(
        info("https://ilmelnik.ru/wp-content/uploads/2020/08/DSC04871.jpg",
            "Bibixonim madrasasi",
        LatLng(32.3,43.4)
        ),
        info("https://iamabroad.ru/wp-content/uploads/2018/09/xIMG_20180405_075826_HDR-1.jpg.pagespeed.ic.UiSIIATJVp.jpg",
            "Shohizinda",
            LatLng(32.3,43.4)),
        info("https://farm1.staticflickr.com/903/40924194715_5216490bee_o.jpg",
            "Bibixonim masjidi",
            LatLng(32.3,43.4)),
        info("https://mtdata.ru/u12/photo9A3D/20497222352-0/original.jpg",
            "Amir Temur maqbarasi (Go`ri Amir)",
            LatLng(32.3,43.4)),
        info("https://zakazposterov.ru/fotooboi/z/fotooboi-e-49680-medrese-ulugbeka-na-ploschadi-registan-v-samarkande-uzbekist-zakazposterov-ru_z.jpg",
            "Ulug`bek madrasasi",
            LatLng(32.3,43.4)),
        info("https://i1.wp.com/www.akademiktarihtr.com/wp-content/uploads/2020/02/3.jpg?fit=1024%2C747&amp;ssl=1",
            "Ulug`bek rasadxonasi",
            LatLng(32.3,43.4)),
        info( "https://zakazposterov.ru/fotooboi/z/fotooboi-e-49682-samarkand-uzbekistan-28-avgusta-s-podsvetkoy-medrese-sher-do-zakazposterov-ru_z.jpg",
            "Sherdor madrasasi",
            LatLng(32.3,43.4)),
        info( "https://oasisinternational.travel/ru/wp-content/uploads/2020/01/Samarkand-Madrasah-Tilla-Kori-5.jpg",
            "Tillakori madrasasi",
            LatLng(32.3,43.4)),
    )
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding= ActivityRoyxatSamarqandBinding.inflate(layoutInflater)
        setContentView(binding.root)
        recAdapter= RecyclerAdapter{}
        val layoutManager= LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false)
        binding.tableSamarqand.layoutManager=layoutManager
        binding.tableSamarqand.adapter=recAdapter
        recAdapter.submitList(informations)
    }
}