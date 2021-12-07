package com.tck.myapplication.lessonOneTwo

import android.content.Context
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import com.tck.myapplication.R
import com.tck.myapplication.databinding.ActivityHomeworkLessonTwoOneBinding

private const val EXTRA_MESSAGE = "Homework2.2"
class HomeworkLessonTwoOne : AppCompatActivity() {
    companion object{
        fun newIntent(packageContext: Context, count:Int): Intent {
            return Intent(packageContext, HomeworkLessonTwoOne::class.java).apply {
                putExtra(EXTRA_MESSAGE, count)
            }
        }
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val binding: ActivityHomeworkLessonTwoOneBinding = DataBindingUtil.setContentView(this,R.layout.activity_homework_lesson_two_one)
        binding.countTextView.text = intent.getIntExtra(EXTRA_MESSAGE,0).toString()
    }
}