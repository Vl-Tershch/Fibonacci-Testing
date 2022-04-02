package com.example.fibbapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import org.w3c.dom.Text

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val button = findViewById<Button>(R.id.button)
        val textInput = findViewById<EditText>(R.id.editText)
        val textRez = findViewById<TextView>(R.id.textView2)
        button.setOnClickListener {
            var rez = Fibonnachi(textInput.text.toString().toInt())
            textRez.setText(rez.toString())
        }
    }

    fun Fibonnachi(num: Int):Int {
        var f0 = 0
        var f1 = 1
        var c = 2
        if (num == 0)
            return 0
        else if (num == 1)
            return 1
        else {
            while (c < num) {
                var help = f1 + f0
                f0 = f1
                f1 = help
                c += 1
            }
        }
        return f1
    }
}