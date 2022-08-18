package com.example.collections

open class Adres(var sehir:String, var ilce:String) {
}

class Personel(sehir:String, ilce:String, var isim:String,var yas:Int ):Adres(sehir,ilce){
}