package com.example.zenflow

import android.content.Context
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Gravity
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast

class registration : AppCompatActivity() {
    public override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_registration)

        val Login: EditText = findViewById(R.id.Reg_editTextLogin)
        val Password: EditText  = findViewById(R.id.Reg_editTextPassword)
        val RepeatPassword: EditText  = findViewById(R.id.Reg_editTextPassword2)
        val Btn: Button = findViewById(R.id.Reg_btn_to_bd)
        val Btn_auth: TextView = findViewById(R.id.Reg_btn_to_aut)

        Btn_auth.setOnClickListener {
            var intent = Intent(this, main_menu::class.java)
            startActivity(intent)
        }

        Btn.setOnClickListener {
            val login = Login.text.trim().toString()
            val pass = Password.text.trim().toString()
            val pass2 = RepeatPassword.text.trim().toString()

            if(login == "" || pass == "" || pass2 == ""){
                errortoast(this, "Введите данные", Toast.LENGTH_SHORT).show()
            }
            else if(pass != pass2){
                errortoast(this, "Пароли не совпадают", Toast.LENGTH_SHORT).show()

            }
            else{
                val user = User(login, pass)
                val db = DbHelper(this,null)

                db.addUser(user)
                errortoast(this, "Пользователь добавлен", Toast.LENGTH_SHORT).show()
                Login.text.clear()
                Password.text.clear()
                RepeatPassword.text.clear()
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