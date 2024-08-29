package com.example.myartgalleryapp.model

data class ImageData(
    val title: String,
    val artist: String,
    val year: String,
    val imageResId: Int? = null,  // Resource ID for local images
    val imageUrl: String? = null  // URL for remote images
)
