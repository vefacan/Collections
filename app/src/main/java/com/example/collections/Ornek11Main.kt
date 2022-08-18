package com.example.collections

fun main (){

    val o1 = Ornek11(1,"Vefa","8/A")
    val o2 = Ornek11(2,"Hüseyin","8/A")
    val o3 = Ornek11(3,"Burcu","8/A")

    val ogrenciler = HashMap<Int,Ornek11>()

    ogrenciler.put(o1.no,o1)
    ogrenciler.put(o2.no,o2)
    ogrenciler.put(o3.no,o3)

    for ((ogrenciNo,nesne) in ogrenciler){

        println("********")
        println("Öğrenco No:$ogrenciNo")
        println("Öğrenci Adı: ${nesne.ad}")
        println("Öğrenci Sınıfı: ${nesne.sinif}")
    }
}