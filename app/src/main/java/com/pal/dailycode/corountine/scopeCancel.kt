package com.pal.dailycode.corountine

import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.cancel
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch
import kotlinx.coroutines.runBlocking

fun main() = runBlocking {
    val scope = CoroutineScope(Dispatchers.Default)

    scope.launch {
            repeat(5) { i ->
                println("Coroutine 1 working: $i")
                delay(100)
            }
    }

    scope.launch {
        repeat(5){i->
            println("Coroutine 2 working: $i")
            delay(100)
        }
    }

  //   Delay a bit, then cancel the scope
    delay(250)
    println("Cancelling scope...")
    scope.cancel() // Cancels all coroutines in the scope

    delay(2000) // Give time to observe the cancellation effect
    println("Scope cancelled")
}