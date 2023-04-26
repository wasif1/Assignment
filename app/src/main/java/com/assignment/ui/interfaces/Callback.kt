package com.assignment.ui.interfaces

import android.view.View
import com.assignment.model.ResultsItem

interface Callback {
    fun onDetails(view: View, item: ResultsItem?)
}