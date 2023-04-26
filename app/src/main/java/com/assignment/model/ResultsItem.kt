package com.assignment.model

import android.os.Parcelable
import com.google.gson.annotations.SerializedName
import kotlinx.android.parcel.Parcelize

@Parcelize
data class ResultsItem(

	@SerializedName("per_facet")
	val perFacet: List<String?>? = null,

	@SerializedName("eta_id")
	val etaId: Int? = null,

	@SerializedName("subsection")
	val subsection: String? = null,

	@SerializedName("org_facet")
	val orgFacet: List<String?>? = null,

	@SerializedName("nytdsection")
	val nytdsection: String? = null,

	@SerializedName("section")
	val section: String? = null,

	@SerializedName("asset_id")
	val assetId: Long? = null,

	@SerializedName("source")
	val source: String? = null,

	@SerializedName("abstract")
	val jsonMemberAbstract: String? = null,

	@SerializedName("media")
	val media: List<MediaItem?>? = null,

	@SerializedName("type")
	val type: String? = null,

	@SerializedName("title")
	val title: String? = null,

	@SerializedName("des_facet")
	val desFacet: List<String?>? = null,

	@SerializedName("uri")
	val uri: String? = null,

	@SerializedName("url")
	val url: String? = null,

	@SerializedName("adx_keywords")
	val adxKeywords: String? = null,

	@SerializedName("id")
	val id: Long? = null,

	@SerializedName("published_date")
	val publishedDate: String? = null,

	@SerializedName("updated")
	val updated: String? = null,

	@SerializedName("byline")
	val byline: String? = null
) : Parcelable