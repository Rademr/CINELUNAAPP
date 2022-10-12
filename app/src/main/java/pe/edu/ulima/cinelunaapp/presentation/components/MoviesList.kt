package pe.edu.ulima.cinelunaapp.presentation.components

import androidx.compose.foundation.ExperimentalFoundationApi
import androidx.compose.foundation.lazy.GridCells
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.LazyVerticalGrid
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import pe.edu.ulima.cinelunaapp.model.Pelicula

enum class MoviesListType {
    List,Grid
}

@OptIn(ExperimentalFoundationApi::class)
@Composable
fun MoviesList(
    movies : List<Pelicula>,
    type : MoviesListType,
    modifier: Modifier = Modifier
) {
    if (type == MoviesListType.List){
        LazyColumn() {
            items(movies.size) { index ->
                MovieItem(movieData = movies[index])
            }
        }
    }else {
        LazyVerticalGrid(
            modifier = modifier,
            cells = GridCells.Adaptive(minSize = 300.dp)
        ) {
            items(movies.size) { index ->
                MovieCard(movieData = movies[index])
            }
        }
    }

}