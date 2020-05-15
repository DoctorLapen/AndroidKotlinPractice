package com.lapin.task46



import android.content.Intent
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.AdapterView
import android.widget.AdapterView.OnItemClickListener
import android.widget.ArrayAdapter
import androidx.fragment.app.ListFragment

val keyName = "selectedValue"
class MyListFragment : ListFragment(),
    OnItemClickListener {
    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View?
    {
        return inflater.inflate(R.layout.list_fragment, container, false)
    }

    override fun onActivityCreated(savedInstanceState: Bundle?)
    {
        super.onActivityCreated(savedInstanceState)
        val adapter: ArrayAdapter<*> = ArrayAdapter.createFromResource(
            activity!!,
            R.array.Planets,android.R.layout.simple_list_item_1)
        listAdapter = adapter
        listView.onItemClickListener = this
    }

    override fun onItemClick(parent: AdapterView<*>?, view: View, position: Int, id: Long) {
        val item = listAdapter!!.getItem(position) as String
        val intent = Intent(activity!!.applicationContext, ImageActivity::class.java)

        intent.putExtra(keyName, item)
        startActivity(intent)
    }
}