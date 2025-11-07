package com.guada.cfp401.cursoappsmoviles.navigation

import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.navigation.NavController

@Composable
fun Home(navController: NavController){
    Button(onClick = {navController.navigate("halloween_app")}) {
        Text("Ir a Halloween")
    }
}