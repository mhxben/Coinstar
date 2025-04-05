package com.mhx.coinstar.presentation.view.accverification

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import com.mhx.coinstar.presentation.view.accverification.component.MainText
import com.mhx.coinstar.presentation.view.accverification.component.NextButton
import com.mhx.coinstar.presentation.view.accverification.component.TopAppBarAuth
import com.mhx.coinstar.presentation.view.accverification.component.VerificationCodeInput
import com.mhx.coinstar.presentation.view.landing.component.SecondText

@Composable
fun NumberValidationCode(navController: NavController) {
    var code by remember { mutableStateOf(List(4) { "" }) }

    Scaffold(
        topBar = { TopAppBarAuth (onBackClick = { navController.popBackStack() }) },
    ){paddingValues ->
        Column(
            modifier = Modifier
                .fillMaxSize()
                .padding(paddingValues)
                .padding(16.dp),
            verticalArrangement = Arrangement.spacedBy(24.dp),
            horizontalAlignment = Alignment.CenterHorizontally
        ){
            MainText("Enter verification code" , "Please enter the code from the SMS")
            VerificationCodeInput(
                code = code,
                onCodeChange = { index, value ->
                    code = code.toMutableList().also { it[index] = value }
                }
            )
            SecondText("Didn't receive an SMS?\n Resend SMS")
            NextButton(
                phone = code.joinToString(""),
                onClick = {}
            )
        }
    }
}