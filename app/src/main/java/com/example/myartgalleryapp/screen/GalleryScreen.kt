package com.example.myartgalleryapp.screen

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import coil.compose.rememberImagePainter
import com.example.myartgalleryapp.model.ImageData

@Composable
fun GalleryScreen(
    images: List<ImageData>,
    currentIndex: Int,
    onPrevious: () -> Unit,
    onNext: () -> Unit
) {
    val image = images[currentIndex]
    ImageCard(imageData = image, onPrevious = onPrevious, onNext = onNext)
}

