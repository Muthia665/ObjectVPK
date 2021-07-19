package com.example.user.objectvpk

import android.support.v4.app.Fragment
import android.support.v4.app.FragmentManager
import android.support.v4.app.FragmentPagerAdapter
import com.example.user.objectvpk.fragment.GridFragment
import com.example.user.objectvpk.fragment.ListFragment

class ViewPagerAdapter (fragmentManager: FragmentManager):FragmentPagerAdapter(fragmentManager){

    private val pages = listOf(ListFragment(), GridFragment())

    override fun getItem(p0: Int): Fragment {
        return pages[p0]
    }

    override fun getCount(): Int {
        return pages.size
    }

    override fun getPageTitle(position: Int): CharSequence? {
        return when(position) {
            0 -> "List View"
            else -> "Grid View"

        }

    }
}