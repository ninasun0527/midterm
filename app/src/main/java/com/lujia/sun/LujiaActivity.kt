// student number : 300726390

package com.lujia.sun


import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import android.widget.Button

class LujiaActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val buttonSelect = findViewById<Button>(R.id.buttonSelectExercises)
        buttonSelect.setOnClickListener {
            val intent = Intent(this, SunActivity::class.java)
            startActivity(intent)
        }
    }
}