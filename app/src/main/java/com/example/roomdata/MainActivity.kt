package com.example.roomdata

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.navigation.fragment.NavHostFragment
import androidx.navigation.ui.NavigationUI
import com.example.roomdata.databinding.ActivityMainBinding
import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.launch

class MainActivity : AppCompatActivity() {
    lateinit var binding:ActivityMainBinding
    lateinit var database:DatabaseHelper

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)


//        database =DatabaseHelper.getDatabase(this)
//
//        binding.btn.setOnClickListener{
//            var fName = binding.FirstName.text.toString()
//            var lName = binding.LastName.text.toString()
//            var contact = binding.num.text.toString()
//            var addree = binding.address.text.toString()
//
//            GlobalScope.launch {
//                database.empDao().insertEmployee(EmployeeDetails(0, fName, lName, contact, addree))
//            }
//            binding.FirstName.setText("")
//            binding.LastName.setText("")
//            binding.num.setText("")
//            binding.address.setText("")
//        }
    }

}