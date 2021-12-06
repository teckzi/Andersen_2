package com.tck.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import com.tck.myapplication.databinding.ActivityMainBinding
import com.tck.myapplication.lessonOneTwo.LessonOneTwo

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val binding: ActivityMainBinding = DataBindingUtil.setContentView(this,R.layout.activity_main)

        binding.LessonOnePointOne.setOnClickListener {

        }

        binding.LessonOnePointTwo.setOnClickListener {
            startActivity(LessonOneTwo.newIntent(this))
        }

        binding.LessonOnePointThree.setOnClickListener {

        }

        binding.LessonOnePointFour.setOnClickListener {

        }

        binding.LessonTwoPointOne.setOnClickListener {

        }

        binding.LessonTwoPointThree.setOnClickListener {
            
        }
    }
}