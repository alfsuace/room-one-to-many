package com.alfsuace.myapplication.data.local

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query

@Dao
interface StudentDao {
    @Query("SELECT * FROM $STUDENT_TABLE")
    fun getStudents ():List<StudentEntity>

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    fun saveStudent(studentEntity: StudentEntity)
}