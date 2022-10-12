package pe.edu.ulima.cinelunaapp

sealed class Routes(val route: String) {
    object Login : Routes("Login")
    object Movies : Routes("Movies")
    object Account : Routes("Account")
    object Navigation : Routes("Navigation")
    object Detail : Routes("Detail")
}