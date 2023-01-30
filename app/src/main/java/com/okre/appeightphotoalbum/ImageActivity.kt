package com.okre.appeightphotoalbum

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.Toast

class ImageActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_image)

        val getData = intent.getStringExtra("data")
        //Toast.makeText(this, getData, Toast.LENGTH_SHORT).show()

        val imageArea = findViewById<ImageView>(R.id.imageArea)

        if (getData == "1") {
            imageArea.setImageResource(R.drawable.image01)
        }

        if (getData == "2") {
            imageArea.setImageResource(R.drawable.image02)
        }

        if (getData == "3") {
            imageArea.setImageResource(R.drawable.image03)
        }

        if (getData == "4") {
            imageArea.setImageResource(R.drawable.image04)
        }

        if (getData == "5") {
            imageArea.setImageResource(R.drawable.image05)
        }

        if (getData == "6") {
            imageArea.setImageResource(R.drawable.image06)
        }

        if (getData == "7") {
            imageArea.setImageResource(R.drawable.image07)
        }
    }
}