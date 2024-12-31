package com.abkhare.multiplatformmigration

import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController

@Composable
fun AppNavigation(
    modifier: Modifier = Modifier
) {
    val navigator = rememberNavController()
    NavHost(
        startDestination = NavigationRoute.FeatureOne,
        navController = navigator
    ) {
        composable(route = NavigationRoute.FeatureOne.toString()) {
            FeatureOneScreen()
        }
        composable(route = NavigationRoute.FeatureTwo.toString()) {
            FeatureTwoScreen()
        }
    }
}