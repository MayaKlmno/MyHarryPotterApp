package com.example.myharrypotterapp

import android.os.Parcelable
import kotlinx.parcelize.Parcelize

//TODO: Parcelize this
@Parcelize
data class Trait (
    var name: String
) : Parcelable{
    override fun toString(): String {
        return "$name"
    }
}