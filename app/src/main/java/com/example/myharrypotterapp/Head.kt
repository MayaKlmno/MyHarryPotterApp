package com.example.myharrypotterapp

import android.os.Parcelable
import kotlinx.parcelize.Parcelize

//TODO: Parcelize this
@Parcelize
data class Head (
    var firstName: String,
    var lastName: String
) : Parcelable