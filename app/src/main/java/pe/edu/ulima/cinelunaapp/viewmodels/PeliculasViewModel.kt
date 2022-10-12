package pe.edu.ulima.cinelunaapp.viewmodels

import androidx.compose.runtime.mutableStateListOf
import androidx.lifecycle.ViewModel
import pe.edu.ulima.cinelunaapp.model.GestorPeliculas
import pe.edu.ulima.cinelunaapp.model.Pelicula

class PeliculasViewModel : ViewModel() {
    val moviesList = mutableStateListOf<Pelicula>()

    fun getCourses() : Unit {
        GestorPeliculas.getInstance().obtenerPeliculas().forEach {
            moviesList.add(it)
        }
    }
}