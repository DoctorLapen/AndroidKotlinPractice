package com.lapin.task45

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.EditText
import android.widget.TextView

const val EXTRA_MESSAGE = "com.example.myfirstapp.MESSAGE"
class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        findViewById<TextView>(R.id.stamp).text = Stamp.printTimeStamp("Lapin Kostiantyn");
    }
    fun sendMessage(view: View) {
        // Do something in response to button
        val nameField = findViewById<EditText>(R.id.name)
        val name = nameField.text.toString()
        val surnameField = findViewById<EditText>(R.id.surname)
        val surname = surnameField.text.toString()
        val message = "$name  $surname"

        val intent = Intent(this, DisplayMessageActivity::class.java).apply {
            putExtra(EXTRA_MESSAGE, message)
        }
        startActivity(intent)
    }

}
