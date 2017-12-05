package com.example.school.todolist2

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import kotlinx.android.synthetic.main.task_row.view.*


class TaskAdapter(val context: Context, var tasks: MutableList<Task>) : BaseAdapter() {


    override fun getView(position: Int, convertView: View?, parent: ViewGroup?): View {

        var v: View? = convertView

        if(v == null){

            val inflater = context.getSystemService(Context.LAYOUT_INFLATER_SERVICE) as LayoutInflater

            v = inflater.inflate(R.layout.task_row, null)

            v.task_title_textView.text = tasks[position].title

            v.description_textView.text = tasks[position].description

        }

        return v!!

    }

    override fun getItem(position: Int): Any {
        return tasks[position]
    }

    override fun getItemId(position: Int): Long {
        return position.toLong()
    }

    override fun getCount(): Int {
        return tasks.size
    }


}