package com.pal.dailycode.normal

fun fibonaciSeries(n:Int):List<Int>{
    if (n<=0) return emptyList()
    val numbers= mutableListOf(0,1)
    for (i in 2 until n){
        numbers.add(numbers[i-1]+numbers[i-2])
    }
        return numbers.take(n)
}
fun main() {
    println(fibonaciSeries(10))
}

