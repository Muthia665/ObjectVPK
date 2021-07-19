package com.example.user.objectvpk

import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import kotlinx.android.synthetic.main.fragment_grid.view.*
import kotlinx.android.synthetic.main.fragment_list.view.*
import kotlinx.android.synthetic.main.list_listitem.view.*
import java.util.*

class ObjectAdapter (private val objectlist: List<Object>) : RecyclerView.Adapter<ObjectHolder>(){
    override fun onCreateViewHolder(p0: ViewGroup, p1: Int): ObjectHolder {
        return ObjectHolder(LayoutInflater.from(p0.context).inflate(R.layout.list_listitem,p0,false))
    }

    override fun getItemCount(): Int {
        return objectlist.size
    }

    override fun onBindViewHolder(p0: ObjectHolder, p1: Int) {
        p0.bindObject(objectlist[p1])
    }
}

class ObjectHolder (view : View) : RecyclerView.ViewHolder(view){
    private val tvObject = view.txtItem1
    private val imgObject = view.imgItem1

    fun bindObject(objects: Object) {
        tvObject.text = objects.nama
        imgObject.setImageResource(objects.gambar)

        itemView.setOnClickListener {
            Toast.makeText(itemView.context, objects.nama, Toast.LENGTH_SHORT).show()
        }
    }
}