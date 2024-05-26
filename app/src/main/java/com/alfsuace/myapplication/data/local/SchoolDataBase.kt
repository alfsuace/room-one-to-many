package com.alfsuace.myapplication.data.local

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase

@Database(entities = [SchoolEntity::class, StudentEntity::class], version = 1, exportSchema = false)
abstract class SchoolDataBase : RoomDatabase() {

    abstract fun schoolDao(): SchoolDao
    abstract fun studentDao(): StudentDao


    companion object {
        private var INSTANCE: SchoolDataBase? = null

        fun getInstance(context: Context): SchoolDataBase {

            return if (INSTANCE == null) {
                val instance = Room.databaseBuilder(
                    context.applicationContext,
                    SchoolDataBase::class.java,
                    "SchoolDataBase"
                ).build()
                INSTANCE = instance
                instance
            } else {
                INSTANCE!!
            }
        }
    }
}