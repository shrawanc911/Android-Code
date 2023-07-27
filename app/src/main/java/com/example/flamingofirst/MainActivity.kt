package com.example.flamingofirst

import android.media.Image
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageButton
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val button = findViewById<Button>(R.id.button)
        button.setOnClickListener {
            // Show a toast message when the button is clicked
            Toast.makeText(this, "Button clicked!", Toast.LENGTH_SHORT).show()
        }
        val image = findViewById<ImageButton>(R.id.imageButton3)
        image.setOnClickListener{
            Toast.makeText(this,"Image Clicked",Toast.LENGTH_LONG ).show()
        }
    }
}