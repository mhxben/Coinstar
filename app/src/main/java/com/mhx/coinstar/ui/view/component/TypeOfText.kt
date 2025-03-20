package com.mhx.coinstar.ui.view.component

import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.unit.sp
import com.mhx.coinstar.R

@Composable
fun PrimaryText(text: String , modifier: Modifier = Modifier) {
    Text(text , fontSize = 24.sp , color = colorResource(id = R.color.black) , modifier = modifier)
}
@Composable
fun SecondText(text: String , modifier: Modifier = Modifier) {
    Text(text , fontSize = 14.sp , color = colorResource(id = R.color.black) , modifier = modifier)
}
