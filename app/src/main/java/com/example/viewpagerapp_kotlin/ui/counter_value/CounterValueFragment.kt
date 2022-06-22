package com.example.viewpagerapp_kotlin.ui.counter_value


import com.example.viewpagerapp_kotlin.base.BaseFragment
import com.example.viewpagerapp_kotlin.databinding.FragmentCounterValueBinding
import com.example.viewpagerapp_kotlin.ui.MainActivity

class CounterValueFragment : BaseFragment<FragmentCounterValueBinding>(FragmentCounterValueBinding::inflate) {
    private lateinit var activity: MainActivity
    override fun initView() {
        activity = requireActivity() as MainActivity
    }

    override fun setupObservers() {
        super.setupObservers()
        with(activity) {
            viewModel.count.observe(viewLifecycleOwner) {
                binding.tvRes.text = it.toString()
            }
        }
    }
}