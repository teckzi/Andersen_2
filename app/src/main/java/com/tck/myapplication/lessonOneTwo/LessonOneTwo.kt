package com.tck.myapplication.lessonOneTwo

import android.content.Context
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
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

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val countSave = savedInstanceState?.getInt("countInt")
        count = countSave ?: 0

        val binding: ActivityLessonOneTwoBinding =
            DataBindingUtil.setContentView(this, R.layout.activity_lesson_one_two)

        binding.showCount.text = count.toString()

        binding.buttonToast.setOnClickListener {
            Toast.makeText(this, R.string.toast_message, Toast.LENGTH_SHORT).show()
        }
        binding.buttonCount.setOnClickListener {
            count++
            binding.showCount.text = count.toString()
        }
    }

    override fun onSaveInstanceState(outState: Bundle) {
        outState.putInt("countInt", count)
        super.onSaveInstanceState(outState)
    }
}