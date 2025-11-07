package com.guada.cfp401.cursoappsmoviles.ejercicios

import androidx.compose.foundation.Image
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonColors
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.MutableState
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.guada.cfp401.cursoappsmoviles.R
import com.guada.cfp401.cursoappsmoviles.ui.theme.CursoAppsMovilesTheme

//@Preview(showSystemUi = false)
//Solo funciona en composable, no se puede usar con parametros
@Composable
fun PrevisualizacionDark() {
    CursoAppsMovilesTheme(darkTheme = true) {
        Surface {
            Listado()
        }
    }
}

//@Preview(showSystemUi = false)
//Solo funciona en composable, no se puede usar con parametros
@Composable
fun Previsualizacion() {
    CursoAppsMovilesTheme {
        Surface {
            Tarjeta()
        }
    }
}


@Composable
fun Listado() {
    val scrollState = rememberScrollState()
    Column(
        Modifier.fillMaxSize().verticalScroll(scrollState),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        for(i in 1..20) Tarjeta()
    }
}


@Composable
fun Imagen2() {
    Image(
        painterResource(R.drawable.minion), "Icono de Minion",
        modifier = Modifier
            .clip(CircleShape)
            .size(70.dp)
            .border(3.dp, MaterialTheme.colorScheme.primary, CircleShape)
    )
}

@Composable
fun Saludo(lugar: String) { //Elemento componible, no funcion
    Column(Modifier.padding(5.dp)) {
        Text("Hola mundo desde $lugar!", fontFamily = FontFamily(Font(R.font.kindergarten)) )
        Spacer(Modifier.height(6.dp))
        Text("¿Preparado?", fontFamily = FontFamily(Font(R.font.kindergarten)))
    }
}

@Composable
fun Tarjeta() {
    Row(Modifier.padding(6.dp)) {
        Imagen2()
        Saludo("Compose")
        Boton()

    }
}

@Composable
fun Boton(){
    val contador = remember { mutableStateOf(0) }
    Button(onClick = {
        contador.value++ },
        colors = ButtonColors(Color.Black, Color.Yellow,
            Color.Gray,Color.Black)) {
        Text("Click ${contador.value}")
    }
}

@Preview (showBackground = true)
@Composable
fun ControlCantidad() {
    var contador2 = remember { mutableStateOf(0) }
    Column (
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
    Row (verticalAlignment = Alignment.CenterVertically,
        horizontalArrangement = Arrangement.Center
    ) {
        Disminucion(contador2)
        Text("${contador2.value}", fontSize = 30.sp,  modifier = Modifier.padding(8.dp))
        Incremento(contador2)
    }
        Reseteo(contador2)
 }
}


@Composable
fun Incremento(contador2: MutableState<Int> ) {
    Button(onClick = { contador2.value++},
        colors = ButtonColors(Color.Green,Color.Black,
            Color.Gray,Color.Black)) {
        Text("+")
    }
}

@Composable
fun Disminucion(contador2: MutableState<Int>){
    Button(onClick = { if (contador2.value > 0) contador2.value--},
        colors = ButtonColors(Color.Red,Color.Black,
            Color.Gray, Color.Black)) {
        Text("-")
  }
}

@Composable
fun Reseteo(contador2: MutableState<Int>){
    Button(onClick = {contador2.value = 0})
    { Text("Resetear")}
}