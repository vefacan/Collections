package com.example.collections

fun main (){

    val meyveler = setOf<String>("Çilek","Muz","Elma","Kivi")

    val iller = mutableSetOf<String>("İzmir","Bursa","İstanbul","Ankara")

    val sayilar = HashSet<Int>()

    sayilar.add(20)
    sayilar.add(2)
    sayilar.add(4)
    sayilar.add(73)
    sayilar.add(24)

    println(sayilar.toString())

    sayilar.add(24) // Aynı Veriyi Kayıt Etmez.
    println(sayilar.toString())
    sayilar.add(21) // Farklı sayı olduğu için kayıt olur
    println(sayilar.toString())

    println(sayilar.elementAt(1))
    println(sayilar.size)
    println(sayilar.count())
    println(sayilar.isEmpty())
    println(sayilar.contains(20))
    println(sayilar.contains(85))


    for (s in sayilar){

        println(s)
    }


    for ((i,s) in sayilar.withIndex()){

        println("$i . İndeks, Sayı: $s")

    }

    sayilar.remove(4)
    println(sayilar.toString())

    sayilar.clear()
    println(sayilar.toString())


}