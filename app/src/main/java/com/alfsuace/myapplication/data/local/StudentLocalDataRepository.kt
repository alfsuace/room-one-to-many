package com.alfsuace.myapplication.data.local

import com.alfsuace.myapplication.domain.Student

class StudentLocalDataRepository(private val studentDao: StudentDao) {

    fun getStudents(): List<Student>{
        return studentDao.getStudents().map {
            it.toModel()
        }
    }

    fun saveStudents(student: Student, schoolId: String){
        studentDao.saveStudent(student.toEntity(schoolId))
    }

    fun getStudentsFromSchool(schoolId: String): List<Student> {
        val studentsList = mutableListOf<Student>()
        studentDao.getSchoolWithStudents(schoolId).map { schoolWithStudents ->
            schoolWithStudents.students.forEach{
                studentsList.add(it.toModel())
            }
        }
        return studentsList
    }
}