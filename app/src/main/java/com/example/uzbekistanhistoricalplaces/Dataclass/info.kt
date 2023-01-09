package com.example.uzbekistanhistoricalplaces.Dataclass

import android.os.Parcelable
import com.google.android.gms.maps.model.LatLng
import kotlinx.parcelize.Parcelize

@Parcelize
data class info(
    val image: String,
    val name: String,
    val latLng: LatLng,
):Parcelable