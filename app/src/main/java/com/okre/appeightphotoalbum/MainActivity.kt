package com.okre.appeightphotoalbum

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val image1 = findViewById<ImageView>(R.id.image01)
        val image2 = findViewById<ImageView>(R.id.image02)
        val image3 = findViewById<ImageView>(R.id.image03)
        val image4 = findViewById<ImageView>(R.id.image04)
        val image5 = findViewById<ImageView>(R.id.image05)
        val image6 = findViewById<ImageView>(R.id.image06)
        val image7 = findViewById<ImageView>(R.id.image07)

        //1. 화면 클릭
        image1.setOnClickListener {
            //Toast.makeText(this, "1번 클릭 완료", Toast.LENGTH_LONG).show()

            //2. 화면 전환
            val intent = Intent(this, ImageActivity::class.java) // 인텐트 생성
            intent.putExtra("data", "1")
            startActivity(intent) // 화면 전환을 시켜줌
            // finish() // 창을 닫아줌. 닫아주지 않고싶다면 이 문장을 사용하지 않아도 됨.
        }

        image2.setOnClickListener {
            val intent = Intent(this, ImageActivity::class.java)
            intent.putExtra("data", "2")
            startActivity(intent)
        }

        image3.setOnClickListener {
            val intent = Intent(this, ImageActivity::class.java)
            intent.putExtra("data", "3")
            startActivity(intent)
        }

        image4.setOnClickListener {
            val intent = Intent(this, ImageActivity::class.java)
            intent.putExtra("data", "4")
            startActivity(intent)
        }

        image5.setOnClickListener {
            val intent = Intent(this, ImageActivity::class.java)
            intent.putExtra("data", "5")
            startActivity(intent)
        }

        image6.setOnClickListener {
            val intent = Intent(this, ImageActivity::class.java)
            intent.putExtra("data", "6")
            startActivity(intent)
        }

        image7.setOnClickListener {
            val intent = Intent(this, ImageActivity::class.java)
            intent.putExtra("data", "7")
            startActivity(intent)
        }
    }
}