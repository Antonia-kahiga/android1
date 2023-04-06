package com.example.main_login
// use intent to link the two pages
import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class Loginactivity : AppCompatActivity() {
//    declare variable with lateinit
    lateinit var button2register:Button
    @SuppressLint("MissingInflateId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_loginactivity)
        button2register=findViewById(R.id.Btn_back2re)
//        use the one with curly braces
        button2register.setOnClickListener {
           val intent= Intent(this,MainActivity::class.java)
            startActivity(intent)
        }
    }
}