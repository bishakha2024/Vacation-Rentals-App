package com.example.vacationrentals.db

import com.google.firebase.Firebase
import com.google.firebase.auth.auth
import com.google.firebase.firestore.auth.User
import kotlinx.coroutines.tasks.await

object AuthRepository {
    private val auth = Firebase.auth
}