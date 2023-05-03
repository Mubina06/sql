package com.example.lessonsql.UTIL

import com.example.lessonsql.models.Student

interface CURD {
    fun insert(student: Student)
//    fun delete(student: Student)
    fun loadList():MutableList<Student>
}