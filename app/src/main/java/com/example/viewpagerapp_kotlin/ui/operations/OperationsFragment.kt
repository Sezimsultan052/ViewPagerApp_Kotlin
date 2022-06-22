package com.example.viewpagerapp_kotlin.ui.operations

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.viewpagerapp_kotlin.R
import com.example.viewpagerapp_kotlin.base.BaseFragment
import com.example.viewpagerapp_kotlin.databinding.FragmentOperationsBinding
import com.example.viewpagerapp_kotlin.ui.MainActivity

class OperationsFragment : BaseFragment<FragmentOperationsBinding>(FragmentOperationsBinding::inflate) {
    private lateinit var activity: MainActivity
    override fun initView() {
        activity = requireActivity() as MainActivity
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        btnMinus()
        btnPlus()
    }

    private fun btnMinus() {
        binding.btnDecrement.setOnClickListener {
            activity.viewModel.decrement()
        }
    }

    private fun btnPlus() {
        binding.btnIncrement.setOnClickListener {
            activity.viewModel.increment()
        }
    }
}