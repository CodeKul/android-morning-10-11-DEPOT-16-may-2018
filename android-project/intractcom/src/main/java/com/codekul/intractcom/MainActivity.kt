package com.codekul.intractcom

import android.app.Activity
import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val usNm = intent.extras.getString("usNm")
        btBk.text = usNm

        btBk.setOnClickListener {

            val int = Intent()
            val bndl = Bundle()
            bndl.putString("res", etRs.text.toString())
            int.putExtras(bndl)

            setResult(Activity.RESULT_OK, int)
            finish()
        }
    }
}
