package pe.edu.ulima.cinelunaapp

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import pe.edu.ulima.cinelunaapp.presentation.components.NavigationGraph
import pe.edu.ulima.cinelunaapp.presentation.screens.LoginPage
import pe.edu.ulima.cinelunaapp.presentation.screens.NavigationScreen
import pe.edu.ulima.cinelunaapp.ui.theme.CinelunaappTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            CinelunaappTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colors.background
                ) {
                    NavigationScreen()
                }
            }
        }
    }
}



@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    CinelunaappTheme {
        NavigationScreen()
    }
}