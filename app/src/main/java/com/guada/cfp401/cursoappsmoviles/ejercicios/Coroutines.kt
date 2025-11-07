package com.guada.cfp401.cursoappsmoviles.ejercicios

import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.coroutineScope
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch
import kotlinx.coroutines.runBlocking
import kotlin.random.Random

fun problema1(){
    GlobalScope.launch {
        for(i in 1..10) {
            println("$i")
            delay(1000)
        }
    }
    GlobalScope.launch {
        for(i in 11..20){
            println("$i")
            delay(1000)
        }
    }
    readln()
}

fun problema2()= runBlocking {
    val adivina = Random.nextInt(1,100)
    launch {
        var intento: Int
        var inicio = 1
        var fin = 100

            var gane = false
            do {
                intento = Random.nextInt(inicio, fin)

                if (intento == adivina) {
                    println("Gané con el número $intento")
                    gane = true
                } else {
                    delay(500)
                    if (intento < adivina) {
                        println("El número es mayor a $intento")
                        inicio = intento
                    } else {
                        println("El número es menor a $intento")
                        fin = intento
                    }
                }

            } while (!gane)
        }
    }


fun busquedaDicotomica() = runBlocking{
    val adivina = Random.nextInt(1,100)

    launch {
        var intento: Int
        var inicio = 1
        var fin = 100
        var medio: Int

        var gane = false
        do {
            medio = (inicio + fin) / 2

            if (medio == adivina) {
                println("Gané con el número $medio")
                gane = true
            } else {
                delay(500)
                if (medio < adivina) {
                    println("El número es mayor a $medio")
                    inicio = medio + 1
                } else {
                    println("El número es menor a $medio")
                    fin = medio - 1
                }
            }

        } while (!gane)
    }
}

fun probarBlock() = runBlocking {
    launch {
        delay(1000)
        println("Hola")
    }
    launch {
        delay(1000)
        println("Mundo")
    }
}
suspend fun corrutina(num: Int) = coroutineScope {
    launch {
        delay(1000)
        println("Corrutina $num")
    }
}

suspend fun prueba() = coroutineScope {
    corrutina(1)
    corrutina(2)
}
fun main(){
}