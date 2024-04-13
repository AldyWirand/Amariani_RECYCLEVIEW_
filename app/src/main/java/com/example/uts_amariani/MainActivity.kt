package com.example.uts_amariani

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {

    companion object{
        val INTENT_PARCEABLE = "OBJECT_INTENT"
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val masakanlist = listOf<Masakan>(
            Masakan(
               R.drawable.ayamgeprek,
                namemasakan = "Ayam Geprek",
                desmasakan = "Masakan yang enak sekali"
            ),
            Masakan(
                R.drawable.bakso,
                namemasakan = "Bakso",
                desmasakan = "Bakso Enak sekali "
            ),
            Masakan(
                R.drawable.nasi_goreng,
                namemasakan = "Nasi Goreng",
                desmasakan = "Nasi goreng yang enak sekali"
            ),
            Masakan(
                R.drawable.nasikuning,
                namemasakan = "Nasi Kuning",
                desmasakan = "Nasi Kuning yang enak sekali"
            ),
            Masakan(
                R.drawable.sayurasem,
                namemasakan = "Sayur Asem",
                desmasakan = "Nasi Kuning yang enak sekali"
            )

        )

        val recyclerView = findViewById<RecyclerView>(R.id.re)
        recyclerView.layoutManager = LinearLayoutManager( this)
        recyclerView.setHasFixedSize(true)
        recyclerView.adapter = MasakanAdapter( this, masakanlist){

        }
    }
}