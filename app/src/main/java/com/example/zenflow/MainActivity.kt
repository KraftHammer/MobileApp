package com.example.zenflow

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btn_reg: TextView = findViewById(R.id.btn_to_reg)
        val btn_menu: Button = findViewById(R.id.btn_to_menu)
        val Login: EditText = findViewById(R.id.editTextLogin)
        val Password: EditText = findViewById(R.id.editTextPassword)

        btn_reg.setOnClickListener {
            val intent: Intent = Intent(this, registration::class.java)
            startActivity(intent)
        }

        btn_menu.setOnClickListener {
            val login = Login.text.trim().toString()
            val pass = Password.text.trim().toString()

            if(login.equals("") || pass.equals("")){
                Toast.makeText(this, "Введите данные", Toast.LENGTH_SHORT).show()
            }
            else{
                val db = DbHelper(this,null)
                val isAut = db.getUser(login, pass)

                if(isAut){
                    Toast.makeText(this, "Пользователь $login авторизован", Toast.LENGTH_LONG).show()
                    Login.text.clear()
                    Password.text.clear()

                    val intent = Intent(this, registration::class.java)
                    startActivity(intent)
                }
                else{
                    Toast.makeText(this, "Пользователь $login не авторизован", Toast.LENGTH_LONG).show()
                }
            }
        }
    }
}