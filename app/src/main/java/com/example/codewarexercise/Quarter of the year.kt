package com.example.codewarexercise

fun main(){
    var month: Int
    print("Give a month: ")
    month = readLine()!!.toInt()
    while (month > 12 || month <1) {
        print("Input the month again: ")
        month = readLine()!!.toInt()
    }
    when(month){
        in 1..3 ->{
            println("Month $month is part of the first quarter")
        }
        in 4..6 ->{
            println("Month $month is part of the second quarter")
        }
        in 7..9 ->{
            println("Month $month is part of the third quarter")
        }
        in 10..12 ->{
            println("Month $month is part of the fourth quarter")
        }
    }
}