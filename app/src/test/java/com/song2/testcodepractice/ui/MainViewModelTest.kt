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

    @Before
    fun init() {
        viewModel = MainViewModel()
    }

    @Test
    fun `(Given) 메인 화면에 진입 시 (When) x (Then) 'btn을 선택 해 주세요' 텍스트 표시`() {
        val expectedResult = "btn을 선택 해 주세요"
        viewModel.unClickedEvent.observeForever {
            Assert.assertEquals(expectedResult, it)
        }
    }

    @Test
    fun `(Given) 메인 화면에 진입한 상태에서 (When) 1번째 버튼 클릭 시 (Then) 'btn1이 선택되었습니다' 텍스트를 표시`() {
        val expectedResult = "btn1이 선택되었습니다"
        viewModel.clickButtonAEvent.observeForever {
            Assert.assertEquals(expectedResult, it)
        }
        viewModel.onClick1()
    }

    @Test
    fun `(Given) 메인 화면에 진입한 상태에서 (When) 2번째 버튼 클릭 시 (Then) 'btn2이 선택되었습니다' 텍스트를 표시`() {
        val expectedResult = "btn2이 선택되었습니다"
        viewModel.clickButtonAEvent.observeForever {
            Assert.assertEquals(expectedResult, it)
        }
        viewModel.onClick2()
    }

    @Test
    fun `(Given) 메인 화면에 진입한 상태에서 (When) 3번째 버튼 클릭 시 (Then) 'btn3이 선택되었습니다' 텍스트를 표시`() {
        val expectedResult = "btn3이 선택되었습니다"
        viewModel.clickButtonAEvent.observeForever {
            Assert.assertEquals(expectedResult, it)
        }
        viewModel.onClick3()
    }
}