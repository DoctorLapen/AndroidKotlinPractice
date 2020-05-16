package com.lapin.task46



import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.AdapterView
import android.widget.AdapterView.OnItemClickListener
import android.widget.ArrayAdapter
import androidx.fragment.app.ListFragment


class MyListFragment : ListFragment(), OnItemClickListener {
    // Define the listener of the interface type
    // listener will the activity instance containing fragment
    private var listener: OnItemSelectedListener? = null

    // Define the events that the fragment will use to communicate
    interface OnItemSelectedListener {
        // This can be any number of events to be sent to the activity
        fun onRssItemSelected(name: String)
    }

    // Store the listener (activity) that will have events fired once the fragment is attached
    override fun onAttach(context: Context) {
        super.onAttach(context)
        listener = if (context is OnItemSelectedListener) {
            context
        } else {
            throw ClassCastException(
                context.toString()
                    .toString() + " must implement MyListFragment.OnItemSelectedListener"
            )
        }
    }
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
        listener?.onRssItemSelected(item);

    }
}