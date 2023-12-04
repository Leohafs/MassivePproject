package com.example.appdua.modelview

import android.icu.text.CaseMap.Title
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentStatePagerAdapter

class DetailTokoAdapter(fm : FragmentManager) : FragmentStatePagerAdapter(fm,
    BEHAVIOR_RESUME_ONLY_CURRENT_FRAGMENT) {

    private var fragmenlist : ArrayList<Fragment> = ArrayList()
    private var fragmentitle : ArrayList<String> = ArrayList()

    override fun getCount(): Int {
        return fragmenlist.size
    }

    override fun getItem(position: Int): Fragment {
        return fragmenlist[position]
    }

    override fun getPageTitle(position: Int): CharSequence? {
        return fragmentitle[position]
    }

    fun addFragment(fragment: Fragment, title : String){
        fragmenlist.add(fragment)
        fragmentitle.add(title)
    }
}