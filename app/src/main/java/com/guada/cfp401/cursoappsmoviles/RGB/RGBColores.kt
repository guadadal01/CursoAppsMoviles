package com.guada.cfp401.cursoappsmoviles.RGB

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Slider
import androidx.compose.material3.SliderDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableFloatStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

class RGBColores : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {

        }
    }
}
@Preview (showSystemUi = true)
@Composable
fun VistaFinal() {
    var sliderPositionR by remember { mutableFloatStateOf(0.0f) }
    var sliderPositionG by remember { mutableFloatStateOf(0.0f) }
    var sliderPositionB by remember { mutableFloatStateOf(0.0f) }
    Column() {
        Elementos('R', sliderPositionR)
        Elementos('G', sliderPositionG)
        Elementos('B', sliderPositionB)
    }
}
@Composable
fun Elementos(elemento: Char, state: Float){
    Spacer(Modifier.padding(13.dp))
    Text("Deslizar para elegir como quiere que se forme el elemento $elemento")
    Slider(
        value = state,
        onValueChange = { state },
        colors = SliderDefaults.colors(
            thumbColor = Color.Red,
            activeTrackColor = Color.Green,
            inactiveTrackColor = Color.Gray
        )
    )
    Text("$state")
}
