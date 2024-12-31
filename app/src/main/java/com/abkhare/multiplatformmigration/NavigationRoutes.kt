package com.abkhare.multiplatformmigration

sealed class NavigationRoute {

    data object Home : NavigationRoute()

    data object FeatureOne : NavigationRoute()

    data object FeatureTwo : NavigationRoute()
}