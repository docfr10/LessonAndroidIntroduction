package com.example.lesson_androidintroduction

import android.os.Build
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.EditText
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import androidx.annotation.RequiresApi
import androidx.appcompat.app.AppCompatActivity
import androidx.constraintlayout.widget.ConstraintLayout
import com.example.lesson_androidintroduction.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    @RequiresApi(Build.VERSION_CODES.M)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        Toast.makeText(applicationContext, "App is create", Toast.LENGTH_LONG).show()

        val name = getString(R.string.name)
        val array = resources.getStringArray(R.array.array)
        val color = getColor(R.color.color)

        val root = findViewById<ConstraintLayout>(R.id.root)
        val textView = TextView(this)
        textView.text = "Some text"
        root.addView(textView)

        val editText: EditText = findViewById(R.id.editTextPhone)
        editText.setText("1234")
        val text = editText.text.toString()

        val imageView: ImageView = findViewById(R.id.imageView)
        imageView.setImageResource(R.drawable.ic_launcher_background)

        val button: Button = findViewById(R.id.button)
        button.setOnClickListener {
            Toast.makeText(applicationContext, "Click", Toast.LENGTH_LONG).show()
        }
    }

    override fun onResume() {
        super.onResume()
        binding.textView2.setText("New text")
    }

    override fun onPause() {
        super.onPause()
        Log.i("Info", "App is pause")
    }
}