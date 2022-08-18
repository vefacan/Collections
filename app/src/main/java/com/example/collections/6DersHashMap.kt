package com.example.collections

fun main (){

    val sayilar = mapOf<Int,String>(1 to "Bir", 2 to "İki")
    val oranlar = mutableMapOf<Double,String>(1.5 to "Oran1", 3.2 to "Oran2")
    val iller = HashMap<Int,String>()

    iller.put(35,"İzmir")
    iller.put(34,"İstanbul")
    iller.put(6,"Ankara")

    println(iller.toString())
    println(iller.get(34))
    println(iller.size)
    println(iller.count())
    println(iller.isEmpty())
    println(iller.containsKey(6))
    println(iller.containsValue("İzmir"))

    for ((anahtar,deger) in iller){

        println("$anahtar: $deger")

    }
    iller.remove(6)
    println(iller.toString())

    iller.clear()
    println(iller.toString())
}