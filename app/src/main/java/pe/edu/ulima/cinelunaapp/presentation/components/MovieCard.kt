package pe.edu.ulima.cinelunaapp.presentation.components

import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.material.Text
import androidx.compose.material.Card
import androidx.compose.material.Divider
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import pe.edu.ulima.cinelunaapp.R
import pe.edu.ulima.cinelunaapp.model.Pelicula

@Composable
fun MovieCard(
    movieData : Pelicula
) {
    Card(
        elevation = 4.dp
    ) {
        Box(
            modifier = Modifier
                .fillMaxWidth()
                .height(100.dp),
        ) {
            Image(
                painter = painterResource(id = R.drawable.logo),
                contentDescription = "Imagen Pelicula"
            )
            Text(
                text = movieData.nombre,
                fontSize = 20.sp,
                modifier = Modifier.align(Alignment.TopCenter)
            )
            Text(
                text = movieData.hora,
                fontSize = 20.sp,
                modifier = Modifier.align(Alignment.Center)
            )
        Divider(
            modifier = Modifier.fillMaxSize()
        )
        }
    }
}