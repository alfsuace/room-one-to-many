package com.alfsuace.myapplication.domain

interface StudentRepository {

    fun getStudent(): List<Student>

    fun saveStudent(student: Student, schoolId: String)

    fun getSchoolWithStudents(schoolId: String): List<Student>
}