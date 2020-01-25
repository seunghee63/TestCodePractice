package com.song2.testcodepractice.ui

import androidx.arch.core.executor.testing.InstantTaskExecutorRule
import com.song2.testcodepractice.MainViewModel
import org.junit.Assert
import org.junit.Before
import org.junit.Rule
import org.junit.Test

class MainViewModelTest {

    @get:Rule
    var instantTaskExecutorRule = InstantTaskExecutorRule()
    private lateinit var viewModel: MainViewModel

    // Before 어노테이션이 달린 메소드는 @Test 메소드를 돌기 전에 항상 먼저 실행 됩니다.
    @Before
    fun init() {
        viewModel = MainViewModel()
    }

    // Given, When, Then 으로 내가 테스트하고자 하는 로직을 명확히 표기합니다.
    // 어느 누가 보더라도 이해하기 쉽도록!!
    @Test
    fun `(Given) 메인 화면에 진입한 상태에서 (When) 1번째 버튼 클릭 시 (Then) 'btn1이 선택되었습니다' 텍스트를 표시`() {
        val expectedResult = "btn1이 선택되었습니다"
        viewModel.clickButtonAEvent.observeForever {
            Assert.assertEquals(expectedResult, it)
        }
        viewModel.onClickBtn("btn1")
    }

    // 테스트 코드를 작성하는 이유는 다른 사람과의 협업을 위함이라는 사실을 인지합니다.
    // 'MainViewModel 이라는 클래스는 이런이런 로직을 수행하는 역할을 한다' 라는 것을 나타내기 위한 작업입니다.
    // 실제 제품을 제작하기 전에 청사진을 그리는 작업이라고 생각하면 쉽습니다.
    @Test
    fun `(Given) 메인 화면에 진입한 상태에서 (When) 2번째 버튼 클릭 시 (Then) 'btn2이 선택되었습니다' 텍스트를 표시`() {
        val expectedResult = "btn2이 선택되었습니다"
        viewModel.clickButtonAEvent.observeForever {
            Assert.assertEquals(expectedResult, it)
        }
        viewModel.onClickBtn("btn2")
    }

    @Test
    fun `(Given) 메인 화면에 진입한 상태에서 (When) 3번째 버튼 클릭 시 (Then) 'btn3이 선택되었습니다' 텍스트를 표시`() {
        val expectedResult = "btn3이 선택되었습니다"
        viewModel.clickButtonAEvent.observeForever {
            Assert.assertEquals(expectedResult, it)
        }
        viewModel.onClickBtn("btn3")
    }
}