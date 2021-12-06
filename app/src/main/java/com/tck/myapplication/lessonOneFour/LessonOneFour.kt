package com.tck.myapplication.lessonOneFour

import android.content.Context
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import android.widget.Toast
import androidx.databinding.DataBindingUtil
import com.tck.myapplication.R
import com.tck.myapplication.databinding.ActivityLessonOneFourBinding

class LessonOneFour : AppCompatActivity() {
    companion object{
        fun newIntent(packageContext: Context): Intent {
            return Intent(packageContext, LessonOneFour::class.java)
        }
    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val binding: ActivityLessonOneFourBinding = DataBindingUtil.setContentView(this,R.layout.activity_lesson_one_four)

        binding.btnMail.setOnClickListener {
            Toast.makeText(this,R.string.message, Toast.LENGTH_SHORT).show()
        }
    }

    override fun onCreateOptionsMenu(menu: Menu): Boolean {
        menuInflater.inflate(R.menu.lesson_onefour_menu, menu)
        return super.onCreateOptionsMenu(menu)
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        return when (item.itemId) {
            R.id.menu_search -> {
                Toast.makeText(this,"search button", Toast.LENGTH_SHORT).show()
                return true
            }
            R.id.menu_settings -> {
                Toast.makeText(this,"settings button", Toast.LENGTH_SHORT).show()
                return true
            }
            R.id.menu_feedback -> {
                Toast.makeText(this,"feedback button", Toast.LENGTH_SHORT).show()
                return true
            }

            else -> super.onOptionsItemSelected(item)
        }
    }
}