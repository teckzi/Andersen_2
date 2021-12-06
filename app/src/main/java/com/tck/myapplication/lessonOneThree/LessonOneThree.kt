package com.tck.myapplication.lessonOneThree

import android.content.Context
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.tck.myapplication.R

class LessonOneThree : AppCompatActivity() {
    companion object{
        fun newIntent(packageContext: Context): Intent {
            return Intent(packageContext, LessonOneThree::class.java)
        }
    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_lesson_one_three)
    }
}