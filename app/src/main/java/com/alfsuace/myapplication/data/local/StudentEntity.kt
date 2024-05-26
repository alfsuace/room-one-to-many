package com.alfsuace.myapplication.data.local

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

const val STUDENT_TABLE="student"

@Entity(tableName = STUDENT_TABLE)
data class StudentEntity(
    @PrimaryKey @ColumnInfo(name="studentId") val studentId: String,
    @ColumnInfo(name = "schoolId")val schoolId: String,
    @ColumnInfo(name = "name") val name: String
)