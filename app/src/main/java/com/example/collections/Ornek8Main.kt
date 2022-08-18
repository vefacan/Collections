package com.example.collections

import java.util.*
import kotlin.collections.ArrayList

fun main (){

    val girdi = Scanner(System.`in`)
    var i = 0
    val ogrenciNotu = ArrayList<Ornek8>()
    var ort = 0

    while (i < 5){
        println("Dersin Adını Giriniz:")
        var dersAdi = girdi.next()
        println("Ders Notunu Giriniz:")
        var dersNotu = girdi.nextInt()
        ort = ort + dersNotu
        var ogrenciKarnesi = Ornek8(dersAdi,dersNotu)
        ogrenciNotu.add(ogrenciKarnesi)
        i = i + 1
    }
    for (i in ogrenciNotu){
        println("${i.dersAdi}: ${i.dersNotu}")
    }
    ort = ort/5
    println("Ortalama: $ort")

    if (ort<50){
        println("Sınıfta Kaldınız.")
    }
    else
    {
        println("Sınıfı geçtiniz.")
    }
}