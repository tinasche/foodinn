package tech.theasbyte.foodinn.ui.screens

import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController

@Preview
@Composable
fun AboutScreenPreview() {
    AboutScreen(navController = rememberNavController())
}

@Composable
fun AboutScreen(modifier: Modifier = Modifier, navController: NavHostController) {
    Text(text = "About Screen")

}
