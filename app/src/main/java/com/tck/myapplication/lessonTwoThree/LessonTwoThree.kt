package com.tck.myapplication.lessonTwoThree

import android.content.Context
import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import com.tck.myapplication.R
import com.tck.myapplication.databinding.ActivityLessonTwoThreeBinding

class LessonTwoThree : AppCompatActivity() {
    companion object{
        fun newIntent(packageContext: Context): Intent {
            return Intent(packageContext, LessonTwoThree::class.java)
        }
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val binding: ActivityLessonTwoThreeBinding = DataBindingUtil.setContentView(this, R.layout.activity_lesson_two_three)

        binding.openWebsiteButton.setOnClickListener {
            val url = binding.websiteEdittext.text.toString()
            val webpage = Uri.parse(url)
            val intent = Intent(Intent.ACTION_VIEW,webpage)
            if (intent.resolveActivity(getPackageManager()) != null) {
                startActivity(intent)
            }
        }

        binding.openLocationButton.setOnClickListener {

        }

        binding.shareTextButton.setOnClickListener {

        }
    }
}