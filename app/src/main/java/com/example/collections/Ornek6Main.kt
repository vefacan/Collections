package com.example.collections

import java.util.*
import kotlin.collections.ArrayList

fun main (){


    val girdi = Scanner(System.`in`)


    println("Öğrencinin ismi:")
    val o1isim = girdi.next()
    println("Öğrencinin yaşı:")
    val o1yas = girdi.nextInt()
    println("Öğrencinin sınıfı:")
    val o1sinif = girdi.next()

    println("Öğrencinin ismi:")
    val o2isim = girdi.next()
    println("Öğrencinin yaşı:")
    val o2yas = girdi.nextInt()
    println("Öğrencinin sınıfı:")
    val o2sinif = girdi.next()

    println("Öğrencinin ismi:")
    val o3isim = girdi.next()
    println("Öğrencinin yaşı:")
    val o3yas = girdi.nextInt()
    println("Öğrencinin sınıfı:")
    val o3sinif = girdi.next()

    val ogrenciler = ArrayList<Kayit>()

    val o1 = Kayit(o1isim,o1yas,o1sinif)
    val o2 = Kayit(o2isim,o2yas,o2sinif)
    val o3 = Kayit(o3isim,o3yas,o3sinif)

    ogrenciler.add(o1)
    ogrenciler.add(o2)
    ogrenciler.add(o3)

   for (ogrenci in ogrenciler){
       println("Öğrencinin Adı: ${ogrenci.isim} Öğrencinin yaşı: ${ogrenci.yas} Öğrencinin sınıfı: ${ogrenci.sinif}")
   }















}