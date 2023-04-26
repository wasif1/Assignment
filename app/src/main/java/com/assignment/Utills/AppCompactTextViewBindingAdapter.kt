package com.assignment.Utills

import android.annotation.SuppressLint
import androidx.appcompat.widget.AppCompatTextView
import androidx.databinding.BindingAdapter
import java.text.ParseException
import java.text.SimpleDateFormat

object AppCompactTextViewBindingAdapter {

    @SuppressLint("SimpleDateFormat")
    @JvmStatic
    @BindingAdapter("setDateFormat")
    fun setDateFormat(view: AppCompatTextView?, date: String?) {
        date?.let {
            view?.let {
                val input = SimpleDateFormat("yyyy-mm-dd HH:mm:ss")
                val output = SimpleDateFormat("yyyy-MM-dd")
                try {
                    val getAbbreviate = input.parse(date)    // parse input
                    view.text = getAbbreviate?.let { it1 -> output.format(it1) }    // format output
                } catch (e: ParseException) {
                    e.printStackTrace()
                }
            }
        }
    }
}