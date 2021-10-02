package com.example.breakingbadapp.activities

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.content.Intent
import android.widget.EditText
import android.widget.TextView
import com.example.breakingbadapp.R
import com.example.breakingbadapp.activities.main.MainActivity


class LoginActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

        val btnLogin = findViewById<Button>(R.id.btnLogin)
        val edtEmail = findViewById<EditText>(R.id.edtEmail)
        val edtPassword = findViewById<EditText>(R.id.edtPassword)
        val txvError = findViewById<TextView>(R.id.txvError)

        var email = edtEmail.text


        btnLogin.setOnClickListener()
        {
0
            val intento1 = Intent(this, MainActivity::class.java)

            if(email.length > 6)
            {
                if(edtPassword.text.length > 3)
                {
                    for(i in email.indices)
                    {
                        if(email[i] == '@')
                            startActivity(intento1)
                    }
                    txvError.text = getString(R.string.emailError)
                }
                else
                    txvError.text = getString(R.string.passError)
            }
            else
                txvError.text = getString(R.string.emailError)






        }
    }
}