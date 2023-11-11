package com.example.portfolioo

import android.os.Bundle
import android.text.util.Linkify
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class OtherInfoActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_other_info)
        val textOtherInfoTextView = findViewById<TextView>(R.id.textOtherInfo)

        Linkify.addLinks(textOtherInfoTextView, Linkify.WEB_URLS)
    }
}