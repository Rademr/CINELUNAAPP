package pe.edu.ulima.cinelunaapp

sealed class Routes(val route: String) {
    object Login : Routes("Login")
}