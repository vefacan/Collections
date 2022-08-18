package com.example.collections

fun main (){

    val isimler = ArrayList<Ogrenciler>()
    val i1 = Ogrenciler("Vefa Can Beytorun",25,"A şubesi")
    val i2 = Ogrenciler("Burcu Karakuş",25,"A Şubesi")
    val i3 = Ogrenciler("Hüseyin Özkoç",25,"A Şubesi")
    val i4 = Ogrenciler("Miray Güleryüz",25,"G Şubesi")
    val i5 = Ogrenciler("Deniz Ege Şahin",25,"D Şubesi")
    val i6 = Ogrenciler("Mars Can Beytorun",1,"M Şubesi")

    isimler.add(i1)
    isimler.add(i2)
    isimler.add(i3)
    isimler.add(i4)
    isimler.add(i5)
    isimler.add(i6)

    for (ogrenci in isimler){
        println("${ogrenci.isim} - Yaşı : ${ogrenci.yas} , Sınıfı: ${ogrenci.sinifi}")
    }

    println("İsminde Beytorun olanlar")
    val filtre = isimler.filter {it.isim.contains("Beytorun") }

    for (ogrenci in filtre){
        println("İsim: ${ogrenci.isim}")
    }
}