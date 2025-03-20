package com.mhx.coinstar.ui.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import com.mhx.coinstar.R
import com.mhx.coinstar.ui.view.component.OnBoarding

@Composable
fun OnBoardingNavGraph(navController: NavHostController) {
    NavHost(navController = navController, startDestination = "onboarding1") {

        composable("onboarding1") {
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

        composable("onboarding2") {
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

        composable("onboarding3") {
            OnBoarding(
                imageRes = R.drawable.illustration3,
                primaryText = "Easy banking.",
                secondaryText = "Forget everything you know about the" +
                        "chaotic world of finance. It can be easy.",
                onClick = {},
                selectedIndex = 2,
                totalDots = 3
            )
        }

    }

}