package com.mhx.coinstar.ui.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.mhx.coinstar.ui.view.OnBoarding1
import com.mhx.coinstar.ui.view.OnBoarding2
import com.mhx.coinstar.ui.view.OnBoarding3
import com.mhx.coinstar.ui.view.SplashScreen

@Composable
fun AppNavigation() {
    val navController : NavHostController = rememberNavController()
    NavHost(navController = navController, startDestination = "splash") {
        composable("splash") { SplashScreen(navController) }
        composable("onboarding1") { OnBoarding1(navController) }
        composable("onboarding2") { OnBoarding2(navController) }
        composable("onboarding3") { OnBoarding3(navController) }
    }
}