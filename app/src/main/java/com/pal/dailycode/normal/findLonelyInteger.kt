package com.pal.dailycode.normal
/*Complete the 'lonelyinteger' function below.*/
fun findLonelyInteger(array:Array<Int>):Int{
    var unique = 0
    for (element in array){
        unique=unique xor element
    }
    return unique
}
fun main(){
    val list = arrayOf(1,2,5,5,2)
    findLonelyInteger(list)
    println("${findLonelyInteger(list)}")
}
/*
fun diagonalDifference(arr: Array<Array<Int>>): Int {
    // Write your code here
    var primaryDiago = 0
    var secondaryDiago = 0
    val n = arr.size

    for(i in 0 until n){
        primaryDiago += arr[i][i]
        secondaryDiago += arr[i][n-i-1]
    }

    return kotlin.math.abs(primaryDiago - secondaryDiago)

}*/
