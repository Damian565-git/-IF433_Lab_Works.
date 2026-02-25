package oop_139507_Damian.week04

class Baju:Pakaian() {
    private var stock:Int = 10;
    public fun update_stock(terjual: Int) {
        super.harga = stock * 100;
        println("Stock $stock baju Terupdate, " +
                "harga ${super.harga}");
    }
}