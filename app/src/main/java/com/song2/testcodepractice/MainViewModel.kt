package com.song2.testcodepractice

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class MainViewModel : ViewModel(){

    private val _clickButtonEvent = MutableLiveData<String>()
    val clickButtonAEvent : LiveData<String> get() = _clickButtonEvent

    fun onClickBtn(btn: String = "btn"){
        _clickButtonEvent.value =  "${btn}이 선택되었습니다"
    }
}