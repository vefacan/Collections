package com.example.collections

fun main() {

    val meyveler = ArrayList<String>()
    meyveler.add("Çilek")
    meyveler.add("Muz")
    meyveler.add("Erik")
    meyveler.add("Ananas")
    meyveler.add("Kiraz")

    println(meyveler.toString())

    val liste: ArrayList<Int> = ArrayList<Int>()
    liste.add(4)
    liste.add(3)
    liste.add(2)
    liste.add(1)
    liste.add(0)

    println(liste.toString())

    val str = meyveler.get(2)
    println(str)
    val str1 = meyveler.get(3)
    println(str1)

    println(meyveler[4])

    meyveler.add("Mandalina")
    meyveler.add("Şeftali")
    println(meyveler.toString())

    meyveler[1] = "Mango"
    println(meyveler.toString())

    meyveler.add(4, "Karpuz")
    println(meyveler.toString())

                    /** İŞLEMLER */  println("İŞLEMLER")

    println(meyveler.isEmpty())
    println(meyveler.count())
    println(meyveler.size)
    println(meyveler.first())
    println(meyveler.last())
    println(meyveler.contains("Kiraz"))

    meyveler.sort()
    println(meyveler.toString())

    meyveler.reverse()
    println(meyveler.toString())

    meyveler.removeAt(4)
    println(meyveler.toString())

    meyveler.remove("Karpuz")
    println(meyveler.toString())

    meyveler.clear()
    println(meyveler.toString())


                    /** DÖNGÜLER */ println("DÖNGÜLER")

    val meyvecikler = ArrayList<String>()

    meyvecikler.add("Çilek")
    meyvecikler.add("Muz")
    meyvecikler.add("Elma")
    meyvecikler.add("Kivi")
    meyvecikler.add("Kiraz")

    for (meyve in meyvecikler){
        println("Sonuç: $meyve")
    }

    for ((indeks,meyve) in meyvecikler.withIndex()){
        println("Sonuç $indeks : $meyve")
    }


}
