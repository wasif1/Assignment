package com.assignment.model

import android.os.Parcelable
import com.google.gson.annotations.SerializedName
import kotlinx.android.parcel.Parcelize

@Parcelize
data class MediaItem(

	@SerializedName("copyright")
	val copyright: String? = null,

	@SerializedName("media-metadata")
	val mediaMetadata: List<MediaMetadataItem?>? = null,

	@SerializedName("subtype")
	val subtype: String? = null,

	@SerializedName("caption")
	val caption: String? = null,

	@SerializedName("type")
	val type: String? = null,

	@SerializedName("approved_for_syndication")
	val approvedForSyndication: Int? = null
) : Parcelable