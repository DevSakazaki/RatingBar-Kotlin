package com.example.ratingbar

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.RatingBar
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {

    lateinit var texto: TextView
    lateinit var botao: Button
    lateinit var ratingBar: RatingBar

    @SuppressLint("SetTextI18n")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        texto = findViewById(R.id.valorSelecionado)
        botao = findViewById(R.id.button)
        ratingBar = findViewById(R.id.ratingBar)

        ratingBar.setOnRatingBarChangeListener{ratingBar, rating, fromUser -> rating
            texto.text = "" + rating
        }
        botao.setOnClickListener{
            Toast.makeText(applicationContext, "Sua nota para o natal é: " + ratingBar.rating, Toast.LENGTH_LONG).show()
        }
    }
}