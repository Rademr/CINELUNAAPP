package pe.edu.ulima.cinelunaapp.presentation.components

import androidx.compose.runtime.Composable
import androidx.navigation.NavArgs
import androidx.navigation.NavController
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import pe.edu.ulima.cinelunaapp.Routes
import pe.edu.ulima.cinelunaapp.model.Pelicula
import pe.edu.ulima.cinelunaapp.presentation.screens.AccountScreen
import pe.edu.ulima.cinelunaapp.presentation.screens.LoginPage
import pe.edu.ulima.cinelunaapp.presentation.screens.MoviesScreen
import pe.edu.ulima.cinelunaapp.presentation.screens.DetailScreen


@Composable
fun NavigationGraph(
    navController : NavHostController
) {
    NavHost(
        navController = navController,
        startDestination = Routes.Login.route
    ) {

        composable(Routes.Login.route) {
            LoginPage(navController = navController)
        }
        composable(Routes.Movies.route) {
            MoviesScreen(navController = navController)
        }
        composable(Routes.Account.route) {
            AccountScreen(navController = navController)
        }
        composable(Routes.Detail.route) {
            DetailScreen()
        }
    }
}

