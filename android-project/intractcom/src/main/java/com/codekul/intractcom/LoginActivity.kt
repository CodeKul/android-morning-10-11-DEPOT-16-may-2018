package com.codekul.intractcom

import android.app.Activity
import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_login.*

class LoginActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

        btLgn.setOnClickListener {
            //            if(etMb.text.toString() != "9762548833" && etPas.text.toString() != "codekul" ) {
//                txtSts.text = "Invalid User"
//                return@setOnClickListener
//            }

            val bndl = Bundle()
            bndl.putString("usNm", etMb.text.toString())

            val int = Intent(
                    this@LoginActivity,
                    MainActivity::class.java
            )
            int.putExtras(bndl)

            //startActivity(int)
            startActivityForResult(int, 4568)
        }
    }

    override fun onActivityResult(
            requestCode: Int,
            resultCode: Int,
            data: Intent?
    ) {
        super.onActivityResult(
                requestCode,
                resultCode,
                data
        )

        when (requestCode) {
            4568 -> {// coming back from MainActivity
                if(resultCode == Activity.RESULT_OK) {
                    val res = data?.extras?.getString("res")
                    txtSts.text = res
                }
            }
        }
    }
}
