package com.cassiano.marleyspoon.home.model

import android.os.Parcelable
import com.google.gson.annotations.SerializedName
import kotlinx.android.parcel.Parcelize

@Parcelize
class ContentfulResponse(@SerializedName("items") val listItem: List<MyItem>) : Parcelable