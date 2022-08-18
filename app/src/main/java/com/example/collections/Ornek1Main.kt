package com.example.collections

fun main (){

    val sayilar = ArrayList<Int>()

    sayilar.add(20)
    sayilar.add(40)
    sayilar.add(60)
    sayilar.add(80)
    sayilar.add(100)

    var toplam = 0
    var i = 0

    for (o in sayilar){

        i = i+1
        toplam = toplam + o
    }

    println(toplam/i)
    println(toplam/sayilar.size)

}
