package com.example.roomdata

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase

@Database(entities = [EmployeeDetails::class], version = 1)
abstract class DatabaseHelper : RoomDatabase() {

    abstract fun empDao() : EmployeeDao


    companion object{
        private var INSTANCE : DatabaseHelper? = null
        fun getDatabase(context:Context):DatabaseHelper{
            if (INSTANCE == null)
            {
                synchronized(this){
                    INSTANCE =  Room.databaseBuilder(context.applicationContext,DatabaseHelper::class.java,"myDB").build()
                }
            }
            return INSTANCE!!

        }
    }
}