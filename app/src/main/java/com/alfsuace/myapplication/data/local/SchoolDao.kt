package com.alfsuace.myapplication.data.local

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import androidx.room.Transaction
import com.alfsuace.myapplication.domain.School

@Dao
interface SchoolDao {
    @Query("SELECT * FROM $SCHOOl_TABLE")
    fun getSchool ():List<SchoolEntity>

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    fun saveSchool(schoolEntity: SchoolEntity)

}