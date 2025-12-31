package com.pal.dailycode.string

fun reverseSentense(sentense:String):String{

    var result = ""
    var word =""
    for (i in sentense.indices){
        val char = sentense[i]
        if (char == ' '){
            result += reverseStringF(word) + ' '
           word=""
        }else{
           word += char
        }
    }
    result += reverseStringF(word)

    return result
}

fun reverseStringF(str:String):String{
    var reverse =""
    for (i in str.length-1 downTo 0 ){
        reverse +=str[i]
    }
    return reverse
}
fun main(){
    println("${reverseSentense("Hello Kotlin Dev")}")
}