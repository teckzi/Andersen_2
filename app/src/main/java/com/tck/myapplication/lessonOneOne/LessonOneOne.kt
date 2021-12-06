package com.tck.myapplication.lessonOneOne

import android.content.Context
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import com.tck.myapplication.R

private const val TAG = "LessonOneOne"
class LessonOneOne : AppCompatActivity() {
    companion object{
        fun newIntent(packageContext: Context): Intent {
            return Intent(packageContext,LessonOneOne::class.java)
        }
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_lesson_one_one)
        Log.d(TAG,"Hello World")
    }
}