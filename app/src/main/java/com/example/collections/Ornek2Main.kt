package com.example.collections

fun main (){

    val sayilar = ArrayList<Int>()

    sayilar.add(1)
    sayilar.add(2)
    sayilar.add(3)
    sayilar.add(4)
    sayilar.add(5)

    var sonuc = 1

    for ((indeks,sayi) in sayilar.withIndex()){

        sonuc = sayi*2
        println("$indeks. indeks sonucu = $sonuc")
    }
}