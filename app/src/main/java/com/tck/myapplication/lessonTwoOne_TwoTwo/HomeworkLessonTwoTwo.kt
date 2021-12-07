package com.tck.myapplication.lessonTwoOne_TwoTwo

import android.content.Context
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import com.tck.myapplication.R
import com.tck.myapplication.databinding.ActivityHomeworkLessonTwoTwoBinding

class HomeworkLessonTwoTwo : AppCompatActivity() {
    companion object{
        fun newIntent(packageContext: Context): Intent {
            return Intent(packageContext, HomeworkLessonTwoTwo::class.java)
        }
    }
    private var count = 0
    private lateinit var binding: ActivityHomeworkLessonTwoTwoBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        count = savedInstanceState?.getInt("anotheroneOutState")?: 0
        binding = DataBindingUtil.setContentView(this,R.layout.activity_homework_lesson_two_two)
        binding.count.text = count.toString()

        binding.countButton.setOnClickListener {
            count++
            binding.count.text = count.toString()
        }
    }

    override fun onSaveInstanceState(outState: Bundle) {
        super.onSaveInstanceState(outState)
        outState.putInt("anotheroneOutState", count)
    }
}