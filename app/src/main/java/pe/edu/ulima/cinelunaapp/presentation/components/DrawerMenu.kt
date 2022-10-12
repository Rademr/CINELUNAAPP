package pe.edu.ulima.cinelunaapp.presentation.components

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.material.Divider
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController

@Composable
fun DrawerMenu(
    navController: NavController,
    onCloseDrawer : () -> Unit,
    onChangeTitle : (String) -> Unit
) {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(
                start = 24.dp,
                end = 24.dp
            )
    ) {
        Text(
            text = "Randal",
            modifier = Modifier.offset(40.dp,10.dp)
                    .height(50.dp),

        )
        Divider(
            modifier = Modifier.fillMaxWidth()
        )
        Text(
            text = "Cartelera",
            modifier = Modifier
                .height(32.dp)
                .clickable {
                    navController.navigate("movies")
                    onCloseDrawer()
                    onChangeTitle("Cartelera")
                }
        )
        Divider(
            modifier = Modifier.fillMaxWidth()
        )
        Text(
            text = "Sobre nosotros",
            modifier = Modifier
                .height(32.dp)
                .clickable {
                    navController.navigate("account")
                    onCloseDrawer()
                    onChangeTitle("¿Quienes Somos?")
                }
        )
    }
}