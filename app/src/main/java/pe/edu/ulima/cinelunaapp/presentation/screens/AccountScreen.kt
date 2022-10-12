package pe.edu.ulima.cinelunaapp.presentation.screens

import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Button
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import pe.edu.ulima.cinelunaapp.Routes

@Composable
fun AccountScreen(navController: NavController) {
    Box(modifier = Modifier.fillMaxSize()) {
        Button(
            onClick = { navController.navigate(Routes.Movies.route) },
            shape = RoundedCornerShape(50.dp),
            modifier = Modifier
                .align(Alignment.BottomCenter)
                .fillMaxWidth()
                .height(50.dp)
        ) {
            Text(text = "Regresar")
        }


        Spacer(modifier = Modifier.height(20.dp))
    }
    Column(
        modifier = Modifier.padding(20.dp),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {

        Text(text = "Randal Antunez de Mayolo (20120083)",style = TextStyle(fontSize = 20.sp, fontFamily = FontFamily.SansSerif))


    }
}