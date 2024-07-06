package com.pal.dailycode.sorting

fun binarySearch(arrayList:ArrayList<Int>,searchItem:Int) : Int{
    var left = 0
    var right = arrayList.size - 1
    while (left <= right){
        val mid = left + (right - left) / 2
        when{
            arrayList[mid]==searchItem -> return mid
            arrayList[mid] < searchItem -> left = mid + 1
            else -> right = mid - 1
        }
    }
    return -1
}