package com.gunder.marqueeeffect

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        var tvmarquee = findViewById<TextView>(R.id.tvMarquee)
        tvmarquee.isSelected = true
    }
}