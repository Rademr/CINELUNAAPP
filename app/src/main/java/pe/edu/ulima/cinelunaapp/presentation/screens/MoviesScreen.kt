package pe.edu.ulima.cinelunaapp.presentation.screens

import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Button
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.lifecycle.viewmodel.compose.viewModel
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import pe.edu.ulima.cinelunaapp.Routes
import pe.edu.ulima.cinelunaapp.model.Pelicula
import pe.edu.ulima.cinelunaapp.presentation.components.Header
import pe.edu.ulima.cinelunaapp.presentation.components.MoviesList
import pe.edu.ulima.cinelunaapp.presentation.components.MoviesListType
import pe.edu.ulima.cinelunaapp.ui.theme.CinelunaappTheme
import pe.edu.ulima.cinelunaapp.viewmodels.PeliculasViewModel

@Composable
fun MoviesScreen(navController: NavController,
    peliculasViewModel : PeliculasViewModel = viewModel()
) {
    LaunchedEffect(key1 = true) {
        peliculasViewModel.getCourses()
    }
    Box(modifier = Modifier.fillMaxSize()) {
        Button(
            onClick = { navController.navigate(Routes.Login.route) },
            shape = RoundedCornerShape(50.dp),
            modifier = Modifier
                .align(Alignment.BottomCenter)
                .fillMaxWidth()
                .height(50.dp)
        ) {
            Text(text = "Regresar")
        }
        Column(
            modifier = Modifier
                .fillMaxSize()
        ) {
            Header()
            MoviesList(
                movies = peliculasViewModel.moviesList,
                type = MoviesListType.Grid
            )
        }
    }

}
