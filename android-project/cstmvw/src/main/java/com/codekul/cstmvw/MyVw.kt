package com.codekul.cstmvw

import android.content.Context
import android.graphics.Canvas
import android.graphics.Color
import android.graphics.Paint
import android.util.AttributeSet
import android.view.MotionEvent
import android.widget.EditText

class MyVw(
        private val con: Context,
        private val attr: AttributeSet?
) : EditText(con, attr) {

    var cx: Float? = 0f
    var cy: Float? = 0f

    private val paint: Paint by lazy {
        Paint()
    }

    override fun onDraw(canvas: Canvas?) {
        super.onDraw(canvas)
        paint.color = Color.RED
        canvas?.drawCircle(cx!!, cy!!, 30f, paint)
        paint.strokeWidth = 3.5f
        canvas?.drawLine(50f, 50f, 50f, 300f, paint)
    }

    override fun onTouchEvent(event: MotionEvent?): Boolean {
        cx = event?.x
        cy = event?.y
        invalidate()
        return true
    }
}