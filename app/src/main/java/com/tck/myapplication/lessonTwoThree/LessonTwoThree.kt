package com.tck.myapplication.lessonTwoThree

import android.content.Context
import android.content.Intent
import android.content.pm.PackageManager
import android.content.pm.ResolveInfo
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.provider.MediaStore
import android.util.Log
import androidx.databinding.DataBindingUtil
import com.tck.myapplication.databinding.ActivityLessonTwoThreeBinding
import androidx.core.app.ShareCompat
import com.tck.myapplication.R
import androidx.core.app.ActivityCompat.startActivityForResult
import android.os.Environment
import java.io.File
import java.util.*
import androidx.core.app.ActivityCompat.startActivityForResult





class LessonTwoThree : AppCompatActivity() {
    companion object{
        fun newIntent(packageContext: Context): Intent {
            return Intent(packageContext, LessonTwoThree::class.java)
        }
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val binding: ActivityLessonTwoThreeBinding = DataBindingUtil.setContentView(this, R.layout.activity_lesson_two_three)

        val intent = intent
        val uri: Uri? = intent.data
        if (uri != null) {
            val uri_string = ("Hello")
            binding.websiteEdittext.setText(uri_string)
        }

        binding.openWebsiteButton.setOnClickListener {
            val url = binding.websiteEdittext.text.toString().split(" ")[0]
            if(url.contains("http://", ignoreCase = true)){
                webIntent(url)
            }else{
                val editUrl = "http://$url"
                webIntent(editUrl)
            }
        }

        binding.openLocationButton.setOnClickListener {
            val loc = binding.locationEdittext.text.toString()
            val addressUri = Uri.parse("geo:0,0?q=$loc")
            val intent = Intent(Intent.ACTION_VIEW, addressUri)
            if (intent.resolveActivity(packageManager) != null) {
                startActivity(intent)
            } else {
                Log.d("ImplicitIntents", "Can't handle this intent!")
            }
        }

        binding.shareTextButton.setOnClickListener {
            val txt: String = binding.shareEdittext.text.toString()
            val mimeType = "text/plain"
            ShareCompat.IntentBuilder(this)
                .setType(mimeType)
                .setChooserTitle("Testing Title")
                .setText(txt)
                .startChooser()
        }

        binding.takePicture.setOnClickListener {
                val photo = Intent("android.media.action.IMAGE_CAPTURE")
                startActivity(photo)
            }
    }

    private fun webIntent(url:String){
        val webpage = Uri.parse(url)
        val intent = Intent(Intent.ACTION_VIEW,webpage)
        if (intent.resolveActivity(packageManager) != null) {
            startActivity(intent);
        } else {
            Log.d("ImplicitIntents", "Can't handle this intent!");
        }
    }
}