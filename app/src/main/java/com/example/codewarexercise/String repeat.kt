package com.example.codewarexercise

fun repeatStr(r: Int, str: String) : String {
    var repeatedStr = ""
    repeat (r){
        repeatedStr += str
    }
    return repeatedStr
}