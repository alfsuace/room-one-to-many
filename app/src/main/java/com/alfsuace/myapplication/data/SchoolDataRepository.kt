package com.alfsuace.myapplication.data

import com.alfsuace.myapplication.data.local.SchoolLocalDataRepository
import com.alfsuace.myapplication.domain.School
import com.alfsuace.myapplication.domain.SchoolRepository
import com.alfsuace.myapplication.domain.Student

class SchoolDataRepository(private val schoolDataRepository: SchoolLocalDataRepository) :
    SchoolRepository {
    override fun getSchool(): List<School> {
        return schoolDataRepository.getSchool()
    }

    override fun saveSchool(school: School) {
        schoolDataRepository.saveSchool(school)
    }

    override fun getSchoolWithStudents(schoolId: String): List<Student> {
        return schoolDataRepository.getStudentsFromSchool(schoolId)
    }

}