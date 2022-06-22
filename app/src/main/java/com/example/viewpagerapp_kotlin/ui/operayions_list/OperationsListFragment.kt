package com.example.viewpagerapp_kotlin.ui.operayions_list

import com.example.viewpagerapp_kotlin.base.BaseFragment
import com.example.viewpagerapp_kotlin.databinding.FragmentOperationsListBinding
import com.example.viewpagerapp_kotlin.ui.MainActivity


class OperationsListFragment :
    BaseFragment<FragmentOperationsListBinding>(FragmentOperationsListBinding::inflate){
    private lateinit var activity: MainActivity
    private var countIncrement = 0
    private var countDecrement = 0

    override fun initView() {
        activity = requireActivity() as MainActivity
    }

    override fun setupObservers() {
        super.setupObservers()
        activity.viewModel.liveData.observe(viewLifecycleOwner) {
            if (it) {
                countIncrement++
            } else {
                countDecrement++
            }
            val text  = "plus = $countIncrement \nminus = $countDecrement"
            binding.tvOperationList.text = text
        }
    }
}