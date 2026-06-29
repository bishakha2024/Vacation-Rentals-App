package com.example.vacationrentals

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class AddListingActivity : AppCompatActivity() {

    private lateinit var etPropertyName: EditText
    private lateinit var etAddress: EditText
    private lateinit var etPricePerNight: EditText
    private lateinit var btnAddListing: Button
    private lateinit var btnViewAllListings: Button
    private lateinit var btnLogout: Button




    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_add_listing)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        bindWidgets()
        wireUpEvents()
    }

    fun bindWidgets() {
        etPropertyName = findViewById(R.id.etPropertyName)
        etAddress = findViewById(R.id.etAddress)
        etPricePerNight = findViewById(R.id.etPricePerNight)
        btnAddListing = findViewById(R.id.btnAddListing)
        btnViewAllListings = findViewById(R.id.btnViewAllListings)
        btnLogout = findViewById(R.id.btnLogout)
    }

    fun wireUpEvents() {
        btnAddListing.setOnClickListener {
            addListing()
        }
        btnViewAllListings.setOnClickListener {
            viewListings()
        }

        btnLogout.setOnClickListener {
            logout()
        }
    }

    fun addListing() {
        // TODO: Add a listing
    }

    fun viewListings() {
        val intent: Intent = Intent(this@AddListingActivity, ViewAllListings::class.java)
        startActivity(intent)
    }

    fun logout() {
        // TODO: Logout
    }

}