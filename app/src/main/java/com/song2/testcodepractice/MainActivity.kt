package com.song2.testcodepractice

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import com.song2.testcodepractice.databinding.ActivityMainBinding
import kotlinx.android.synthetic.main.activity_main.*

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
