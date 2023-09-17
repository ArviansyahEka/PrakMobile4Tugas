package com.example.prakmobile4tugas

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.prakmobile4tugas.databinding.ActivityMain2Binding


class SecondActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMain2Binding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMain2Binding.inflate(layoutInflater)
        setContentView(binding.root)
        val name = intent.getStringExtra(MainActivity.uname)
        val email = intent.getStringExtra(MainActivity.email)
        val phone = intent.getStringExtra(MainActivity.phone)
//        val sayname = "Welcome $name"
//        val sayemail = "Your $email has been activated"
//        val sayphone = "Welcome $phone has been registered"

        with(binding){
            ambilUname.text = name
            ambilEmail.text = email
            ambilPhone.text = phone
        }
    }

}

