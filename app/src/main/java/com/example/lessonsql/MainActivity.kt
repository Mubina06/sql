package com.example.lessonsql

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.lessonsql.UTIL.DBHelper
import com.example.lessonsql.models.Student

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val db = DBHelper(this)
        db.insert(Student(name = "Mubina Shukrullayeva", phone_number = "+998998128012"))
    }
}