package com.rocket.external

import android.app.Activity
import android.os.Bundle
import android.graphics.Color
import android.view.Gravity
import android.widget.*

class MainActivity : Activity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        val layout = LinearLayout(this).apply {
            orientation = LinearLayout.VERTICAL
            gravity = Gravity.CENTER
            setPadding(30, 30, 30, 30)
            setBackgroundColor(Color.rgb(15, 15, 22))
        }

        val title = TextView(this).apply {
            text = "ROCKET EXTERNAL"
            textSize = 26f
            setTextColor(Color.GREEN)
            gravity = Gravity.CENTER
        }

        layout.addView(title)

        listOf("ESP", "AIM", "WALLHACK").forEach { feature ->
            val toggle = Switch(this).apply {
                text = feature
                textSize = 20f
                setTextColor(Color.WHITE)
                isChecked = false
            }
            layout.addView(toggle)
        }

        setContentView(layout)
    }
}
