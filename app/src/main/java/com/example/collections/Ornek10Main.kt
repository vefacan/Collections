package com.example.collections

import java.util.*

fun main (){

    val girdi = Scanner(System.`in`)
    var cikis:Int
    val ogrenciler = HashSet<Ornek10>()


    while (true){
        println("Öğrenci No:")
        var ogrenciNo= girdi.nextInt()
        println("Öğrenci İsmi:")
        var ogrenciAd=girdi.next()
        println("Öğrenci Sınıf:")
        var ogrenciSinif=girdi.next()
        var ogrenci = Ornek10(ogrenciNo,ogrenciAd,ogrenciSinif)

        ogrenciler.add(ogrenci)

        println("Çıkış yapmak için 1 tuşuna basınız. Devam etmek için rastgele bir tuşa basınız.")
        cikis = girdi.nextInt()
        if (cikis == 1){
            println("Çıkış yapıldı.")
            break
        }
    }

    for (i in ogrenciler){

        println("No: ${i.no}, Adı: ${i.ad}, Sınıfı: ${i.sinif}")
    }





}