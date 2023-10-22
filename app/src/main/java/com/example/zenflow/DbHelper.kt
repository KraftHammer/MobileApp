package com.example.zenflow

import android.content.ContentValues
import android.content.Context
import android.database.sqlite.SQLiteDatabase
import android.database.sqlite.SQLiteDatabase.CursorFactory
import android.database.sqlite.SQLiteOpenHelper

class DbHelper(val context: Context, val factory: CursorFactory?) : SQLiteOpenHelper(context, "ZenFlow", factory, 1) {
    override fun onCreate(db: SQLiteDatabase?) {
        db!!.execSQL("CREATE TABLE users (id INT PRIMARY KEY, login TEXT, pass TEXT)")
        db!!.execSQL("CREATE TABLE guide (id INT PRIMARY KEY, title TEXT, description TEXT, image BLOB)")

    }

    override fun onUpgrade(db: SQLiteDatabase?, p1: Int, p2: Int) {
        db!!.execSQL("DROP TABLE IF EXISTS users")
        onCreate(db)
    }

    fun addGuide(guide:Guide){
        val values = ContentValues()
        values.put("title", guide.Title)
        values.put("description", guide.Description)
        values.put("image", guide.Image)

        val db = this.writableDatabase
        db.insert("guide", null, values)
    }

    fun addUser(user:User){
        val values = ContentValues()
        values.put("login", user.login)
        values.put("pass", user.password)

        val db = this.writableDatabase
        db.insert("users", null, values)

        db.close()
    }

    fun getUser(login: String, password: String) : Boolean{
        val db = this.readableDatabase

        val results = db.rawQuery("SELECT * FROM users WHERE login = '$login' AND pass = '$password'", null)
        return  results.moveToFirst()
    }
    fun getGuide(title: String, desc: String) : Boolean{
        val db = this.readableDatabase

        val results = db.rawQuery("SELECT * FROM guide WHERE title = '$title' AND description = '$desc'",null)
        return results.moveToFirst()
    }
}