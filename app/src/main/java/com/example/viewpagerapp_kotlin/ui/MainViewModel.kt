package com.example.viewpagerapp_kotlin.ui

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class MainViewModel:ViewModel() {
    var count = MutableLiveData<Int>()
    private var a = 0
    var liveData = MutableLiveData<Boolean>()

    fun increment() {
        a++
        count.value = a
        liveData.value = true
    }

    fun decrement() {
        a--
        count.value = a
        liveData.value = false
    }
}