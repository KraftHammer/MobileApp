package com.example.zenflow

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast

class registration : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_registration)

        val Login: EditText = findViewById(R.id.Reg_editTextLogin)
        val Password: EditText  = findViewById(R.id.Reg_editTextPassword)
        val RepeatPassword: EditText  = findViewById(R.id.Reg_editTextPassword2)
        val Btn: Button = findViewById(R.id.Reg_btn_to_bd)
        val Btn_auth: TextView = findViewById(R.id.Reg_btn_to_aut)

        Btn_auth.setOnClickListener {
            var intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
        }

        Btn.setOnClickListener {
            val login = Login.text.trim().toString()
            val pass = Password.text.trim().toString()
            val pass2 = RepeatPassword.text.trim().toString()

            if(login == "" || pass == "" || pass2 == ""){
                Toast.makeText(this, "Введите данные", Toast.LENGTH_LONG).show()

            }
            else if(pass != pass2){
                Toast.makeText(this, "Пароли не совпадают", Toast.LENGTH_LONG).show()
            }
            else{
                val user = User(login, pass)

                val db = DbHelper(this,null)
                db.addUser(user)
                Toast.makeText(this, "Пользователь добавлен", Toast.LENGTH_LONG). show()

                Login.text.clear()
                Password.text.clear()
                RepeatPassword.text.clear()
            }
        }
    }
}