package com.app.unittestcase

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class LoginActivity: AppCompatActivity(){

    private lateinit var usernameEditText: EditText
    private lateinit var passwordEditText: EditText
    private lateinit var loginTitleTextView: TextView
    private lateinit var clickButton:Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

        usernameEditText = findViewById(R.id.username)
        passwordEditText = findViewById(R.id.password)
        clickButton = findViewById(R.id.btnlogin)
        loginTitleTextView = findViewById(R.id.login)

        clickButton.setOnClickListener {
            if (usernameEditText.text.toString() == "thakre" &&
                passwordEditText.text.toString() == "123"
            ){
                loginTitleTextView.text="Success"

            }else{
                loginTitleTextView.text="Failure"
            }
        }
    }

 }
