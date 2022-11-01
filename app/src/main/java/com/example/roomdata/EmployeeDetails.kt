package com.example.roomdata

import androidx.room.Entity
import androidx.room.PrimaryKey


@Entity(tableName = "EmployeeDetails")
data class EmployeeDetails(
    @PrimaryKey(autoGenerate = true)
    var empId:Long,
    var empFirstName:String,
    var empLastName:String,
    var empContact:String,
    var empAddress:String
)
