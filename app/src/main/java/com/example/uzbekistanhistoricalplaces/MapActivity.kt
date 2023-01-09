package com.example.uzbekistanhistoricalplaces

import android.annotation.SuppressLint
import android.content.pm.PackageManager
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import androidx.activity.result.ActivityResultLauncher
import androidx.activity.result.contract.ActivityResultContracts
import androidx.appcompat.app.AppCompatActivity
import androidx.core.content.ContextCompat
import com.example.uzbekistanhistoricalplaces.databinding.ActivityMapBinding
import com.google.android.gms.maps.CameraUpdateFactory
import com.google.android.gms.maps.GoogleMap
import com.google.android.gms.maps.OnMapReadyCallback
import com.google.android.gms.maps.SupportMapFragment
import com.google.android.gms.maps.model.LatLng
import com.google.android.gms.maps.model.Marker
import com.google.android.gms.maps.model.MarkerOptions

class MapActivity : AppCompatActivity(), OnMapReadyCallback {

    private lateinit var mMap: GoogleMap
    private lateinit var binding: ActivityMapBinding
    lateinit var requestPermissionLauncherFINE: ActivityResultLauncher<String>
    lateinit var marker1: Marker
    @SuppressLint("MissingPermission")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityMapBinding.inflate(layoutInflater)
        setContentView(binding.root)

        // Obtain the SupportMapFragment and get notified when the map is ready to be used.
        val mapFragment = supportFragmentManager
            .findFragmentById(R.id.map) as SupportMapFragment
        mapFragment.getMapAsync(this)
        requestPermissionLauncherFINE =
            registerForActivityResult(ActivityResultContracts.RequestPermission()) {
                if (it) {
                    mMap.isMyLocationEnabled = true }
                mapFragment.getMapAsync(this)}}
    override fun onMapReady(googleMap: GoogleMap) {
        mMap = googleMap

        // Add a marker in Sydney and move the camera
        val sydney = LatLng(40.504865156389606, 71.85866299980508)
        marker1= mMap.addMarker(MarkerOptions().position(sydney).title("Home sweet home!!!"))!!
        mMap.addMarker(MarkerOptions().position(sydney).title("Marker in Home"))
        mMap.moveCamera(CameraUpdateFactory.newLatLng(sydney))
        mMap.uiSettings.apply {
            isZoomControlsEnabled = true
            requestPermission()
            mMap.animateCamera(CameraUpdateFactory.newLatLngZoom(sydney,11f),1000, null)
        }
    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.map_option, menu)
        return true
    }
    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        when (item.itemId) {
            R.id.map_normal -> {
                mMap.mapType = GoogleMap.MAP_TYPE_NORMAL
            }
            R.id.map_hybrid -> {
                mMap.mapType = GoogleMap.MAP_TYPE_HYBRID
            }
            R.id.map_terrain -> {
                mMap.mapType = GoogleMap.MAP_TYPE_TERRAIN
            }
            R.id.map_satelite -> {
                mMap.mapType = GoogleMap.MAP_TYPE_SATELLITE
            }
            R.id.map_none -> {
                mMap.mapType = GoogleMap.MAP_TYPE_NONE
            }
        }
        return true
    }
    @SuppressLint("MissingPermission")
    fun requestPermission() {
        val isPermissionGiven =
            ContextCompat.checkSelfPermission(
                this,
                android.Manifest.permission.ACCESS_FINE_LOCATION
            ) == PackageManager.PERMISSION_GRANTED
        if (isPermissionGiven) {
            mMap.isMyLocationEnabled = true
        } else {
            requestPermissionLauncherFINE.launch(android.Manifest.permission.ACCESS_FINE_LOCATION)
        }
    }
        }