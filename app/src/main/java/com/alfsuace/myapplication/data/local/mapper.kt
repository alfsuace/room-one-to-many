package com.alfsuace.myapplication.data.local

import com.alfsuace.myapplication.domain.School
import com.alfsuace.myapplication.domain.Student

fun SchoolEntity.toModel():School{
    return School(
        this.schoolId,
        this.name
    )
}

fun School.toEntity():SchoolEntity{
    return SchoolEntity(
        this.schoolId,
        this.name
    )
}

fun StudentEntity.toModel(): Student{
    return Student(
        this.studentId,
        this.name,
    )
}

fun Student.toEntity(schoolId: String):StudentEntity{
    return StudentEntity(
        this.studentId,
        schoolId,
        this.name
    )
}