package com.example.collections

fun main (){

    val sayilar = ArrayList<Int>()

    sayilar.add(1)
    sayilar.add(4)
    sayilar.add(7)
    sayilar.add(8)
    sayilar.add(5)
    sayilar.add(2)
    sayilar.add(3)
    sayilar.add(6)
    sayilar.add(9)

    val teksayilar = ArrayList<Int>()
    val ciftsayilar = ArrayList<Int>()

    for (i in sayilar){

        var a = i%2

        if (a==1){
            teksayilar.add(i)
        }
        else {
            ciftsayilar.add(i)
        }
    }
    println(teksayilar.toString())
    println(ciftsayilar.toString())
}