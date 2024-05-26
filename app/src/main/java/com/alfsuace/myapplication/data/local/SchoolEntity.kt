package com.alfsuace.myapplication.data.local

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

const val SCHOOl_TABLE ="school"
@Entity(tableName = SCHOOl_TABLE )
data class SchoolEntity (
    @PrimaryKey @ColumnInfo(name ="schoolId") val schoolId: String,
    @ColumnInfo(name = "name") val name: String
)