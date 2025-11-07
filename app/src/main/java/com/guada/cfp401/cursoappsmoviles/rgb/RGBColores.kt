package com.guada.cfp401.cursoappsmoviles.rgb

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

@Preview (showSystemUi = true)
@Composable
fun VistaFinal() {
    Column() {
        ElementoR()
        ElementoB()
        ElementoG()
    }
}
@Composable
fun ElementoR (){
    Spacer(Modifier.padding(13.dp))
    var sliderPosition by remember { mutableFloatStateOf(0.0f) }
    Text("Deslizar para elegir como quiere que se forme el elemento R")
    Slider(
        value = sliderPosition,
        onValueChange = { sliderPosition = it },
        colors = SliderDefaults.colors(
            thumbColor = Color.Red,
            activeTrackColor = Color.Green,
            inactiveTrackColor = Color.Gray
        )
    )
    Text("$sliderPosition")
}

@Composable
fun ElementoG (){
    Spacer(Modifier.padding(13.dp))
    var sliderPosition by remember { mutableFloatStateOf(0.0f) }
    Text("Deslizar para elegir como quiere que se forme el elemento G")
    Slider(
        value = sliderPosition,
        onValueChange = { sliderPosition = it },
        colors = SliderDefaults.colors(
            thumbColor = Color.Red,
            activeTrackColor = Color.Green,
            inactiveTrackColor = Color.Gray
        )
    )
    Text("$sliderPosition")
}

@Composable
fun ElementoB(){
    Spacer(Modifier.padding(13.dp))
    var sliderPosition by remember { mutableFloatStateOf(0.0f) }
    Text("Deslizar para elegir como quiere que se forme el elemento B")
    Slider(
        value = sliderPosition,
        onValueChange = { sliderPosition = it },
        colors = SliderDefaults.colors(
            thumbColor = Color.Red,
            activeTrackColor = Color.Green,
            inactiveTrackColor = Color.Gray
        )
    )
    Text("$sliderPosition")
}
