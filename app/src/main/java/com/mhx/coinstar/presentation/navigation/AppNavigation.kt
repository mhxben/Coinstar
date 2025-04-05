package com.mhx.coinstar.presentation.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.mhx.coinstar.presentation.view.accverification.NumberAuth
import com.mhx.coinstar.presentation.view.accverification.NumberValidationCode
import com.mhx.coinstar.presentation.view.landing.OnBoarding1
import com.mhx.coinstar.presentation.view.landing.OnBoarding2
import com.mhx.coinstar.presentation.view.landing.OnBoarding3
import com.mhx.coinstar.presentation.view.landing.SplashScreen

@Composable
fun AppNavigation() {
    val navController : NavHostController = rememberNavController()
    NavHost(navController = navController, startDestination = "splash") {
        composable("splash") { SplashScreen(navController) }
        composable("onboarding1") { OnBoarding1(navController) }
        composable("onboarding2") { OnBoarding2(navController) }
        composable("onboarding3") { OnBoarding3(navController) }
        composable("number") { NumberAuth(navController) }
        composable("validation") { NumberValidationCode(navController) }
    }
}