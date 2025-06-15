package com.example.netflix_app.auth

import android.content.Intent
import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import com.example.netflix_app.R
import com.example.netflix_app.profiles.ProfilesActivity
import com.google.android.material.button.MaterialButton

class LoginActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_login)

        val btnSignIn = findViewById<MaterialButton>(R.id.btnSignIn)

        btnSignIn.setOnClickListener {
            startActivity(Intent(this, ProfilesActivity::class.java))
        }
    }
}