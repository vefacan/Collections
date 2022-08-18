package com.example.collections

class Ornek10(var no: Int, var ad: String, var sinif: String) {

    override fun hashCode(): Int {
        return this.no
    }

    override fun equals(other: Any?): Boolean {
        if (this.no ==(other as Ornek10).no)
            return true
        else{
            return false
    }

    }
}