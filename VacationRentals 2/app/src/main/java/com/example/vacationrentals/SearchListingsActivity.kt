package com.example.vacationrentals

import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.lifecycle.lifecycleScope
import com.google.android.gms.maps.GoogleMap
import com.google.android.gms.maps.SupportMapFragment
import com.google.maps.android.ktx.awaitMap
import kotlinx.coroutines.launch

class SearchListingsActivity : AppCompatActivity() {
    // ui elements
    private lateinit var tvResults: TextView
    private lateinit var btnPurchase: Button
    private lateinit var btnLogout: Button

    // Map variables
    private lateinit var mapFragment: SupportMapFragment
    private lateinit var gMap: GoogleMap


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_search_listings)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }


        bindWidgets()
        wireUpEvents()
        loadMap()

    }


    fun bindWidgets() {
        // setup ui elements
        btnPurchase = findViewById<Button>(R.id.btnPurchase)
        tvResults = findViewById<TextView>(R.id.tvResults)

        // logout button
        btnLogout = findViewById(R.id.btnLogout)

        // NOTE: This is the code to initialize the map fragment in the XML
        mapFragment = supportFragmentManager
            .findFragmentById(R.id.map) as SupportMapFragment
    }

    fun wireUpEvents() {
        btnPurchase.setOnClickListener {
            var toast = Toast.makeText(this, "Button pressed!", Toast.LENGTH_SHORT)
            toast.show()
        }

        btnLogout.setOnClickListener {
            logout()
        }
    }


    fun loadMap() {
        // TODO: Load the map
        lifecycleScope.launch {
            // initialize the gMap class property
            gMap = mapFragment.awaitMap()

            // add a zoom button to the map
            gMap.uiSettings.isZoomControlsEnabled = true


        }
    }


    fun logout() {
        // TODO:
    }
}