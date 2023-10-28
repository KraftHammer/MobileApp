package com.example.zenflow


import android.app.Notification
import android.content.Intent
import android.media.Image
import android.os.Build
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import androidx.core.app.NotificationCompat
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.async
import kotlinx.coroutines.channels.Channel
import org.json.JSONObject
import java.net.URL

class main_menu : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main_menu)

        val number: Array<String> = arrayOf(
            "Одно слово. Выберите слово, которое вас вдохновляет или просто нравится, и на протяжении 5 минут мысленно его повторяйте, ни думая больше ни о чем.",
            "Делите цели на мелкие задачи. Чтобы собрать свой рассеянный ум воедино, нужно поставить перед собой ясные цели и конкретные задачи.",
            "Сохраняйте физическую активность Помните, старая поговорка «В здоровом теле — здоровый дух». Занимайтесь тем, что вам приносит удовольствие",
            "Общайтесь, создавайте позитивные личные связи: любой человек, который вас выслушает и постарается понять",
            "Будьте щедрыми и полезными другим людям, тем самым укрепляя свое эмоциональное и психологическое здоровье.",
            "Справляйтесь со стрессом, отложите все срочные дела и займитесь чем-то, что вам доставляет удовольствие.")
        val score: Int = (0..6).random()


        val key: String = "beff1410e1ce24a8d3f42b0378031768"
        val city: String = "Barnaul"
        val url: String = "https://api.openweathermap.org/data/2.5/weather?q=$city&appid=$key"

        val btn_tomedi: Button = findViewById(R.id.Main_menu_tomeditation)
        val btn_spr: Button = findViewById(R.id.Main_menu_tosprav)
        val btn_ach: Button = findViewById(R.id.Main_menu_toach)
        val btn_melodi: Button = findViewById(R.id.Main_menu_tomelodi)
        val btn_lit: Button = findViewById(R.id.Main_menu_toliter)
        val btn_set: ImageView = findViewById(R.id.btn_setting)
        val sovet: TextView = findViewById(R.id.textsovet)

        sovet.text = number[score]

        val weatherInfo: TextView = findViewById(R.id.textWeather)

        try {
            GlobalScope.async(Dispatchers.Default) {
                val ApiResponse = URL(url).readText()

                val weather = JSONObject(ApiResponse).getJSONObject("main")
                val desc = weather.getString("temp")

                weatherInfo.text = "qwe"
            }
        } catch (ex: Exception) {
            Toast.makeText(this, "$ex", Toast.LENGTH_SHORT).show()
        }

        btn_tomedi.setOnClickListener {
            val intent = Intent(this, meditation_main_menu::class.java)
            startActivity(intent)
        }
        btn_spr.setOnClickListener {
            val intent = Intent(this, setting_main_window::class.java)
            startActivity(intent)
        }
        btn_ach.setOnClickListener {
            val intent = Intent(this, setting_main_window::class.java)
            startActivity(intent)
        }
        btn_melodi.setOnClickListener {
            val intent = Intent(this, setting_main_window::class.java)
            startActivity(intent)
        }
        btn_set.setOnClickListener {
            val intent = Intent(this, setting_main_window::class.java)
            startActivity(intent)
        }
        btn_lit.setOnClickListener {
            val intent = Intent(this, book_main::class.java)
            startActivity(intent)
        }
    }
}