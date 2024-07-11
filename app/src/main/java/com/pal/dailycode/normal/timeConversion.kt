package com.pal.dailycode.normal
/*
 * Complete the 'timeConversion' function below.
 *
 * The function is expected to return a STRING.
 * The function accepts STRING s as parameter.
 *  timeConversion("07:05:45PM")
     println("${timeConversion("07:05:45PM")}")
 */
fun timeConversion(s:String):String{
    val periods=s.takeLast(2)
    val timePeriods = s.dropLast(2).split(":")
    var hour=timePeriods[0].toInt()
    val min= timePeriods[1]
    val sec = timePeriods[2]
    if(periods=="AM" && hour==12){
       hour = 0
    }else if (periods=="PM" && hour!=12){
        hour+= 12
    }

     return String.format("%02d:%02d:%02d", hour, min.toInt(), sec.toInt())
}
 fun main(){
     timeConversion("07:05:45PM")
     println("${timeConversion("07:05:45PM")}")
 }
