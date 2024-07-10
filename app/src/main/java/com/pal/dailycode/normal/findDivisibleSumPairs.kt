package com.pal.dailycode.normal

fun findDivisibleSumPairs(length:Int,divNum:Int,array: Array<Int>):Int{
    var count = 0
    for (i in 0 until length){
        for (j in i+1 until length)
        {
            if ((array[i]+array[j]) % divNum==0){
                count++
            }
        }
    }
    return count
}

fun main(){
    val n = 6
    val k = 3
    val ar = arrayOf(1, 3, 2, 6, 1, 2)
    val result = findDivisibleSumPairs(n, k, ar)
    println(result)  // Output: 5
}