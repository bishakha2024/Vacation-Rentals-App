package com.example.vacationrentals.adapters

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.vacationrentals.R
import com.example.vacationrentals.models.PropertyListing

class PropertyListingAdapter(private val listings: MutableList<PropertyListing>) :
    RecyclerView.Adapter<PropertyListingAdapter.ViewHolder>() {

    /**
     * ViewHolder holds references to all views in a single row.
     *
     * This prevents repeated calls to findViewById() and improves performance.
     */
    class ViewHolder(view: View) : RecyclerView.ViewHolder(view) {

        val tvLine1: TextView
        val tvLine2: TextView

        val btnCancel: Button


        init {
            // Define click listener for the ViewHolder's View
            tvLine1 = view.findViewById(R.id.item_info_line_1)
            tvLine2 = view.findViewById(R.id.item_info_line_2)
            btnCancel = view.findViewById(R.id.btnCancel)
        }
    }

    /**
     * Called when your RecyclerView needs to create a NEW row.
     *
     * "Inflate" means converting the XML layout into a real View object
     * that can be displayed on the screen.
     */
    override fun onCreateViewHolder(viewGroup: ViewGroup, viewType: Int): ViewHolder {
        // Create a new view, which defines the UI of the list item
        val view = LayoutInflater.from(viewGroup.context)
            .inflate(R.layout.row_layout, viewGroup, false)

        return ViewHolder(view)
    }

    /**
     * Called when RecyclerView needs to DISPLAY data in a row.
     *
     * This is where we:
     * 1. Get the current superhero from the list
     * 2. Bind the data to the UI (TextViews, ImageView)
     * 3. Attach click events
     *
     * Inflate builds the row.
     * Bind fills the row with data.
     */
    override fun onBindViewHolder(viewHolder: ViewHolder, position: Int) {

        val currentListing = listings[position]

        viewHolder.tvLine1.text = currentListing.name
        viewHolder.tvLine2.text = currentListing.address

        // Get element from your dataset at this position and replace the
        // contents of the view with that element
        wireUpEvents(viewHolder)

    }

    /**
     * Returns the total number of superheroes in the list.
     */
    override fun getItemCount() = listings.size


    //Helper functions

    /**
     * Wires up all click events for a row.
     *
     * - Row click -> Go To Superhero Details Screen
     * - Edit button -> Go To edit screen
     * - Delete button -> Delete superhero
     */
    fun wireUpEvents(holder: ViewHolder){
        holder.btnCancel.setOnClickListener {
            // TODO: Do something
        }
    }

}