package com.mhx.coinstar.presentation.view.accverification.component

import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowForward
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Icon
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import com.mhx.coinstar.presentation.view.landing.component.PrimaryText

@Composable
fun NextButton(phone : String , onClick: () ->Unit) {
    val isEnabled = phone.isNotBlank()

    Button(
        onClick = onClick,
        enabled = isEnabled,
        modifier = Modifier
            .fillMaxWidth()
            .height(60.dp),
        colors = ButtonDefaults.buttonColors(
            containerColor = if (isEnabled) Color.Black else Color.LightGray,
            contentColor = if (isEnabled) Color.White else Color.Gray
        ),
        shape = RoundedCornerShape(28.dp)
    ){
        Row(verticalAlignment = Alignment.CenterVertically) {
            PrimaryText("Next")
            Spacer(modifier = Modifier.width(8.dp))
            Icon(Icons.Default.ArrowForward, contentDescription = "Arrow")
        }
    }
}