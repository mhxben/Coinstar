package com.mhx.coinstar.presentation.view.landing

import androidx.compose.runtime.Composable
import androidx.navigation.NavController
import com.mhx.coinstar.R
import com.mhx.coinstar.presentation.view.landing.component.OnBoarding

@Composable
fun OnBoarding1(navController: NavController) {

    OnBoarding(
        imageRes = R.drawable.illustration1,
        primaryText = "Manage your finances.",
        secondaryText = "Forget everything you know about the" +
                "chaotic world of finance. It can be easy.",
        onClick = { navController.navigate("onboarding2") },
        selectedIndex = 0,
        totalDots = 3
    )

}

@Composable
fun OnBoarding2(navController: NavController) {
    OnBoarding(
        imageRes = R.drawable.illustration2,
        primaryText = "Control your savings.",
        secondaryText = "Forget everything you know about the" +
                "chaotic world of finance. It can be easy.",
        onClick = { navController.navigate("onboarding3") },
        selectedIndex = 1,
        totalDots = 3
    )
}

@Composable
fun OnBoarding3(navController: NavController) {
    OnBoarding(
        imageRes = R.drawable.illustration3,
        primaryText = "Easy banking.",
        secondaryText = "Forget everything you know about the" +
                "chaotic world of finance. It can be easy.",
        onClick = {navController.navigate("number")},
        selectedIndex = 2,
        totalDots = 3
    )
}

