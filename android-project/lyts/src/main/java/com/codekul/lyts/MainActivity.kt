package com.codekul.lyts

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.mixed.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.mixed)

        btnBus.setOnClickListener {
            imgVw.setImageResource(R.drawable.ic_bus_stop)
        }

        btnCar.setOnClickListener {
            imgVw.setImageResource(R.drawable.ic_camera_rear_black_24dp)
        }

        btnPlane.setOnClickListener {
            imgVw.setImageResource(R.drawable.ic_rotation_black_24dp)
        }
    }
}
