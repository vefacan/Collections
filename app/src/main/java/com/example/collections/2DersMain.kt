package com.example.collections

fun main(){

    val u1 = Urun(1,"Saat",75.0)
    val u2 = Urun(2,"Tv",3550.0)
    val u3 = Urun(3,"Bilgisayar",8500.0)

    val urunler = ArrayList<Urun>()

    urunler.add(u1)
    urunler.add(u2)
    urunler.add(u3)

    for (urunfor in urunler){

        println("********")
        println("Ürün No: ${urunfor.urunNo}")
        println("Ürün Adı: ${urunfor.urunAdi}")
        println("Ürün Fiyatı: ${urunfor.urunFiyat}")
    }





}