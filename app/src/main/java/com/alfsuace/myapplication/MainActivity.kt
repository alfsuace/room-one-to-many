package com.alfsuace.myapplication

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.alfsuace.myapplication.data.SchoolDataRepository
import com.alfsuace.myapplication.data.StudentDataRepository
import com.alfsuace.myapplication.data.local.SchoolDataBase
import com.alfsuace.myapplication.data.local.SchoolLocalDataRepository
import com.alfsuace.myapplication.data.local.StudentLocalDataRepository
import com.alfsuace.myapplication.domain.School
import com.alfsuace.myapplication.domain.Student
import kotlin.concurrent.thread

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        initSchoolsAndStudents()
    }

    private fun initSchoolsAndStudents() {
        thread {
            val schoolRepo = SchoolDataRepository(SchoolLocalDataRepository(schoolDao = SchoolDataBase.getInstance(this).schoolDao()))
            val studentRepo = StudentDataRepository(StudentLocalDataRepository(studentDao = SchoolDataBase.getInstance(this).studentDao()))

            val school1 = School("1", "Alonso de Madrigal")
            val school2= School("2", "Vasco de la Zarza")

            val student1 = Student("1", "Alfonso")
            val student2 = Student("2", "Unai")
            val student3 = Student("3", "Hector")

            schoolRepo.saveSchool(school1)
            schoolRepo.saveSchool(school2)

            studentRepo.saveStudent(student1,"1")
            studentRepo.saveStudent(student2,"1")
            studentRepo.saveStudent(student3,"1")

            val escuelas = schoolRepo.getSchool()
            val estudiantesDadaEscuela = schoolRepo.getSchoolWithStudents("1")
            val estudiantes = studentRepo.getStudent()

            val paraBreakPoint=1
        }
    }
}