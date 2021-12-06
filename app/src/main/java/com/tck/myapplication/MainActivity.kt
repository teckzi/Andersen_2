package com.tck.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import com.tck.myapplication.databinding.ActivityMainBinding
import com.tck.myapplication.lessonOneThree.LessonOneThree

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val binding: ActivityMainBinding = DataBindingUtil.setContentView(this,R.layout.activity_main)

        binding.LessonOnePointOne.setOnClickListener {

        }

        binding.LessonOnePointTwo.setOnClickListener {

        }

        binding.LessonOnePointThree.setOnClickListener {
            startActivity(LessonOneThree.newIntent(this))
        }

        binding.LessonOnePointFour.setOnClickListener {

        }

        binding.LessonTwoPointOne.setOnClickListener {

        }

        binding.LessonTwoPointThree.setOnClickListener {
            
        }
    }
}