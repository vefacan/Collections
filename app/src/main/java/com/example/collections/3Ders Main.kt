package com.example.collections

fun main(){

    val kisi1 = Kisiler(1,"Vefa")
    val kisi2 = Kisiler(2,"Hüseyin")
    val kisi3 = Kisiler(3,"Miray")
    val kisi4 = Kisiler(4,"Deniz Ege")

    val kisilist = ArrayList<Kisiler>()

    kisilist.add(kisi1)
    kisilist.add(kisi2)
    kisilist.add(kisi3)
    kisilist.add(kisi4)

    println("Önce...")
    for (kisifor in kisilist){
        println( "${kisifor.kisiNo} - ${kisifor.kisiAdi}")
    }

    println("Sayısal büyükten küçüğe")
    val siralamaArrayList2 = kisilist.sortedWith(compareByDescending {it.kisiNo})
    for (kisifor in siralamaArrayList2){
        println( "${kisifor.kisiNo} - ${kisifor.kisiAdi}")
    }

    println("Sayısal küçükten büyüğe:")
    val siralamaArrayList1 = kisilist.sortedWith(compareBy{it.kisiNo})
    for (kisifor in siralamaArrayList1){
        println( "${kisifor.kisiNo} - ${kisifor.kisiAdi}")
    }

    println("Harfe göre sıralama büyükten küçüğe")
    val siralamaArrayList3 = kisilist.sortedWith(compareBy{it.kisiAdi})
    for (kisifor in siralamaArrayList3){
        println( "${kisifor.kisiNo} - ${kisifor.kisiAdi}")
    }

    println("Harfe göre sıralama küçükten büyüğe")
    val siralamaArrayList4 = kisilist.sortedWith(compareByDescending{it.kisiAdi})
    for (kisifor in siralamaArrayList4){
        println( "${kisifor.kisiNo} - ${kisifor.kisiAdi}")
    }



}