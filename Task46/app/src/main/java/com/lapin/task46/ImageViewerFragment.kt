package com.lapin.task46


import android.graphics.drawable.Drawable
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.webkit.WebView
import android.widget.ImageView
import android.widget.TextView
import androidx.fragment.app.Fragment


val sourceDictionary:Map<String,Int> = mapOf("Наруто" to R.drawable.naruto,"Наначі" to R.drawable.nanachi,"Ліліт" to R.drawable.lilith);
class ImageViewerFragment : Fragment() {




    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        return inflater.inflate(R.layout.image_viewer_fragment, container, false)
    }
    fun showContent(name:String){
        val imageViewer = view!!.findViewById<ImageView>(R.id.imageView2)
        sourceDictionary[name!!]?.let { imageViewer.setImageResource(it) };
        val textViewer = view!!.findViewById<TextView>(R.id.textView);
        textViewer.text = name;

    }


}
