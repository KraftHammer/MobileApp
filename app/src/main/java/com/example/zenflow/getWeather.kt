package com.example.zenflow

import android.app.DownloadManager.Request
import org.json.JSONObject

class getWeather(val API:String, val city:String) {
    val link:String = "https://api.openweathermap.org/data/2.5/weather?q=$city&appid=$API"
    val jsonObj = JSONObject(link)

    val main= jsonObj.getJSONObject("main")

     val temp = main.getString("temp")
}