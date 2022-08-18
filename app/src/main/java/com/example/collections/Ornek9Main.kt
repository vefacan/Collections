package com.example.collections

import java.util.*
import kotlin.collections.ArrayList

fun main (){

    val girdi=Scanner(System.`in`)
    var cikis:Int
    val personellistesi = ArrayList<Personel>()

    while (true){

        println("Personelin ismini giriniz:")
        var personelismi =girdi.next()
        println("Personel yaşını giriniz:")
        var personelyasi =girdi.nextInt()
        println("Personelin yaşadığı şehiri yazınız:")
        var personelsehir = girdi.next()
        println("Personelin yaşadığı ilçeyi yazınız:")
        var personelilce = girdi.next()

        var personel = Personel(personelsehir,personelilce,personelismi,personelyasi)
        personellistesi.add(personel)

        println("Çıkmak için (1) tuşuna basınız. Devam etmek istiyorsanız başka tuşa basın.")
        cikis =girdi.nextInt()
        if (cikis == 1){
            println("Çıkış yapıldı.")
            break
        }
    }
    for (i in personellistesi){
        println("******")
        println("İsim: ${i.isim}, Yaş: ${i.yas}, Şehir: ${i.sehir}, İlçe: ${i.ilce}")
    }
}