package tech.theasbyte.foodinn.ui.screens

import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.NavGraph
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController

object FoodInnDestinations {
    const val HOME_ROUTE = "home"
    const val CART_ROUTE = "cart"
    const val ABOUT_ROUTE = "about"
    const val NOTIFICATIONS_ROUTE = "notifications"
}

@Composable
fun NavGraph(
    modifier: Modifier = Modifier,
    navController: NavHostController = rememberNavController(),
    startDestination: String = FoodInnDestinations.HOME_ROUTE
) {

    NavHost(navController = navController, startDestination = startDestination) {
        composable(FoodInnDestinations.HOME_ROUTE){
            HomeScreen()
        }
        composable(FoodInnDestinations.CART_ROUTE){
            CartScreen()
        }
        composable(FoodInnDestinations.ABOUT_ROUTE){
            AboutScreen()
        }
        composable(FoodInnDestinations.NOTIFICATIONS_ROUTE){
            NotificationScreen()
        }
    }
}