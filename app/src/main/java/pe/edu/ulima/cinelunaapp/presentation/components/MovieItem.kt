package pe.edu.ulima.cinelunaapp.presentation.components

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.material.Divider
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import pe.edu.ulima.cinelunaapp.model.Pelicula
import pe.edu.ulima.cinelunaapp.R

@Composable
fun MovieItem(
    movieData : Pelicula
) {
    Row(
        modifier = Modifier.fillMaxWidth()
            .height(100.dp),
        verticalAlignment = Alignment.CenterVertically
    ) {
        Text(
            text = movieData.nombre,
            fontSize = 20.sp
        )
        Spacer(
            modifier = Modifier.width(20.dp)
        )
        Text(
            text = movieData.hora,
            fontSize = 20.sp
        )

    }

}