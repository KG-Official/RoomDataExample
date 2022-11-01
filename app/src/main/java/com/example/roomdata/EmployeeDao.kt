package com.example.roomdata

import androidx.lifecycle.LiveData
import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Insert
import androidx.room.Query
import androidx.room.Update


@Dao
interface EmployeeDao {
    @Insert
    fun insertEmployee(data:EmployeeDetails)
    @Update
    fun updateEmployee(data:EmployeeDetails)
    @Delete
    fun deleteEmployee(data:EmployeeDetails)

    @Query("SELECT * FROM EmployeeDetails")
    fun getEmp() : LiveData<List<EmployeeDetails>>
}