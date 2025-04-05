package com.mhx.coinstar.presentation.view.landing.component

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp

@Composable
fun DotsIndicator(selectedIndex : Int , totalDots : Int) {
    Row(
        modifier = Modifier
            .padding(8.dp)
            .height(8.dp),
        horizontalArrangement = Arrangement.spacedBy(8.dp)
    ) {
        for (i in 0 until totalDots) {
            Box(
                modifier = Modifier
                    .size(if (i == selectedIndex) 16.dp else 8.dp)
                    .clip(CircleShape)
                    .background(if (i == selectedIndex) Color.Black else Color.Gray)
            )
        }
    }
}