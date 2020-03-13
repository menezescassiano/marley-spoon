package com.cassiano.marleyspoon.home.model

import android.os.Parcelable
import com.cassiano.marleyspoon.home.model.Fields
import com.cassiano.marleyspoon.home.model.SysId
import com.google.gson.annotations.SerializedName
import kotlinx.android.parcel.Parcelize

@Parcelize
class MyItem(
    @SerializedName("sys")
    val sys: SysId,
    @SerializedName("fields")
    val fields: Fields
): Parcelable