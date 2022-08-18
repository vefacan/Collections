package com.example.collections

import kotlin.random.Random

fun main (){

    val rastgele= ArrayList<Int>(100)

    for (i in 1..100){

        rastgele.add(Random.nextInt(0,100))
    }


    println(rastgele.toString())



}