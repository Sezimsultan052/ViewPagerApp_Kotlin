package com.example.viewpagerapp_kotlin.ui

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.lifecycle.Lifecycle
import androidx.viewpager2.adapter.FragmentStateAdapter
import com.example.viewpagerapp_kotlin.ui.counter_value.CounterValueFragment
import com.example.viewpagerapp_kotlin.ui.operations.OperationsFragment
import com.example.viewpagerapp_kotlin.ui.operayions_list.OperationsListFragment

class PagerAdapter(fm: FragmentManager, lifecycle: Lifecycle) :
    FragmentStateAdapter(fm, lifecycle) {
    override fun getItemCount(): Int = 3

    override fun createFragment(position: Int): Fragment {
        when (position) {
            0 -> return OperationsFragment()
            1 -> return CounterValueFragment()
        }
        return OperationsListFragment()
    }
}