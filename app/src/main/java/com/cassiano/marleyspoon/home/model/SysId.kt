package com.cassiano.marleyspoon.home.model

import android.os.Parcelable
import com.google.gson.annotations.SerializedName
import kotlinx.android.parcel.Parcelize

@Parcelize
class SysId(@SerializedName("id") val id: String? = null) : Parcelable