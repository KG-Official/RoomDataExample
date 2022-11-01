package com.example.roomdata

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView.Adapter
import androidx.recyclerview.widget.RecyclerView.ViewHolder

class EmployeeAdapter(var empList: List<EmployeeDetails>):Adapter<EmployeeAdapter.myViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): myViewHolder {
        val inflater = LayoutInflater.from(parent.context)
        val view = inflater.inflate(R.layout.custom_list,parent,false)
        return myViewHolder(view)
    }

    override fun onBindViewHolder(holder: myViewHolder, position: Int) {

       holder.empName.text = empList.get(position).empFirstName + " " + empList.get(position).empLastName
       holder.empAddress.text = empList.get(position).empAddress
       holder.empContact.text = empList.get(position).empContact

    }

    override fun getItemCount(): Int {
        return empList.size
    }
    class myViewHolder(itemView: View) : ViewHolder(itemView){
        var empName = itemView.findViewById<TextView>(R.id.name)
        var empAddress = itemView.findViewById<TextView>(R.id.myAdress)
        var empContact = itemView.findViewById<TextView>(R.id.cont)
    }
}



