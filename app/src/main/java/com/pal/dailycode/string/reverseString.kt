package com.pal.dailycode.string

fun reverseString(str:String):String{
    var reverse =""
    for (i in str.length-1 downTo 0 ){
        reverse +=str[i]
    }

    return reverse
}

fun main(){
   println("${reverseString("Hello")}")
}