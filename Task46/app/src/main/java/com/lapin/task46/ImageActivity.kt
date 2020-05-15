package com.lapin.task46


import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity


class ImageActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_image);



    }

    override fun onStart() {
        super.onStart();
        val viewer= supportFragmentManager.findFragmentById(R.id.ImageViewer) as ImageViewerFragment;
        val message = intent.getStringExtra(keyName);
        viewer.showContent(message!!);
    }

}
