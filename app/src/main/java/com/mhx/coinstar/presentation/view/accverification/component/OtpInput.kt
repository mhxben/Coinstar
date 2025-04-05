package com.mhx.coinstar.presentation.view.accverification.component

import androidx.compose.foundation.layout.*
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material3.OutlinedTextField
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
import androidx.compose.ui.focus.FocusRequester
import androidx.compose.ui.focus.focusRequester
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun VerificationCodeInput(
    code: List<String>,
    onCodeChange: (Int, String) -> Unit
) {
    val focusRequesters = List(4) { remember { FocusRequester() } }

    Row(
        horizontalArrangement = Arrangement.spacedBy(12.dp),
        modifier = Modifier.padding(horizontal = 16.dp)
    ) {
        code.forEachIndexed { index, value ->
            OutlinedTextField(
                value = value,
                onValueChange = {
                    if (it.length <= 1 && it.all { char -> char.isDigit() }) {
                        onCodeChange(index, it)
                        if (it.isNotEmpty() && index < 3) {
                            focusRequesters[index + 1].requestFocus()
                        }
                    }
                },
                modifier = Modifier
                    .width(60.dp)
                    .height(60.dp)
                    .focusRequester(focusRequesters[index]),
                textStyle = androidx.compose.ui.text.TextStyle(
                    fontSize = 22.sp,
                    textAlign = TextAlign.Center
                ),
                singleLine = true,
                keyboardOptions = KeyboardOptions.Default.copy(
                    keyboardType = KeyboardType.Number
                )
            )
        }
    }

    LaunchedEffect(Unit) {
        focusRequesters[0].requestFocus()
    }
}
