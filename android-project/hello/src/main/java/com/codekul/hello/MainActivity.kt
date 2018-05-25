package com.codekul.hello

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

//        val clk: View.OnClickListener = View.OnClickListener {
//
//        }
        btnOkay.setOnClickListener {
            Log.i("@codekul", "Clicked")
            editText.setText(editText.text.toString().toUpperCase())
        }
    }
}

