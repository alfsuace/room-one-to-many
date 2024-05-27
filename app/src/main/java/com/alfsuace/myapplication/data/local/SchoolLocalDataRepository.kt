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

}