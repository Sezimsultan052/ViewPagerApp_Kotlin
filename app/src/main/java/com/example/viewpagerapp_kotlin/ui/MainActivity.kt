package com.example.viewpagerapp_kotlin.ui


import androidx.lifecycle.ViewModelProvider
import com.example.viewpagerapp_kotlin.base.BaseActivity
import com.example.viewpagerapp_kotlin.databinding.ActivityMainBinding
import com.google.android.material.tabs.TabLayoutMediator

val fragmentList = arrayOf("action", "result", "operations")

class MainActivity : BaseActivity<ActivityMainBinding>(ActivityMainBinding::inflate) {
    val viewModel by lazy {
        ViewModelProvider(this)[MainViewModel::class.java]
    }

    override fun initView() {
        val adapter = PagerAdapter(supportFragmentManager, lifecycle)
        binding.viewPager.adapter = adapter
        initTab()
    }

    private fun initTab() {
        TabLayoutMediator(binding.tabLayout, binding.viewPager) { tab, position ->
            tab.text = fragmentList[position]
        }.attach()
    }
}