package com.stepanusryan.testprogram.ui.login

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.stepanusryan.testprogram.R
import com.stepanusryan.testprogram.databinding.ActivityLoginBinding
import com.stepanusryan.testprogram.ui.register.RegisterActivity

class LoginActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        val binding = ActivityLoginBinding.inflate(layoutInflater)
        super.onCreate(savedInstanceState)
        setContentView(binding.root)
        supportActionBar?.title = "Login"

        binding.btnRegister.setOnClickListener {
            startActivity(Intent(this@LoginActivity,RegisterActivity::class.java))
            finish()
        }
    }
}