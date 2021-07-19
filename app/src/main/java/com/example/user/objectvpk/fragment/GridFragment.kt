package com.example.user.objectvpk.fragment


import android.os.Bundle
import android.support.v4.app.Fragment
import android.support.v7.widget.GridLayoutManager
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.user.objectvpk.Object
import com.example.user.objectvpk.ObjectAdapter
import com.example.user.objectvpk.ObjectAdapter2

import com.example.user.objectvpk.R
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.fragment_grid.*
import kotlinx.android.synthetic.main.fragment_list.*

// TODO: Rename parameter arguments, choose names that match
// the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
private const val ARG_PARAM1 = "param1"
private const val ARG_PARAM2 = "param2"

/**
 * A simple [Fragment] subclass.
 *
 */
class GridFragment : Fragment() {

    val listObject = listOf(
        Object(gambar = R.drawable.bench, nama = "Bench"),
        Object(gambar = R.drawable.book, nama = "Book"),
        Object(gambar = R.drawable.chair, nama = "Chair"),
        Object(gambar = R.drawable.door, nama = "Door"),
        Object(gambar = R.drawable.eyeglasses, nama = "Eye Glasses"),
        Object(gambar = R.drawable.laptop, nama = "Laptop"),
        Object(gambar = R.drawable.pen, nama = "Pen"),
        Object(gambar = R.drawable.table, nama = "Table"),
        Object(gambar = R.drawable.television, nama = "Television"),
        Object(gambar = R.drawable.whiteboard, nama = "White Board")
    )

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? =  inflater.inflate(R.layout.fragment_grid, container, false)

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val gridadapter = ObjectAdapter2(listObject)

        recyclerView2.apply {
            layoutManager = GridLayoutManager(activity,3)
            adapter = gridadapter
        }

    }

}
