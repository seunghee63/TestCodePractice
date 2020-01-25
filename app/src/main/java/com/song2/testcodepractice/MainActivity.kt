package com.song2.testcodepractice

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*
import androidx.lifecycle.Observer
import kotlinx.android.synthetic.main.motion_main_bottom_end.*

class MainActivity : AppCompatActivity() {

    private val viewModel = MainViewModel()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        initClickListener()
    }

    private fun initClickListener(){
        btn_1.setOnClickListener { viewModel.onClickBtn(getString(R.string.btn1))}
        btn_2.setOnClickListener { viewModel.onClickBtn(getString(R.string.btn2))}
        btn_3.setOnClickListener { viewModel.onClickBtn(getString(R.string.btn3))}
        //vmObserve()
    }

//    private fun vmObserve() {
//        viewModel.unClickedEvent.observe(this, Observer {
//            main_selected_btn_text.text = it
//        })
//
//        viewModel.clickButtonAEvent.observe(this, Observer {
//            main_selected_btn_text.text = it
//        })
//    }
}
