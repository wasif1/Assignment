package com.assignment.model

import android.os.Parcelable
import com.google.gson.annotations.SerializedName
import kotlinx.android.parcel.Parcelize

@Parcelize
data class NYTimesResponse(

	@SerializedName("copyright")
	val copyright: String? = null,

	@SerializedName("results")
	val results: List<ResultsItem?>? = null,

	@SerializedName("num_results")
	val numResults: Int? = null,

	@SerializedName("status")
	val status: String? = null
) : Parcelable