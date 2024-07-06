package com.pal.dailycode.sorting

fun linearSort(arrayList:ArrayList<Int>,searchItem:Int) : Int {
    arrayList.forEach { it
        if (searchItem == arrayList[it]) return it else return -1

    }
    return -1
}