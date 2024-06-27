// student number : 300726390

package com.lujia.sun

import android.os.Bundle
import android.widget.Button
import android.widget.CheckBox
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class SunActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sun)

        val buttonNext = findViewById<Button>(R.id.buttonNext)
        val checkBoxLoseThings = findViewById<CheckBox>(R.id.checkBoxLoseThings)
        val checkBoxRememberNames = findViewById<CheckBox>(R.id.checkBoxRememberNames)
        val checkBoxLearnQuickly = findViewById<CheckBox>(R.id.checkBoxLearnQuickly)
        val checkBoxTrackMultiple = findViewById<CheckBox>(R.id.checkBoxTrackMultiple)

        buttonNext.setOnClickListener {
            val selectedExercises = StringBuilder("Selected exercises:")

            if (checkBoxLoseThings.isChecked) selectedExercises.append("\n- Lose things ")
            if (checkBoxRememberNames.isChecked) selectedExercises.append("\n- Remember names")
            if (checkBoxLearnQuickly.isChecked) selectedExercises.append("\n- Learn things quickly")
            if (checkBoxTrackMultiple.isChecked) selectedExercises.append("\n- Keep track of multiple things")

            if (selectedExercises.length > 20) {
                Toast.makeText(this, selectedExercises.toString(), Toast.LENGTH_LONG).show()
            } else {
                Toast.makeText(this, "No exercise selected", Toast.LENGTH_SHORT).show()
            }
        }
    }
}
