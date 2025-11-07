package com.guada.cfp401.cursoappsmoviles.halloween

import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.tooling.preview.Preview
import com.guada.cfp401.cursoappsmoviles.R
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.ui.Alignment
import androidx.compose.ui.draw.drawBehind
import androidx.compose.ui.geometry.CornerRadius
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp




@Preview (showSystemUi = true)
@Composable
fun PeliculasHalloweenApp(){
    Image(
        painterResource(R.drawable.fondo),"Fondo App",
        modifier = Modifier.fillMaxSize(),
        contentScale = ContentScale.Crop
    )
    Listado(listaDePeliculas)
}

@Composable
fun Listado(listaDePeliculas: List<Pelicula>) {
    LazyColumn {
        items(listaDePeliculas){ pelicula ->
            TarjetaPeliculas(pelicula)
        }
    }
}

@Composable
fun TarjetaPeliculas (pelicula: Pelicula) {
    Column(
        Modifier.padding(10.dp),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Spacer(Modifier.padding(10.dp))
        Text(
            text = pelicula.titulo,
            fontSize = 23.sp,
            fontFamily = FontFamily(Font(R.font.spokyspiders)),
            modifier = Modifier
                .drawBehind{
                    drawRoundRect(Color.White, cornerRadius = CornerRadius(10f))
                }.padding(16.dp)
        )
        Spacer(Modifier.padding(7.dp))
        Image(
            painterResource(id = pelicula.imagen),
            "Portada de ${pelicula.titulo}",
            modifier = Modifier.size(300.dp)
        )
        Text(
            text = pelicula.actores,
            fontFamily = FontFamily(Font(R.font.coolvetica_rg)),
            modifier = Modifier
                .drawBehind{
                    drawRoundRect(Color.White, cornerRadius = CornerRadius(2f))
                }.padding(8.dp)
        )
        Text(
            text = pelicula.descripcion,
            fontFamily = FontFamily(Font(R.font.coolvetica_rg)),
            modifier = Modifier
                .drawBehind{
                    drawRoundRect(Color.White, cornerRadius = CornerRadius(10f))
                }.padding(10.dp)
        )
        Text(
            text = pelicula.duracion,
            fontFamily = FontFamily(Font(R.font.coolvetica_rg)),
            modifier = Modifier
                .drawBehind{
                    drawRoundRect(Color.White, cornerRadius = CornerRadius(10f))
                }.padding(5.dp)
        )
        Text(
            text = pelicula.verla,
            fontFamily = FontFamily(Font(R.font.coolvetica_rg)),
            modifier = Modifier
                .drawBehind{
                    drawRoundRect(Color.White, cornerRadius = CornerRadius(10f))
                }.padding(5.dp)
        )
    }
}




