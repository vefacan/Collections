package com.example.collections

fun main(){

    val o1 = Ogrenci(1,"Vefa Can Beytorun","12/F")
    val o2 = Ogrenci(2,"Hüseyin Özkoç","12/G")
    val o3 = Ogrenci(3,"Miray Güleryüz","12/G")
    val o4 = Ogrenci(4,"Deniz Ege Şahin","12/D")
    val o5 = Ogrenci(5,"Mars Can Beytorun","1/M")

    val ogrenciler = ArrayList<Ogrenci>()

    ogrenciler.add(o1)
    ogrenciler.add(o2)
    ogrenciler.add(o3)
    ogrenciler.add(o4)
    ogrenciler.add(o5)


    for (ogrenci in ogrenciler){
        println("${ogrenci.no} - ${ogrenci.ad} Sınıfı: ${ogrenci.sinif}")
    }

    println("Numarası 2 den büyük:")

    val sonucListe = ogrenciler.filter {it.no > 2}

    for (ogrenci in sonucListe){
        println("${ogrenci.no} - ${ogrenci.ad} Sınıfı: ${ogrenci.sinif}")
    }

    println("Numarası 5 e eşit:")

    val sonucListe2 = ogrenciler.filter {it.no == 5}

    for (ogrenci in sonucListe2){
        println("${ogrenci.no} - ${ogrenci.ad} Sınıfı: ${ogrenci.sinif}")
    }

    println("Adı Vefa Can Beytorun olanlar:")
    val sonucListe3 = ogrenciler.filter {it.ad == "Vefa Can Beytorun"}

    for (ogrenci in sonucListe3){
        println("${ogrenci.no} - ${ogrenci.ad} Sınıfı: ${ogrenci.sinif}")
    }

    println("Adında a harfi olanlar:")
    val sonucListe4 = ogrenciler.filter {it.ad.contains("a")}

    for (ogrenci in sonucListe4){
        println("${ogrenci.no} - ${ogrenci.ad} Sınıfı: ${ogrenci.sinif}")
    }
}