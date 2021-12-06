package com.tck.myapplication.lessonTwoOne_TwoTwo

import android.app.Activity
import android.content.Context
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import androidx.activity.result.ActivityResult
import androidx.activity.result.contract.ActivityResultContracts
import androidx.databinding.DataBindingUtil
import com.tck.myapplication.R
import com.tck.myapplication.databinding.ActivityLessonTwoOneBinding

private const val LOG_TAG = "LessonTwoOne"
class LessonTwoOne : AppCompatActivity() {
    companion object{
        fun newIntent(packageContext: Context): Intent {
            return Intent(packageContext, LessonTwoOne::class.java)
        }
    }
    private lateinit var binding: ActivityLessonTwoOneBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this,R.layout.activity_lesson_two_one)
        Log.d(LOG_TAG, "-------")
        Log.d(LOG_TAG, "onCreate")
        if (savedInstanceState != null){
            val isVisible = savedInstanceState.getBoolean("reply_visible")
            if (isVisible) makeTextVisible(savedInstanceState.getString("reply_text").toString())
        }

        val startForResult = registerForActivityResult(ActivityResultContracts.StartActivityForResult()) { result: ActivityResult ->
            if (result.resultCode == Activity.RESULT_OK) {
                val replyResult = result.data?.getStringExtra("REPLYSTRING").toString()
                if (replyResult == "") Log.d(LOG_TAG, "something go wrong")
                else{
                    makeTextVisible(replyResult)
                }
            }
        }
        binding.buttonSendMain.setOnClickListener {
            Log.d(LOG_TAG, "Button clicked!")
            startForResult.launch(ReplyActivity.newIntent(this,binding.editTextMessageMain.text.toString()))
        }
    }

    override fun onSaveInstanceState(outState: Bundle) {
        super.onSaveInstanceState(outState)
        if (binding.textHeaderReply.visibility == View.VISIBLE){
            outState.putBoolean("reply_visible", true)
            outState.putString("reply_text",binding.textMessageReply.text.toString())
        }
    }

    private fun makeTextVisible(replyText:String){
        binding.textHeaderReply.visibility = View.VISIBLE
        binding.textMessageReply.apply {
            visibility = View.VISIBLE
            text = replyText
        }
    }
    override fun onStart() {
        super.onStart()
        Log.d(LOG_TAG, "onStart")
    }
    override fun onRestart() {
        super.onRestart()
        Log.d(LOG_TAG, "onRestart")
    }
    override fun onResume() {
        super.onResume()
        Log.d(LOG_TAG, "onResume")
    }
    override fun onPause() {
        super.onPause()
        Log.d(LOG_TAG, "onPause")
    }
    override fun onStop() {
        super.onStop()
        Log.d(LOG_TAG, "onStop")
    }
    override fun onDestroy() {
        super.onDestroy()
        Log.d(LOG_TAG, "onDestroy")
    }
}