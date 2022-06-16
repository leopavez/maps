package com.example.googlemaps.views

import android.content.Intent
import android.os.Bundle
import android.os.PersistableBundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.example.googlemaps.R

class LoginActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState);
        supportActionBar?.hide();
        setContentView(R.layout.activity_login);
        val txtuser = findViewById(R.id.txtusername) as EditText
        val txtpassword = findViewById(R.id.txtpassword) as EditText
        val btnlogin = findViewById(R.id.btnlogin) as Button


        btnlogin.setOnClickListener {
            login();
        }
    }

    private fun login(){
        val intent = Intent(this, MapsActivity::class.java).apply {}
        startActivity(intent)
        finish()
    }
}