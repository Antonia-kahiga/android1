package com.example.main_login
//to link the 2 pages...intent
import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
//   to declare a variable use lateinit
    lateinit var buttonlogin:Button
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        buttonlogin=findViewById(R.id.Btn_gotologin)
/* always use the one with curly braces */
        buttonlogin.setOnClickListener {
            val intent= Intent(this,Loginactivity::class.java)
            startActivity(intent)
        }
    }
}