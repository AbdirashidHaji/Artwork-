package com.example.myartgalleryapp

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import com.example.myartgalleryapp.screen.GalleryScreen
import com.example.myartgalleryapp.model.ImageData
import com.example.myartgalleryapp.ui.theme.MyArtGalleryAppTheme

class MainActivity : ComponentActivity() {
    private val sampleImages = listOf(
        ImageData("Starry Night", "Vincent van Gogh", "1889", "https://example.com/starry_night.jpg"),
        ImageData("Mona Lisa", "Leonardo da Vinci", "1503", "https://example.com/mona_lisa.jpg"),
        ImageData("The Persistence of Memory", "Salvador Dalí", "1931", "https://example.com/persistence_of_memory.jpg")
    )

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MyArtGalleryAppTheme {
                Surface(color = MaterialTheme.colorScheme.background) {
                    val currentIndex = remember { mutableStateOf(0) }
                    GalleryScreen(images = sampleImages, currentIndex = currentIndex)
                }
            }
        }
    }
}
