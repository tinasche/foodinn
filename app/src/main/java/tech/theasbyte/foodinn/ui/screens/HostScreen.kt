package tech.theasbyte.foodinn.ui.screens

import android.util.Log
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Home
import androidx.compose.material.icons.filled.Info
import androidx.compose.material.icons.filled.Notifications
import androidx.compose.material.icons.filled.ShoppingCart
import androidx.compose.material3.CenterAlignedTopAppBar
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.NavigationBar
import androidx.compose.material3.NavigationBarItem
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBarColors
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import tech.theasbyte.foodinn.ui.theme.FoodInnTheme

const val TAG = "NavControllerWork"

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun HostScreen(modifier: Modifier = Modifier) {
    Scaffold(
        topBar = { FoodInnTopBar() },
        bottomBar = { BottomNavBar(navItems, navController = rememberNavController()) }) {
        Column(modifier = modifier.padding(it)) {
            NavGraph()
        }
    }
}

val navItems = listOf<NavItem>(
    NavItem(text = "Home", Icons.Default.Home, FoodInnDestinations.HOME_ROUTE),
    NavItem(text = "Cart", Icons.Default.ShoppingCart, FoodInnDestinations.CART_ROUTE),
    NavItem(
        text = "Notifications", Icons.Default.Notifications, FoodInnDestinations.NOTIFICATIONS_ROUTE
    ),
    NavItem(text = "About", Icons.Default.Info, FoodInnDestinations.ABOUT_ROUTE),
)


@Composable
fun BottomNavBar(navItems: List<NavItem>, navController: NavController) {
    var selectedItem by remember { mutableStateOf(0) }

    NavigationBar {
        navItems.forEachIndexed { index, navItem ->
            NavigationBarItem(
                selected = selectedItem == index,
                onClick = {
                    selectedItem = index
                    navController.navigate(navItem.destination)
                    Log.i(TAG, "Navigating to ${navItem.destination}")
                },
                icon = {
                    Icon(
                        navItem.icon,
                        contentDescription = navItem.text
                    )
                }, label = {
                    Text(text = navItem.text)
                })

        }
    }
}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun FoodInnTopBar() {
    CenterAlignedTopAppBar(
        title = { Text(text = "Food Inn") },
        colors = TopAppBarDefaults.centerAlignedTopAppBarColors(containerColor = Color.Transparent)
    )
}

data class NavItem(val text: String, val icon: ImageVector, val destination: String = "")

@Preview(showSystemUi = true, showBackground = true)
@Composable
fun HostScreenPreview() {
    FoodInnTheme {
        HostScreen()
    }
}