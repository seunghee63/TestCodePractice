package com.song2.testcodepractice

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import com.song2.testcodepractice.databinding.ActivityMainBinding
import kotlinx.android.synthetic.main.activity_main.*

/**
 * app > src > test > java > 패키지명 > 여기서 유닛 테스트를 작성합니다.
 * (androidTest 폴더에 안에는 보통 UI테스트 코드를 작성하는데 우리는 Unit테스트만 할꺼임)
 * 항상 테스트 코드를 먼저! 작성하고 테스트를 돌렸을 때 통과가 되면, 실제 기능 구현을 합니다.
 */

/**
 * 안드로이드 테스트 종류 - unit test & ui test
 * unit과 ui의 기준을 명확하게 모르겠음.. 현재 구현한 testcode를 ui test로 바꾸면 하나의 테스트 코드로 바뀌는건가 ???
 */

class MainActivity : AppCompatActivity() {

    private lateinit var binding : ActivityMainBinding
    private val viewModel = MainViewModel()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this, R.layout.activity_main)

        binding.lifecycleOwner = this
        binding.vm = viewModel

        initClickListener()
    }

    private fun initClickListener(){

        with(binding){
            btn_1.setOnClickListener { viewModel.onClickBtn(getString(R.string.btn1))}
            btn_2.setOnClickListener { viewModel.onClickBtn(getString(R.string.btn2))}
            btn_3.setOnClickListener { viewModel.onClickBtn(getString(R.string.btn3))}
        }
    }
}
