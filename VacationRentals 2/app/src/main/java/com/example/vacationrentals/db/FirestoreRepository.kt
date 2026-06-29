package com.example.vacationrentals.db

import com.example.vacationrentals.models.PropertyListing

object FirestoreRepository {

    // NOTE: This will need to be updated to use Firestore, not a fake database of listings

    private val propertyListings:MutableList<PropertyListing> = mutableListOf(
        // Toronto (5)
        PropertyListing(
            "Condo at Eaton Center",
            "CF Toronto Eaton Centre, 220 Yonge St, Toronto, ON M5B 2H1",
        ),
        PropertyListing(
            "Beautiful House near Amesbury Park",
            "2355 Keele St, Toronto, ON M6L 2N8",

        ),
        PropertyListing(
            "Apartment in the City Center",
            "2401 Yonge St, Toronto, ON M4P 3H1",
        ),
        PropertyListing(
            "1 Bedroom Downtown Condo",
            "1035 College St, Toronto, ON M6H 1A8",
        ),
        PropertyListing(
            "Luxury Downtown Rental",
            "4841 Yonge St, North York, ON M2N 5X2",
        ),

        // Montreal (2)
        PropertyListing(
            "House near French Restaurants",
            "Marché Central, 9187 Bd de l'Acadie, Montreal, QC H4N 3K1",
        ),
        PropertyListing(
            "Apartment near Montreal's Best Shopping",
            "150 Sainte-Catherine St W, Montreal, QC H2X 3Y2",
        ),
        // Vancouver (2)
        PropertyListing(
            "House by the Sea and Sky",
            "701 W Georgia St, Vancouver, BC V7Y 1G5",
        ),
        PropertyListing(
            "Convenient 2 Bedroom",
            "789 W Pender St, Vancouver, BC V6C 1H2",
        )
    )


    fun getAllListings():MutableList<PropertyListing> {
        return this.propertyListings
    }

}