package com.example.uzbekistanhistoricalplaces

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.uzbekistanhistoricalplaces.Dataclass.info
import com.example.uzbekistanhistoricalplaces.RecyclerAdapter.RecyclerAdapter
import com.example.uzbekistanhistoricalplaces.databinding.ActivityRoyxatBukharaBinding
import com.google.android.gms.maps.model.LatLng

class RoyxatBukhara : AppCompatActivity() {
    lateinit var binding: ActivityRoyxatBukharaBinding
    lateinit var recAdapter: RecyclerAdapter
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityRoyxatBukharaBinding.inflate(layoutInflater)
        setContentView(binding.root)
        val informations = arrayListOf<info>(
            info(
                "https://bustolondon.in/wp-content/uploads/2020/08/Art-Of-Bukhara.jpg",
                "Ark qal`asi",
                LatLng(39.77782905449607, 64.41075558465859,)
            ),
            info("https://my-rent.uz/assets/images/guide/30/1.jpg",
                "Ismoil Somoniy maqbarasi",
                LatLng(39.77772481296843, 64.40061751534144)
            ),
            info(
                "https://live.staticflickr.com/3796/12046574076_f692873cf9_b.jpg",
                "Minorai Kalon",
               LatLng(39.77639644385777, 64.4150181)
            ),
            info(
                "https://www.advantour.com/img/uzbekistan/bukhara/ulugbek-madrassah.jpg",
                "Ulug`bek madrasasi (Buxoro)",
                LatLng(39.777047566593325, 64.41727032329283)
            ),
            info(
                "https://bookatour.me/uploads/content/gBt8Q2rJYbSsZsFJDWD8mIfSuan8VQYH3SGqJMyO.jpeg",
                "Ulug`bek madrasasi (G`ijduvon)",
               LatLng(40.10320889286504, 64.67747452800359)
            ),
            info(
                "https://d3e1m60ptf1oym.cloudfront.net/1605d8a2-2989-4999-bec2-d50ff8408dd7/JW_111316_9526_xgaplus.jpg",
                "Masjidi Kalon",
             LatLng(39.90237882417179, 64.39160179397902)
            ),
            info(
                "https://images.squarespace-cdn.com/content/v1/5940f2725016e1c79e469470/1539179241132-2K1L2HUC4CJ5IG3FO1D4/DSC00473-min.jpg",
                "Mir Arab madrasasi",
                LatLng(39.768132159106194, 64.45558762612175)
            ),
            info(
                "https://www.advantour.com/img/uzbekistan/tashkent/kukeldash-madrasah1.jpg",
                "Ko`kaldosh madrasasi",
                LatLng(39.77380265224194, 64.42114861262804)
            ),
            info(
                "https://www.advantour.com/img/uzbekistan/bukhara/chor-bakr5.jpg",
                "Chor Bakir ansambli",
                LatLng(39.774460083840516, 64.33384206845128)
            ),
            info(
                "https://www.advantour.com/img/uzbekistan/bukhara/kosh-madrasah1.jpg",
                "Abdullaxon madrasasi",
                LatLng(39.77475188988043, 64.4053513395675)
            ),
            info(
                "https://lh5.googleusercontent.com/p/AF1QipMdN7OJXbecrAFvWjLQBiBpMMcP4sX1PGRlYJ_R=w262-h104-p-k-no",
                "Abdulazizxon madrasasi",
                LatLng(39.776179501170844, 64.41769478379273)
            ),
            info(
                "https://thumbs.dreamstime.com/b/bukhara-old-city-bukhara-old-city-chor-minor-madrasa-side-viewpoint-sunset-141087346.jpg",
                "Chor Minor majmuasi",
                LatLng(39.77494189160481, 64.42736022612192)
            )
        )
        recAdapter = RecyclerAdapter {
            val intent = Intent(this, Malumot::class.java)
            intent.putExtra("info", it)
            startActivity(intent)
        }
        val layoutManager = LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false)
        binding.tableBukhara.layoutManager = layoutManager
        binding.tableBukhara.adapter = recAdapter
        recAdapter.submitList(informations)
    }
}