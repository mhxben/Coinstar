package com.mhx.coinstar.presentation.view.accverification.component

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.mhx.coinstar.presentation.view.landing.component.*

@Composable
fun MainText(mainText: String , description : String) {
    Column(modifier = Modifier
        .fillMaxWidth(),
        verticalArrangement = Arrangement.spacedBy(8.dp),
        horizontalAlignment = Alignment.CenterHorizontally) {
        PrimaryText(mainText)
        SeconderText(description)
    }
}

@Composable
fun SecondMainText(){
    SecondText("By clicking \"Next\" you agree to the \nprivacy policy and terms of service")
}