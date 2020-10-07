package com.gappein.util

import android.graphics.Bitmap
import android.graphics.Canvas
import android.util.Log
import android.view.View.MeasureSpec
import com.gappein.StickerView

fun StickerView.generateSticker(): Bitmap {
    val view = this
    view.measure(MeasureSpec.UNSPECIFIED, MeasureSpec.UNSPECIFIED)
    val bitmap = Bitmap.createBitmap(
        view.measuredWidth, view.measuredHeight,
        Bitmap.Config.ARGB_8888
    )
    val canvas = Canvas(bitmap)
    view.layout(0, 0, view.getMeasuredWidth(), view.getMeasuredHeight())
    view.draw(canvas)
    return bitmap
}