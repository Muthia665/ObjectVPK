package com.example.user.objectvpk

import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import kotlinx.android.synthetic.main.grid_listitem.view.*
import java.util.*

class ObjectAdapter2 (private val objectlist: List<Object>) : RecyclerView.Adapter<ObjectHolder2>(){
    override fun onCreateViewHolder(p0: ViewGroup, p1: Int): ObjectHolder2 {
        return ObjectHolder2(LayoutInflater.from(p0.context).inflate(R.layout.grid_listitem,p0,false))
    }

    override fun getItemCount(): Int {
        return objectlist.size
    }

    override fun onBindViewHolder(p0: ObjectHolder2, p1: Int) {
        p0.bindObject(objectlist[p1])
    }

}

class ObjectHolder2(view: View) : RecyclerView.ViewHolder(view){
    private val tvObject2 = view.txtItem2
    private val imgObject2 = view.imgItem2

    fun bindObject(objects: Object) {
        tvObject2.text = objects.nama
        imgObject2.setImageResource(objects.gambar)

        itemView.setOnClickListener {
            Toast.makeText(itemView.context, objects.nama, Toast.LENGTH_SHORT).show()

        }
    }
}
