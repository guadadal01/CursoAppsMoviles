package com.guada.cfp401.cursoappsmoviles.ejercicios

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.ExperimentalLayoutApi
import androidx.compose.foundation.layout.FlowColumn
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

@Preview (showBackground = true)
@Composable
fun PrevisualizacionEj(){
    Matriz(8)
}
@OptIn(ExperimentalLayoutApi::class)
@Composable
fun Scroll(){
    FlowColumn {
        TablaDeMultiplicar(1)
        TablaDeMultiplicar(2)
        TablaDeMultiplicar(3)
        TablaDeMultiplicar(4)
        TablaDeMultiplicar(5)
        TablaDeMultiplicar(6)
        TablaDeMultiplicar(7)
        TablaDeMultiplicar(8)
        TablaDeMultiplicar(9)
        TablaDeMultiplicar(10)
    }
}
@Composable
fun TablaDeMultiplicar(tabla: Int){
    Column(Modifier.padding(16.dp)){
        for (i in 1..10)
            Text("$tabla x $i = ${tabla * i}")

    }
}

@Composable
fun Matriz(size:Int){
    Row{
        for(i in 1..size){
            Column(Modifier.padding(16.dp)) {
                for(j in 1..size){
                    Row {
                        if (i==j){
                            Text("1")
                        } else{
                            Text("0")
                        }
                    }
                }
            }
        }
    }

}
