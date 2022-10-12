package pe.edu.ulima.cinelunaapp.presentation.screens

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Button
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import androidx.navigation.NavHostController
import pe.edu.ulima.cinelunaapp.Routes
import pe.edu.ulima.cinelunaapp.model.Pelicula
import java.lang.reflect.Modifier

@Composable
fun DetailScreen() {
    Box(modifier = androidx.compose.ui.Modifier.fillMaxSize()) {

    }
    Box(
        modifier = androidx.compose.ui.Modifier.fillMaxSize(),
        contentAlignment = Alignment.Center
    ) {
        Text(
            text = "Detalle",
            style = MaterialTheme.typography.h4
        )
    }
}