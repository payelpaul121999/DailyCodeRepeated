package com.pal.dailycode.harkRank

fun aVeryBigSum(a:Array<Long>):Long{
var sum :Long =0
    for (value in a){
        sum += value
    }

    return sum
}

fun main(){

    val b = arrayOf<Long>(1000000001, 1000000002, 1000000003, 1000000004, 1000000005)
    val c =aVeryBigSum(b)
    println("score ratio: $c")
}