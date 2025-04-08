package com.example.myharrypotterapp

import android.os.Parcelable
import kotlinx.parcelize.Parcelize

// should Parcelize this
@Parcelize
data class Houses (
    var house: List<House>
) : Parcelable {
}