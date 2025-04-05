package com.mhx.coinstar.presentation.view.accverification.component

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import com.mhx.coinstar.R

@Composable
fun PhoneNumberInput(
    phone: String,
    onPhoneChange: (String) -> Unit
) {

    Row(verticalAlignment = Alignment.CenterVertically, modifier = Modifier.padding(16.dp).fillMaxWidth()) {
        Image(
            painter = painterResource(id = R.drawable.flag ),
            contentDescription = "Flag",
            modifier = Modifier.size(32.dp)
        )
        Spacer(modifier = Modifier.width(8.dp))

        MainTextField(phone, onValueChange = onPhoneChange, modifier = Modifier.weight(1f))
    }
}