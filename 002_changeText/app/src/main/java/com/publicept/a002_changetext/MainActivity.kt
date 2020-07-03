package com.publicept.a002_changetext

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)  // res/layout/activity_main.xml

        // res/layout/activity_main.xml ->
        ok_button.setOnClickListener {                  // Button:      id = ok_button
            val firstName = first_name.text.toString()  // EditText:    id = first_name
            result.text = firstName                     // TextView:    id = result
        }
    }
}