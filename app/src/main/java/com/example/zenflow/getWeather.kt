package com.example.zenflow

import android.app.DownloadManager.Request
import android.text.Editable
import org.json.JSONObject

class getWeather(val API:String, val city:String){

    val link = "https://api.openweathermap.org/data/2.5/weather?q=$city&appid=$API"
    val jsonObj = JSONObject(link)

    val main = jsonObj.getJSONArray("main").getJSONObject(0)
    val temp = main.getJSONObject("temp").toString()

}