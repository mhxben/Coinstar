package com.mhx.coinstar.presentation.view.landing.component

import androidx.annotation.DrawableRes
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import com.mhx.coinstar.ui.theme.SpacerColumn
import com.mhx.coinstar.ui.theme.staticColumn
import com.mhx.coinstar.ui.theme.staticRow

@Composable
fun OnBoarding(@DrawableRes imageRes: Int,
               primaryText : String,
               secondaryText : String,
               onClick:()->Unit,
               selectedIndex: Int,
               totalDots: Int) {
    Column (Modifier.staticColumn()){
        Image(
            painter = painterResource(id = imageRes),
            contentDescription = "",
            modifier = Modifier.size(375.dp,540.dp)
        )

        SpacerColumn()
        PrimaryText(primaryText)
        Spacer(modifier = Modifier.height(8.dp))
        SecondText(secondaryText)
        SpacerColumn()

        Row (Modifier.staticRow()
            ,verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.SpaceBetween) {

            DotsIndicator(selectedIndex,totalDots)
            CircleButton { onClick() }
        }

    }
}
