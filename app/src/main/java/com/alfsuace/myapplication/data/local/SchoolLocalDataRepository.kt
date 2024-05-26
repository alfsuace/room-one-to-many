package com.alfsuace.myapplication.data.local

import com.alfsuace.myapplication.domain.School
import com.alfsuace.myapplication.domain.Student

class SchoolLocalDataRepository(private val schoolDao: SchoolDao){

     fun getSchool():List<School>{
        return schoolDao.getSchool().map {
            it.toModel()
        }
    }

    fun saveSchool(school: School){
        schoolDao.saveSchool(school.toEntity())
    }

    fun getStudentsFromSchool(schoolId: String): List<Student> {
        val studentsList = mutableListOf<Student>()
        schoolDao.getSchoolWithStudents(schoolId).map { schoolWithStudents ->
            schoolWithStudents.students.forEach{
                studentsList.add(it.toModel())
            }
        }
        return studentsList
    }

}