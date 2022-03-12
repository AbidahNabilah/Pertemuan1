fun main(args: Array<String>) {
    // deklrasi dan inisialsisasi konversi eksplisit
    val valInt: Int =1
    val valSum: Long = 3L + valInt // konversi implisit
    println("Konversi Variabel valInt secara Implisit :" + valSum)
    val valLong: Long = valInt.toLong()// konversi ekplisit
    println("konversi variabel valInt secara eksplisit: " + valLong)
}