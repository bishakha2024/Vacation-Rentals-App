package com.example.vacationrentals

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Switch
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class SignupActivity : AppCompatActivity() {

    private lateinit var etEmail: EditText
    private lateinit var etPassword: EditText
    private lateinit var swIsPropertyOwner: Switch
    private lateinit var btnSignupOrLogin: Button

    private lateinit var btnSeeOwnerScreens: Button
    private lateinit var btnSeeTravellerScreens: Button



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_signup)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        bindWidgets()
        wireUpEvents()
    }

    fun bindWidgets() {
        etEmail = findViewById(R.id.etEmail)
        etPassword = findViewById(R.id.etPassword)
        swIsPropertyOwner = findViewById(R.id.swIsPropertyOwner)
        btnSignupOrLogin = findViewById(R.id.btnSignupOrLogin)

        btnSeeOwnerScreens = findViewById(R.id.btnSeeOwnerScreens)
        btnSeeTravellerScreens = findViewById(R.id.btnSeeTravellerScreens)
    }

    fun wireUpEvents() {
        btnSignupOrLogin.setOnClickListener {
            signupOrLogin()
        }

        btnSeeOwnerScreens.setOnClickListener {
            seeOwnerScreens()
        }

        btnSeeTravellerScreens.setOnClickListener {
            seeTravellerScreens()
        }
    }

    fun signupOrLogin() {
        // TODO:


    }

    fun seeOwnerScreens() {
        var intent = Intent(this@SignupActivity, AddListingActivity::class.java)
        startActivity(intent)
    }

    fun seeTravellerScreens() {
        var intent = Intent(this@SignupActivity, SearchListingsActivity::class.java)
        startActivity(intent)
    }


}