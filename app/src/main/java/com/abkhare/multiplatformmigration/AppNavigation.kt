package com.abkhare.multiplatformmigration

import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.abkhare.featureone.FeatureOneScreen
import com.abkhare.featurethree.FeatureThreeScreen
import com.abkhare.featuretwo.FeatureTwoScreen

@Composable
fun AppNavigation(
    modifier: Modifier = Modifier
) {
    val navigator = rememberNavController()
    NavHost(
        startDestination = NavigationRoute.Home.toString(),
        navController = navigator
    ) {
        composable(route = NavigationRoute.Home.toString()) {
            HomeScreen(
                navigateToModuleOne = { navigator.navigate(NavigationRoute.FeatureOne.toString()) },
                navigateToModuleTwo = { navigator.navigate(NavigationRoute.FeatureTwo.toString()) },
                navigateToModuleThree = { navigator.navigate(NavigationRoute.FeatureThree.toString()) }
            )
        }
        composable(route = NavigationRoute.FeatureOne.toString()) {
            FeatureOneScreen()
        }
        composable(route = NavigationRoute.FeatureTwo.toString()) {
            FeatureTwoScreen()
        }
        composable(route = NavigationRoute.FeatureThree.toString()) {
            FeatureThreeScreen()
        }
    }
}