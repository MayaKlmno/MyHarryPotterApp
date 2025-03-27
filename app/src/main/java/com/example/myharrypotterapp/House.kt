package com.example.myharrypotterapp

import android.os.Parcelable
import kotlinx.parcelize.Parcelize


// TODO: Parcelize this
@Parcelize
data class House (
    var name: String,
    var houseColors: String,
    var founder: String,
    var animal: String,
    var element: String,
    var ghost: String,
    var commonRoom: String,
    var heads: List<Head>,
    var traits: List<Trait>
) : Parcelable