package com.song2.testcodepractice

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

/**
 * unit test 를 먼저 작성한 후에! 실제로 이부분을 구현합니다.
 */
class MainViewModel : ViewModel() {

    private val _clickButtonEvent = MutableLiveData<String>()
    val clickButtonAEvent: LiveData<String> get() = _clickButtonEvent

    fun onClickBtn(btn: String = "btn") {
        _clickButtonEvent.value = "${btn}이 선택되었습니다"
    }
}