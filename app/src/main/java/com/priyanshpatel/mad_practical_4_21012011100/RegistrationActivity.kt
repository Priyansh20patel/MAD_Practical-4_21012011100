package com.priyanshpatel.mad_practical_4_21012011100

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class RegistrationActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_registration)

        val login: Button = findViewById(R.id.login1)
        login.setOnClickListener {
            Intent(this,LoginActivity::class.java).also { startActivity(it) }
        }
    }
}