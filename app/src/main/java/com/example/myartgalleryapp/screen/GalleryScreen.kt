package com.example.myartgalleryapp.screen

import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Surface
import androidx.compose.runtime.Composable
import androidx.compose.runtime.MutableState
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import com.example.myartgalleryapp.model.ImageData

@Composable
fun GalleryScreen(images: List<ImageData>, currentIndex: MutableState<Int>) {
    if (images.isNotEmpty() && currentIndex.value in images.indices) {
        val image = images[currentIndex.value]
        ImageCard(
            imageData = image,
            onPrevious = {
                if (currentIndex.value > 0) currentIndex.value--
            },
            onNext = {
                if (currentIndex.value < images.size - 1) currentIndex.value++
            }
        )
    }
}
