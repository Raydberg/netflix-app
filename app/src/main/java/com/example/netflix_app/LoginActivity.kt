package com.example.netflix_app

import android.content.Intent
import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
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