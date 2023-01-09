package com.example.uzbekistanhistoricalplaces

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.uzbekistanhistoricalplaces.Dataclass.info
import com.example.uzbekistanhistoricalplaces.RecyclerAdapter.RecyclerAdapter
import com.example.uzbekistanhistoricalplaces.databinding.ActivityRoyxatTashkentBinding
import com.google.android.gms.maps.model.LatLng

class RoyxatTashkent : AppCompatActivity() {
    lateinit var binding: ActivityRoyxatTashkentBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding=ActivityRoyxatTashkentBinding.inflate(layoutInflater)
        setContentView(binding.root)
        lateinit var recAdapter: RecyclerAdapter
        var informations= arrayListOf<info>(
            info("https://uzbekistan.travel/storage/app/media/nargiza/cropped-images/153638925516682502-0-0-0-0-1583401955.jpg",
                "Baroqxon madrasasi",
                LatLng(32.3,43.4)
            ),
            info("https://res.cloudinary.com/fleetnation/image/private/c_fit,w_1120/g_south,l_text:style_gothic2:%C2%A9%20monti,o_20,y_10/g_center,l_watermark4,o_25,y_50/v1576431485/kjh2lcyqyvjncnkjjm8r.jpg",
                "Ko`kaldosh madrasasi",
                LatLng(39.77494189160481, 64.42736022612192)
            ),
            info("https://shosh.uz/wp-content/uploads/2015/04/rasm.jpg",
                "Mo`yi Muborak madrasasi",
                LatLng(39.77494189160481, 64.42736022612192)
            ),
            info("https://uzbek-travel.com/images/uz/Landmarks/Tashkent/Tillya_Sheikh_Mosque/tillya-sheikh.jpg",
                "Tillashayx masjidi",
                LatLng(39.77494189160481, 64.42736022612192)
            ),
            info("https://topgid.net/uploads/posts/2020-01/5e2eeecf17051-6021-medrese-abulkosim.jpeg",
                "Abulqosim Eshon madrasasi",
                LatLng(39.77494189160481, 64.42736022612192)
            ),
        )
        recAdapter= RecyclerAdapter{}
        val layoutManager= LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false)
        binding.tableTashkent.layoutManager=layoutManager
        binding.tableTashkent.adapter=recAdapter
        recAdapter.submitList(informations)
    }
}