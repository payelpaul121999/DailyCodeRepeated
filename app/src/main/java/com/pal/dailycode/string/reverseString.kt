package com.pal.dailycode.string

fun reverseStrings(str:String):String{
    var reverse =""
    for (i in str.length-1 downTo 0 ){
        reverse +=str[i]
    }

    return reverse
}


/***reverse a string**/
fun reverseString(s:String):String{
    return s.reversed()
}

fun reverseStringUsingLoopFromEnd(s:String):String{
    val result = StringBuilder()
    for (i in s.length-1 downTo 0){
        result.append(s[i])
    }
    return result.toString()
}
fun reverseStringUsingSwap(s:String):String{
    val char = s.toCharArray()
    var left =0
    var right = char.lastIndex
    while (left<right){
        val temp=char[left]
        char[left]=char[right]
        char[right]=temp
        left++
        right--
    }
    return String(char)
}
fun main(){
    println("${reverseString("Hello")}")
}