package com.example.collections

import java.util.*
import kotlin.collections.ArrayList

fun main (){

    val girdi = Scanner(System.`in`)
    var sayac = 1
    val ogrenciler = ArrayList<Ogrenci2>()

    while (true){

        println("Öğrenci adı giriniz:")
        val ad = girdi.next()
        println("Öğrenci sınıfı giriniz:")
        val sinif= girdi.next()

        val yeniogrenci = Ogrenci2(sayac,ad,sinif)
        sayac = sayac + 1

        ogrenciler.add(yeniogrenci)

        println("Çıkış için (1) - Devam etmek için diğer sayılar.")
        val cikis = girdi.nextInt()
        if (cikis == 1 ){

            for (ogrenci in ogrenciler){

                println("********")
                println("Adı: ${ogrenci.ad}, No: ${ogrenci.no}, Sınıfı: ${ogrenci.sinif}")
            }
            println("Çıkış yapıldı.")
            break
        }
        }
    }