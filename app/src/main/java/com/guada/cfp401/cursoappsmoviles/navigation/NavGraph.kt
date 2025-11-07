package com.guada.cfp401.cursoappsmoviles.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.guada.cfp401.cursoappsmoviles.halloween.PeliculasHalloweenApp

@Composable
fun NavGraph() {
    val navController = rememberNavController()
    NavHost(navController, startDestination = "Home_Screen") {
        composable("Home_Screen") {
            Home(navController)
        }
        composable("halloween_app") {
            PeliculasHalloweenApp()
        }
    }
}
