package com.infinitelearning.baligo

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class ToDoListAdapter : RecyclerView.Adapter<ToDoListAdapter.ToDoViewHolder>() {
    private val toDoList = mutableListOf<String>()

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ToDoViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.activity_item_todo, parent, false)
        return ToDoViewHolder(view)
    }

    override fun onBindViewHolder(holder: ToDoViewHolder, position: Int) {
        val toDoItem = toDoList[position]
        holder.bind(toDoItem)
    }

    override fun getItemCount(): Int {
        return toDoList.size
    }

    fun addToList(toDoItem: String) {
        toDoList.add(toDoItem)
        notifyItemInserted(toDoList.size - 1)
    }

    inner class ToDoViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        private val textView: TextView = itemView.findViewById(R.id.textView)

        fun bind(toDoItem: String) {
            textView.text = toDoItem
        }
    }
}