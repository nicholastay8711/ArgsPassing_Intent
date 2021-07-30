package com.example.test

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        val btn : Button =findViewById(R.id.btnAbout)

        btn.setOnClickListener(){

            //val intent : Intent = Intent(this, AboutActivity::class.java)

//            val geo= Uri.parse("geo: 3.1864, 101.7059")
//            val intent : Intent = Intent(Intent.ACTION_VIEW,geo)

//            val intent : Intent = Intent(Intent.ACTION_SEND)
//            intent.setType("text/plain")
//            intent.putExtra(Intent.EXTRA_TEXT,"Hello")

            val tel=Uri.parse("tel:0123456789")
            val intent : Intent = Intent(Intent.ACTION_DIAL,tel)

            startActivity(intent)
        }
    }
}