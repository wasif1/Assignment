package com.assignment.Utills

import android.widget.ImageView
import androidx.databinding.BindingAdapter
import com.bumptech.glide.Glide
import com.assignment.model.ResultsItem

object ImageViewBindingAdapter {
    @JvmStatic
    @BindingAdapter(value = ["setImageUrl", "details"], requireAll = false)
    fun setImageUrl(view: ImageView?, item: ResultsItem?, details: Boolean) {
        item?.let {
            if (it.media != null && it.media.isNotEmpty() && it.media[0]?.mediaMetadata?.isNotEmpty() == true) {
                view?.context?.let { it1 ->
                    if (details)
                        Glide.with(it1).load(it.media[0]?.mediaMetadata?.get(2)?.url).into(view)
                    else
                        Glide.with(it1).load(it.media[0]?.mediaMetadata?.get(0)?.url).into(view)
                }
            }
        }
    }
}