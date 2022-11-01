package com.example.roomdata

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import com.example.roomdata.databinding.ActivityMainBinding
import com.example.roomdata.databinding.FragmentAddEmployeeBinding
import com.google.android.material.textfield.TextInputEditText
import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.launch

class Add_Employee_Fragment : Fragment() {

 lateinit var database:DatabaseHelper

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        // Inflate the layout for this fragment
        var view = inflater.inflate(R.layout.fragment_add__employee_, container, false)

        context?.apply {
           database =DatabaseHelper.getDatabase(this)
       }

        view.findViewById<Button>(R.id.btn).setOnClickListener{
            var fName = view.findViewById<TextInputEditText>(R.id.First_name).text.toString()
            var lName = view.findViewById<TextInputEditText>(R.id.Last_name).text.toString()
            var contact = view.findViewById<TextInputEditText>(R.id.num).text.toString()
            var addree = view.findViewById<TextInputEditText>(R.id.address).text.toString()

            GlobalScope.launch {
                database.empDao().insertEmployee(EmployeeDetails(0, fName, lName, contact, addree))
            }
            view.findViewById<TextInputEditText>(R.id.First_name).setText("")
            view.findViewById<TextInputEditText>(R.id.Last_name).setText("")
            view.findViewById<TextInputEditText>(R.id.num).setText("")
            view.findViewById<TextInputEditText>(R.id.address).setText("")

        }

        return view
    }



}