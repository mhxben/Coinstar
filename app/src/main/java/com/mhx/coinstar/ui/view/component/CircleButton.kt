package com.mhx.coinstar.ui.view.component

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import com.mhx.coinstar.R

@Composable
fun CircleButton(onClick:()->Unit) {

    Box(contentAlignment = Alignment.Center,
        modifier = Modifier.size(44.dp)
            .clip(CircleShape)
            .clickable { onClick() }
            .background(colorResource(id = R.color.black))
    ){
        Image(
            painter = painterResource(id = R.drawable.arrow),
            contentDescription = null,
            modifier = Modifier.size(24.dp)
        )
    }
}
