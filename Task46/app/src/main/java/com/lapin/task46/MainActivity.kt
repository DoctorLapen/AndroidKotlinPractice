package com.lapin.task46

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.Fragment
val keyName = "selectedValue"
class MainActivity : AppCompatActivity(), MyListFragment.OnItemSelectedListener {

    var fragment: ImageViewerFragment? = null
    override fun onCreate(savedInstanceState: Bundle?)
    {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        fragment = supportFragmentManager.findFragmentById(R.id.ImageViewerLarge) as ImageViewerFragment?;
        fragment?.showContent("Наначі")

    }
    override fun onRssItemSelected(name: String)
    {
        if (fragment != null)
        {
            fragment!!.showContent(name)
        }
        else
        {
            val intent = Intent(this, ImageActivity::class.java)
            intent.putExtra(keyName, name)
            startActivity(intent)
        }
    }

}
