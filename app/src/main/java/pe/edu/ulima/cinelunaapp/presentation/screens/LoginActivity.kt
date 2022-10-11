package pe.edu.ulima.cinelunaapp.presentation.screens

import androidx.compose.runtime.Composable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.text.ClickableText
import androidx.compose.material.Button
import androidx.compose.material.Text
import androidx.compose.material.TextField
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.AnnotatedString
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.input.TextFieldValue
import androidx.compose.ui.text.style.TextDecoration
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController
import pe.edu.ulima.cinelunaapp.ui.theme.Purple700

@Composable
fun LoginPage(navController: NavHostController) {
    Box(modifier = Modifier.fillMaxSize()) {
            Button(
                onClick = { },
                shape = RoundedCornerShape(50.dp),
                modifier = Modifier
                    .align(Alignment.BottomCenter)
                    .fillMaxWidth()
                    .height(50.dp)
            ) {
                Text(text = "Login")
            }
    }
    Column(
        modifier = Modifier.padding(20.dp),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {

        val username = remember { mutableStateOf(TextFieldValue()) }


        Text(text = "Cine Luna App",style = TextStyle(fontSize = 40.sp, fontFamily = FontFamily.Cursive))

        Box(modifier = Modifier.padding(40.dp, 0.dp, 40.dp, 0.dp)) {
            TextField(
                label = { Text(text = "Ingrese su nombre") },
                modifier= Modifier
                    .align(Alignment.Center)
                    .fillMaxWidth()
                    .height(50.dp),
                value = username.value,
                onValueChange = { username.value = it })
        }
            Spacer(modifier = Modifier.height(20.dp))


    }
}