package com.example.roomdata

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.lifecycle.Observer
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView


class Show_Employee_Fragment : Fragment() {
    lateinit var database:DatabaseHelper

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        context?.apply {
            database =DatabaseHelper.getDatabase(this)
        }
        var view = inflater.inflate(R.layout.fragment_show__employee_, container, false)
        var empList =  view.findViewById<RecyclerView>(R.id.recyclerView_Employee_List)


        database.empDao().getEmp().observe(viewLifecycleOwner, Observer {

            empList.adapter = EmployeeAdapter(it)
            empList.layoutManager = LinearLayoutManager(context)
        })


        return view
    }

}

