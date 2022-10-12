package pe.edu.ulima.cinelunaapp.presentation.screens

import androidx.compose.runtime.Composable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Button
import androidx.compose.material.Text
import androidx.compose.material.TextField
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.input.TextFieldValue
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController
import pe.edu.ulima.cinelunaapp.Routes

@Composable
fun LoginPage(navController: NavHostController) {
    val username = remember { mutableStateOf(TextFieldValue()) }
    Box(modifier = Modifier.fillMaxSize()) {
            Button(
                onClick = {navController.navigate(Routes.Movies.route) },
                shape = RoundedCornerShape(50.dp),
                modifier = Modifier
                    .align(Alignment.BottomCenter)
                    .fillMaxWidth()
                    .height(50.dp)
            ) {
                Text(text = "Login")
            }

    Box(modifier = Modifier.fillMaxSize()) {

        Text(
            text = "Ingrese su nombre:",
            style = TextStyle(
                fontSize = 20.sp
            ),
            modifier = Modifier
                .offset(10.dp,0.dp)
                .align(Alignment.Center)
                .fillMaxWidth()
        )
    }
    Box(modifier = Modifier.fillMaxSize()) {

        TextField(
            label = { Text(text = "ejem: Randal") },
            modifier= Modifier.offset(0.dp,40.dp)
                .align(Alignment.Center)
                .fillMaxWidth()
                .height(50.dp),
            value = username.value,
            onValueChange = { username.value = it })
    }

    }
    Column(
        modifier = Modifier.padding(20.dp),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {

    Box(modifier = Modifier.fillMaxSize()) {
        Text(
            text = "Cine Luna App",
            style = TextStyle(
                fontSize = 40.sp,
                fontFamily = FontFamily.Cursive
            ),
            modifier = Modifier
                .align(Alignment.TopCenter)
        )

    }

    }
}