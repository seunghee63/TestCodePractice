package com.song2.testcodepractice

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

/**
 * unit test 를 먼저 작성한 후에! 실제로 이부분을 구현합니다.
 */
class MainViewModel : ViewModel() {

    private val _clickButtonEvent = MutableLiveData<String>() // mutable 자료형은 수정이 가능, 변수앞에 언더바_는 private 변수라는 의미
    val clickButtonAEvent: LiveData<String> get() = _clickButtonEvent // 수정은 vm 안에서만! get()을 통해서만 가능. 밖에서는 접근만 가능
    // input() - mutabledata, output() - livedata 를 모아놓는 형식으로 관리를 하기도 함
    // LiveData는 Activity와 같은 생명주기를 가짐. Activity 에 생명주기에 맞춰 값이 변동하므로, 관리가 더욱 용이함

    // context를 넘겨 받는 방법
    // interface ResourceProvider
    // class ResourceProvider(context) - 구현

    fun onClickBtn(btn: String = "btn") {
        _clickButtonEvent.value = "${btn}이 선택되었습니다"
    }
}