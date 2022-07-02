package com.stepanusryan.testprogram.ui.register

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.stepanusryan.testprogram.R
import com.stepanusryan.testprogram.api.APIConfig
import com.stepanusryan.testprogram.databinding.ActivityRegisterBinding
import com.stepanusryan.testprogram.model.User
import com.stepanusryan.testprogram.ui.login.LoginActivity
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

class RegisterActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        val binding = ActivityRegisterBinding.inflate(layoutInflater)
        super.onCreate(savedInstanceState)
        setContentView(binding.root)
        supportActionBar?.title = "Login"
        var email = binding.editTextEmail.text.toString()
        var username = binding.editTextUsername.text.toString()
        var password = binding.editTextPassword.text.toString()

        binding.btnRegister.setOnClickListener {
            var user = User(email,username,password)
            val client = APIConfig.getLogin().addUser(user)
            client.enqueue(object : Callback<User>{
                override fun onResponse(call: Call<User>, response: Response<User>) {
                    Toast.makeText(this@RegisterActivity,response.toString(),Toast.LENGTH_SHORT).show()
                }

                override fun onFailure(call: Call<User>, t: Throwable) {
                    Toast.makeText(this@RegisterActivity,t.message,Toast.LENGTH_SHORT).show()
                }

            })



            startActivity(Intent(this@RegisterActivity,LoginActivity::class.java))
            finish()
        }
    }
}