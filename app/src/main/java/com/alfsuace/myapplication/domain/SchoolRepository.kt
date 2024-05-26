package com.alfsuace.myapplication.domain

interface SchoolRepository {

    fun getSchool():List<School>

    fun saveSchool(school: School)

    fun getSchoolWithStudents(schoolId: String):List<Student>
}