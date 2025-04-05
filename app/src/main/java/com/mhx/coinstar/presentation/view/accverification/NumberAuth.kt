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
import com.mhx.coinstar.presentation.view.accverification.component.*

@Composable
fun NumberAuth(navController: NavController){
    var phoneNumber by remember { mutableStateOf("") }
    Scaffold(
        topBar = {TopAppBarAuth(onBackClick = {navController.popBackStack()})}
    ){paddingValues ->
        Column(
            modifier = Modifier
                .fillMaxSize()
                .padding(paddingValues)
                .padding(16.dp),
            verticalArrangement = Arrangement.spacedBy(24.dp),
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            MainText("Get started!" ,"Please enter your mobile number \nto verify your account")
            PhoneNumberInput(phone = phoneNumber, onPhoneChange = { phoneNumber = it })
            NextButton(phone = phoneNumber , onClick = {navController.navigate("validation")})
            SecondMainText()
        }
    }
}
