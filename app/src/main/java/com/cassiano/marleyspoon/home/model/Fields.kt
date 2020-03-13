package com.cassiano.marleyspoon.home.model

import android.os.Parcelable
import com.google.gson.annotations.SerializedName
import kotlinx.android.parcel.Parcelize

@Parcelize
class Fields(
    @SerializedName("title") val title: String? = null,
    @SerializedName("photo") val photo: MyPhoto
) : Parcelable