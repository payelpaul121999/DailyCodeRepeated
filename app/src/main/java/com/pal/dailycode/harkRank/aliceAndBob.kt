package com.pal.dailycode.harkRank

fun aliceAndBobProblem(aliceList:Array<Int>,bobList:Array<Int>):Array<Int>{
    var aScore = 0
    var bScore = 0
    for (i in aliceList.indices){
        if (aliceList[i]>bobList[i]){
            aScore ++
        }else if (aliceList[i]< bobList[i]){
            bScore++
        }
    }
    return arrayOf(aScore,bScore)
}

fun main(){
    val a = arrayOf(5 ,6 ,7)
    val b = arrayOf( 3, 6, 10)
    val c =aliceAndBobProblem(a,b)
    println("score ratio: $c")
}