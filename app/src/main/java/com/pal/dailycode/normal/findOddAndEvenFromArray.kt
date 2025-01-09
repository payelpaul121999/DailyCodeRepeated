package com.pal.dailycode.normal

fun findOddAndEvenFromArray(){
    val numbersArray = arrayOf(1,2,8,9,6,7,12)
    /*val evenList = numbersArray.filter { it % 2 == 0 }
    val oddList = numbersArray.filter { it % 2 != 0 }*/

    val evenList = mutableListOf<Int>()
    val oddList = mutableListOf<Int>()
    for (numben in numbersArray){
        if (numben % 2==0){
            evenList.add(numben)
        }else{
            oddList.add(numben)
        }
    }

    println("EvenList from Array :${evenList}")
    println("OddList from Array :${oddList}")
}
fun main(){
    findOddAndEvenFromArray()
}