package oop_139507_Damian.week04

open class Pakaian {
    protected var merk:String = "";
    protected var harga:Int = 0;
    init {
        this.merk = "Uniqlo";
        println("merk is $merk");
    }
    public fun jumlah_penjualan(){
        println("Pakaian terjual");
    }
}