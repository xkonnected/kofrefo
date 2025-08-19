package com.example.kofrefo

import android.annotation.SuppressLint
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.constraintlayout.widget.ConstraintLayout
import com.example.kofrefo.ui.theme.KofrefoTheme

class MainActivity : ComponentActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
//        enableEdgeToEdge()
//        setContent {
//            KofrefoTheme {
//                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
//                    Greeting(
//                        name = "from Wesly",
//                        modifier = Modifier.padding(innerPadding)
//                    )
//                }
//            }
//        }


        setContentView(R.layout.activity_main)
        val textView= findViewById<TextView>(R.id.hello_text)
        val button2= findViewById<Button>(R.id.button2)
        button2.setOnClickListener {
            textView.setTextColor(getResources().getColor(R.color.teal_200))
        }

        val viewColor= findViewById<ConstraintLayout>(R.id.background)
        val button4= findViewById<Button>(R.id.button4)
        button4.setOnClickListener {
            viewColor.setBackgroundColor(getResources().getColor(R.color.black))
        }

        val textString= findViewById<EditText>(R.id.editTextString)
        val button5= findViewById<Button>(R.id.button5)
        button5.setOnClickListener {
            val textInserted= textString.text
            textView.text=textInserted
        }
    }
}
