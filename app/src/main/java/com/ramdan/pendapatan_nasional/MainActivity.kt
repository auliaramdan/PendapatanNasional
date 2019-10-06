package com.ramdan.pendapatan_nasional

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val keluarBtn : Button = findViewById(R.id.keluarBtn)
        val materiBtn : Button = findViewById(R.id.materiBtn)
        
        materiBtn.setOnClickListener{
            view ->
            val intent = Intent(this, Materi::class.java)
            startActivity(intent)
        }
        keluarBtn.setOnClickListener{view -> finishAffinity()}
    }
}
