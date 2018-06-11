package com.codekul.cmpdvw

import android.content.Context
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.widget.ImageView
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    //lateinit var infalter : LayoutInflater

    val inflater: LayoutInflater by lazy {
        getSystemService(Context.LAYOUT_INFLATER_SERVICE) as LayoutInflater
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btOk.setOnClickListener {
            val vw = inflater
                    .inflate(
                            R.layout.mixed_view,
                            ll,
                            false
                    )
            ll.addView(vw)

            vw.findViewById<ImageView>(R.id.img).setOnClickListener {
                (it as ImageView).setImageResource(R.drawable.abc_btn_switch_to_on_mtrl_00012)
            }
//            vw.setOnClickListener {
//                Log.i("@codekul","All View clicked")
//            }
        }
    }
}
