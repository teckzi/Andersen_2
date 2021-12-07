package com.tck.myapplication.lessonTwoOne_TwoTwo

import android.content.Context
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.ActionBar
import androidx.databinding.DataBindingUtil
import com.tck.myapplication.R
import com.tck.myapplication.databinding.ActivityReplyBinding

private const val LOG_TAG = "ReplyActivity"
private const val EXTRA_MESSAGE = "LESSONTWOONE"
class ReplyActivity : AppCompatActivity() {
    companion object{
        fun newIntent(packageContext: Context, message:String): Intent {
            return Intent(packageContext, ReplyActivity::class.java).apply {
                putExtra(EXTRA_MESSAGE, message)
            }
        }
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val binding: ActivityReplyBinding = DataBindingUtil.setContentView(this,R.layout.activity_reply)
        supportActionBar?.setDisplayHomeAsUpEnabled(true)
        binding.replyMessage.text = intent.getStringExtra(EXTRA_MESSAGE)

        binding.buttonReply.setOnClickListener {
            val intent = Intent()
            val replyMessage = binding.editTextSecond.text.toString()
            intent.putExtra("REPLYSTRING",replyMessage)
            setResult(RESULT_OK, intent)
            Log.d(LOG_TAG, "End SecondActivity")
            finish()
        }

    }
}