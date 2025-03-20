package com.mhx.coinstar.ui.view

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import com.mhx.coinstar.R
import com.mhx.coinstar.ui.theme.SpacerColumn
import com.mhx.coinstar.ui.theme.staticColumn
import kotlinx.coroutines.delay

@Composable
fun SplashScreen(navController: NavController ) {

    LaunchedEffect(Unit) {
        delay(2000)
        navController.navigate("onboarding1") {
            popUpTo("splash") { inclusive = true }
        }
    }

    Column(Modifier.staticColumn(),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.SpaceBetween )
        {
        Image(
            painter = painterResource(id = R.drawable.block1),
            contentDescription = null,
            modifier = Modifier.size(335.dp,567.dp)
        )
        SpacerColumn()

        Image(
            painter = painterResource(id = R.drawable.block2),
            contentDescription = null,
            modifier = Modifier.size(335.dp,143.dp)
        )
    }
}