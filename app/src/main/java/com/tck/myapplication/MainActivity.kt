package com.tck.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import com.tck.myapplication.databinding.ActivityMainBinding
import com.tck.myapplication.lessonOneFour.LessonOneFour
import com.tck.myapplication.lessonOneOne.LessonOneOne
import com.tck.myapplication.lessonOneThree.LessonOneThree
import com.tck.myapplication.lessonOneTwo.LessonOneTwo
import com.tck.myapplication.lessonTwoOne_TwoTwo.LessonTwoOne
import com.tck.myapplication.lessonTwoThree.LessonTwoThree
import android.widget.TextView
import android.net.Uri
import com.tck.myapplication.lessonTwoOne_TwoTwo.HomeworkLessonTwoTwo


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val binding: ActivityMainBinding = DataBindingUtil.setContentView(this,R.layout.activity_main)


        binding.LessonOnePointOne.setOnClickListener {
            startActivity(LessonOneOne.newIntent(this))
        }

        binding.LessonOnePointTwo.setOnClickListener {
            startActivity(LessonOneTwo.newIntent(this))
        }

        binding.LessonOnePointThree.setOnClickListener {
            startActivity(LessonOneThree.newIntent(this))
        }

        binding.LessonOnePointFour.setOnClickListener {
            startActivity(LessonOneFour.newIntent(this))
        }

        binding.LessonTwoPointOne.setOnClickListener {
            startActivity(LessonTwoOne.newIntent(this))
        }

        binding.HomeworkLessonTwoPointTwo.setOnClickListener {
            startActivity(HomeworkLessonTwoTwo.newIntent(this))
        }

        binding.LessonTwoPointThree.setOnClickListener {
            startActivity(LessonTwoThree.newIntent(this))
        }
    }
}