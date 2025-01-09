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
            /*FeatureOneScreen {
                navigator.navigateUp()
            }*/
        }
        composable(route = NavigationRoute.FeatureTwo.toString()) {
            /*FeatureTwoScreen {
                navigator.navigateUp()
            }*/
        }
        composable(route = NavigationRoute.FeatureThree.toString()) {
            /*FeatureThreeScreen {
                navigator.navigateUp()
            }*/
        }
    }
}