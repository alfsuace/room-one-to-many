package com.alfsuace.myapplication.data

import com.alfsuace.myapplication.data.local.StudentLocalDataRepository
import com.alfsuace.myapplication.domain.Student
import com.alfsuace.myapplication.domain.StudentRepository

class StudentDataRepository(private val studentLocalDataRepository: StudentLocalDataRepository):StudentRepository {
    override fun getStudent(): List<Student> {
        return studentLocalDataRepository.getStudents()
    }

    override fun saveStudent(student: Student, schoolId: String) {
        studentLocalDataRepository.saveStudents(student, schoolId)
    }
}