package com.codekul.adptrvw

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v7.widget.GridLayoutManager
import android.support.v7.widget.LinearLayoutManager
import android.support.v7.widget.RecyclerView
import android.text.Layout
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        setRecyclerViewLayoutManager(231)

        recyclerView.adapter = MyAdapter(
                this@MainActivity,
                arrayListOf(
                        MyData("Android", R.mipmap.ic_launcher_round),
                        MyData("Android", R.mipmap.ic_launcher_round),
                        MyData("Android", R.mipmap.ic_launcher_round),
                        MyData("Android", R.mipmap.ic_launcher_round),
                        MyData("Android", R.mipmap.ic_launcher_round),
                        MyData("Android", R.mipmap.ic_launcher_round)
                )
        )
    }

    private fun setRecyclerViewLayoutManager(layoutManagerType: Int)  {
        var layoutManager : RecyclerView.LayoutManager? = null

        var scrollPosition = 0

        if (recyclerView.layoutManager != null) {
            scrollPosition = (recyclerView.layoutManager as LinearLayoutManager)
                    .findFirstCompletelyVisibleItemPosition()
        }

        when (layoutManagerType) {
            132 -> {
                layoutManager = GridLayoutManager(this@MainActivity, 3)
            }
            231 -> {
                layoutManager = LinearLayoutManager(this@MainActivity)
            }
        }

        with(recyclerView) {
            scrollToPosition(scrollPosition)
        }

        recyclerView.layoutManager = layoutManager
    }
}
