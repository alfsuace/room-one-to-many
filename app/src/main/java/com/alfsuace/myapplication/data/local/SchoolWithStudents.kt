package com.alfsuace.myapplication.data.local

import androidx.room.Embedded
import androidx.room.Relation

data class SchoolWithStudents (
    @Embedded val school: SchoolEntity,
    @Relation(
        parentColumn = "schoolId",
        entityColumn = "schoolId"
    )
    val students: List<StudentEntity>
)