package oop_139507_Damian.week04


class Celana:Pakaian() {
    private var stock:Int = 20;
    public fun update_stock() {
        super.harga = stock * 120;
        println("Stock $stock celana Terupdate, " +
                "harga ${super.harga}");
    }
}