package com.pal.dailycode

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import com.pal.dailycode.databinding.ActivityMainBinding
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.async
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch
import kotlinx.coroutines.withContext

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.mainThread.setOnClickListener {
            setActionFromBackground()
        }
       binding.backThread.setOnClickListener {
           CoroutineScope(Dispatchers.IO).launch {
               setActionFromMain()
           }
       }
      CoroutineScope(Dispatchers.IO).launch {
          val one = async { doReturnOneResult() }
          val two =async { doReturnTwoResult() }
          var sum = one.await() + two.await()
          withContext(Dispatchers.Main){
              binding.backText.text = "Hello $sum" + "${Thread.currentThread().name}"
          }
      }

    }
    private fun setActionFromBackground(){
        CoroutineScope(Dispatchers.Main).launch {
            binding.mainThread.text = "Hello" + "${Thread.currentThread().name}"
        }
    }
    private suspend fun setActionFromMain(){
        for (i in 1..10000){
            withContext(Dispatchers.Main){
                binding.backText.text = "Hello $i" + "${Thread.currentThread().name}"
            }
        }
    }

    private suspend fun doReturnOneResult() : Int{
        delay(8000)
        Log.d("TAG_PL","1st Work is Done")
        return 8
    }
    private suspend fun doReturnTwoResult() : Int{
        delay(12000)
        Log.d("TAG_PL","1st Work is Done")
        return 8
    }
}