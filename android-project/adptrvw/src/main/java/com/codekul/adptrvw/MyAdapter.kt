package com.codekul.adptrvw

import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.content.Context
import android.widget.ImageView
import android.widget.TextView

class MyAdapter(
        private val context: Context,
        private val dataSet: ArrayList<MyData>
) : RecyclerView.Adapter<MyAdapter.MyHolder>() {

    class MyHolder(
            private val view: View
    ) : RecyclerView.ViewHolder(view) {

        var img: ImageView? = null
        var txt: TextView? = null

        init {
            img = view.findViewById(R.id.img)
            txt = view.findViewById(R.id.txt)
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup?, viewType: Int): MyHolder {

        return MyHolder(
                LayoutInflater.from(context)
                        .inflate(
                                R.layout.mixed_view,
                                parent,
                                false
                        )
        )
    }

    override fun getItemCount(): Int = dataSet.size

    override fun onBindViewHolder(holder: MyHolder?, position: Int) {

        holder?.img?.setImageResource(dataSet[position].img)
        holder?.txt?.text = dataSet[position].nm
    }
}