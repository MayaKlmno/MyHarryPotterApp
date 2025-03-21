package com.example.myharrypotterapp

// TODO: Should have the @Parcelize
data class FeatureCollection (
    var name: String,
    var houseColors: String,
    var founder: String,
    var animal: String,
    var element: String,
    var ghost: String,
    var commonRoom: String,
    var heads: List<heads>,
    var traits: List<traits>
)