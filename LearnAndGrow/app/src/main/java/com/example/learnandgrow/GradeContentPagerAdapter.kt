package com.example.learnandgrow

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentActivity
import androidx.viewpager2.adapter.FragmentStateAdapter

/**
 * This class is adapter for Grade Content Fragments
 *
 * */
class GradeContentPagerAdapter(fragmentActivity: FragmentActivity) :
    FragmentStateAdapter(fragmentActivity) {
    //Get Number of fragments
    override fun getItemCount(): Int {
        return 3
    }
    //return the corresponding fragment based on the position
    override fun createFragment(position: Int): Fragment {
        when (position) {
            0 -> return GradeContentTabOne()
            1 -> return GradeContentTabTwo()
            2 -> return GradeContentTabTwo()
        }
        return GradeContentTabOne()
    }


}