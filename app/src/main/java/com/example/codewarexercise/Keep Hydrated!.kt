package com.example.codewarexercise

import kotlin.math.floor

fun litres(time: Double): Int {
    println("How long have you been cycling")
    val litres: Int = floor(time * 0.5).toInt()
    println("You must drink least $litres")
    return litres
}