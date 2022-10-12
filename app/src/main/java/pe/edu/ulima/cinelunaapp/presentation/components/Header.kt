package pe.edu.ulima.cinelunaapp.presentation.components

import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.platform.LocalContext
import pe.edu.ulima.cinelunaapp.R

@Composable
fun Header() {
    Text(
        text = LocalContext.current.getString(
            R.string.movies_list_title
        )
    )
}