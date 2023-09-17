package com.example.prakmobile4tugas

import androidx.appcompat.app.AppCompatActivity
import android.content.Intent
import android.os.Bundle
import com.example.prakmobile4tugas.databinding.ActivityMainBinding


class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding
    companion object{
        const val uname = "uname"
        const val email = "email"
        const val phone = "phone"
        const val pass = "pass"
    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        with(binding) {
            btnregis.setOnClickListener {
                val intentToSecondActivity =
                    Intent(this@MainActivity, MainAc::class.java)
                intentToSecondActivity.putExtra(uname, inputUsername.text.toString())
                intentToSecondActivity.putExtra(email, inputEmail.text.toString())
                intentToSecondActivity.putExtra(phone, inputPhone.text.toString())
                intentToSecondActivity.putExtra(pass, inputPassword.text.toString())
                startActivity(intentToSecondActivity)
            }
        }


    }
}