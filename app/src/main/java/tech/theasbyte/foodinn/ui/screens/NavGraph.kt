package tech.theasbyte.foodinn.ui.screens

import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.NavController
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
    navController: NavHostController,
    modifier: Modifier = Modifier
) {

    NavHost(navController = navController, startDestination = FoodInnDestinations.HOME_ROUTE) {
        composable(route = FoodInnDestinations.HOME_ROUTE) {
            HomeScreen()
        }
        composable(route = FoodInnDestinations.CART_ROUTE) {
            CartScreen()
        }
        composable(route = FoodInnDestinations.ABOUT_ROUTE) {
            AboutScreen()
        }
        composable(route = FoodInnDestinations.NOTIFICATIONS_ROUTE) {
            NotificationScreen()
        }
    }
}