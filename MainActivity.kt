package com.example.to_do_application

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast

val userNameOriginal="Lakshmi Aparna"
val passwordOriginal="Aparna@1205"
class MainActivity : AppCompatActivity() {
    lateinit var username:EditText
    lateinit var password:EditText
    lateinit var login_btn:Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        username=findViewById(R.id.edtTxt_username)
        password=findViewById(R.id.edtTxt_password)
        login_btn=findViewById(R.id.btn_login)

        login_btn.setOnClickListener(){
            if(username.text.toString().equals(userNameOriginal) &&
                    password.text.toString().equals(passwordOriginal)
                    ){
                Toast.makeText(this,"Logged in Successfully",Toast.LENGTH_LONG).show()
                val intent=Intent(this,ToDoList::class.java)
                startActivity(intent)
                finish()
            }

        }
    }
}