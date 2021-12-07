package com.tck.myapplication.lessonOneTwo

import android.content.Context
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.core.content.ContextCompat
import androidx.databinding.DataBindingUtil
import com.tck.myapplication.R
import com.tck.myapplication.databinding.ActivityLessonOneTwoBinding

class LessonOneTwo : AppCompatActivity() {
    companion object {
        fun newIntent(packageContext: Context): Intent {
            return Intent(packageContext, LessonOneTwo::class.java)
        }
    }
    private var count = 0
    private lateinit var binding: ActivityLessonOneTwoBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val countSave = savedInstanceState?.getInt("countInt")
        count = countSave ?: 0
        binding = DataBindingUtil.setContentView(this, R.layout.activity_lesson_one_two)
        countUpdate()

        binding.buttonToast.setOnClickListener {
            startActivity(HomeworkLessonTwoOne.newIntent(this,count))
        }
        binding.buttonCount.setOnClickListener {
            count++
            countUpdate()
        }
        binding.zeroButton.setOnClickListener {
            count = 0
            countUpdate()
        }
    }

    private fun countUpdate(){
        binding.showCount.text = count.toString()
        if (count == 0) binding.zeroButton.background.setTint(ContextCompat.getColor(this, R.color.grey))
        else binding.zeroButton.background.setTint(ContextCompat.getColor(this, R.color.pink))
        if (count% 2 == 0 && count != 0) binding.buttonCount.background.setTint(ContextCompat.getColor(this, R.color.MediumTurquoise))
        else binding.buttonCount.background.setTint(ContextCompat.getColor(this, R.color.DarkSlateBlue))
    }

    override fun onSaveInstanceState(outState: Bundle) {
        outState.putInt("countInt", count)
        super.onSaveInstanceState(outState)
    }
}