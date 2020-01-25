package com.song2.testcodepractice

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class MainViewModel : ViewModel(){

    private val _unClickedEvent = MutableLiveData<String>().apply { postValue("btn을 선택 해 주세요") }
    val unClickedEvent : LiveData<String> get() = _unClickedEvent

    private val _clickButtonAEvent = MutableLiveData<String>()
    val clickButtonAEvent : LiveData<String> get() = _clickButtonAEvent

    fun onClick1() {
        _clickButtonAEvent.value = "btn1이 선택되었습니다"
    }

    fun onClick2() {
        _clickButtonAEvent.value = "btn2이 선택되었습니다"
    }

    fun onClick3() {
        _clickButtonAEvent.value = "btn3이 선택되었습니다"
    }

    fun onClickBtn(btn: String = "btn"){
        _clickButtonAEvent.value =  "${btn}이 선택되었습니다"
    }
}