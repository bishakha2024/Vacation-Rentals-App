package com.example.vacationrentals

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.lifecycle.lifecycleScope
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.vacationrentals.adapters.PropertyListingAdapter
import com.example.vacationrentals.db.FirestoreRepository
import kotlinx.coroutines.launch

class ViewAllListings : AppCompatActivity() {
    private lateinit var rvItems: RecyclerView


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_view_all_listings)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }


        bindWidgets()
        setUpRecyclerView()
    }

    override fun onResume() {
        super.onResume()
        setUpRecyclerView()
    }

    private fun setUpRecyclerView() {
        lifecycleScope.launch {
            val stores = FirestoreRepository.getAllListings()
            val propertyListingAdapter = PropertyListingAdapter(stores)
            rvItems.layoutManager = LinearLayoutManager(this@ViewAllListings)
            rvItems.adapter = propertyListingAdapter
        }

    }


    fun bindWidgets() {
        // setup ui elements
        rvItems = findViewById(R.id.rvItems)
    }
}