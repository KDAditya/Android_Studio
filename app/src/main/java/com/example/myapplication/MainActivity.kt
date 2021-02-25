package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val tombolPutar:Button = findViewById(R.id.putar_button)
        tombolPutar.setOnClickListener { putarDadu1() }

    }

    private fun putarDadu1()
    {
        Toast.makeText(this,"DADU BY KD_ADITYA(007)",Toast.LENGTH_LONG).show()
        val angkaDadu1 = (1..6).random()
        val hasil:ImageView = findViewById(R.id.gambar_dadu1)
        val gambarHasil = when (angkaDadu1){

            1 -> R.drawable.dice_1
            2 -> R.drawable.dice_2
            3 -> R.drawable.dice_3
            4 -> R.drawable.dice_4
            5 -> R.drawable.dice_5
            else -> R.drawable.dice_6
        }
        hasil.setImageResource(gambarHasil)

        val angkaDadu2 = (1..6).random()
        val hasil2:ImageView = findViewById(R.id.gambar_dadu2)
        val gambarHasil2 = when (angkaDadu2){

            1 -> R.drawable.dice_1
            2 -> R.drawable.dice_2
            3 -> R.drawable.dice_3
            4 -> R.drawable.dice_4
            5 -> R.drawable.dice_5
            else -> R.drawable.dice_6
        }

        hasil2.setImageResource(gambarHasil2)
    }
}