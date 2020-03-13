package com.cassiano.marleyspoon.home.model

import android.os.Parcelable
import com.google.gson.annotations.SerializedName
import kotlinx.android.parcel.Parcelize

@Parcelize
class MyPhoto(@SerializedName("sys") val photoSys: PhotoSys) : Parcelable {

    @Parcelize
    class PhotoSys(@SerializedName("id") val id: String) : Parcelable

}