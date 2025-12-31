package com.pal.dailycode.string

fun findMaxElement(num:IntArray):Int{
    var max =num[0]
    for (i in 1 until num.size){
        if (num[i]>max) {
            max=num[i]
        }
    }
    return max
}
fun main(){
    val arr = intArrayOf(3, 7, 2, 9, 4)

    println("${findMaxElement(arr)}")
}