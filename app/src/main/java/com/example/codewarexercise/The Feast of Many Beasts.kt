package com.example.codewarexercise

fun feast(beast: String, dish: String): Boolean {
    val firstBeastLetter = beast[0]
    val lastBeastLetter = beast[beast.length - 1]
    val firstDishLetter = dish[0]
    val lastDishLetter = dish[dish.length - 1]
    if (firstBeastLetter.equals(firstDishLetter) && lastBeastLetter.equals(lastDishLetter)) {
        return true
    } else return false
}