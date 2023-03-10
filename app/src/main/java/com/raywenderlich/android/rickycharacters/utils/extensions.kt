package com.raywenderlich.android.rickycharacters.utils

import android.content.Context
import android.view.View
import android.widget.Toast

fun Context?.toast(text: CharSequence, duration: Int = Toast.LENGTH_SHORT) = this?.let { Toast.makeText(it,
    text, duration).show() }

fun View.show() : View {
  if (visibility != View.VISIBLE) {
    visibility = View.VISIBLE
  }
  return this
}

fun View.hide() : View {
  if (visibility != View.INVISIBLE) {
    visibility = View.INVISIBLE
  }
  return this
}