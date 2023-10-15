package com.example.zenflow

import android.content.Context
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Gravity
import android.view.LayoutInflater
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import org.w3c.dom.Text

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
                errortoast(this, "Введите данные", Toast.LENGTH_SHORT).show()
            }
            else{
                val db = DbHelper(this,null)
                val isAut = db.getUser(login, pass)

                if(isAut){
                    errortoast(this, "Пользователь авторизован", Toast.LENGTH_LONG).show()

                    Login.text.clear()
                    Password.text.clear()

                    val intent = Intent(this, main_menu::class.java)
                    startActivity(intent)
                }
                else{
                    errortoast(this, "Пользователь не авторизован", Toast.LENGTH_LONG).show()
                }
            }
        }
    }
    private fun errortoast(context: Context, title:String, duration: Int) : Toast{
        val layout = layoutInflater.inflate(R.layout.toast_custom, findViewById(R.id.linearlayout))
        layout.findViewById<TextView>(R.id.customToast).text = title

        val myToast = Toast(context)
        myToast.duration = duration
        myToast.setGravity(Gravity.TOP,0,0)
        myToast.view = layout

        return myToast
    }
}