fun main(args: Array<String>) {
    // inisialisasi dan deklarasi pada penerapan konversi eksplisit pada char
    var c: Char
    var i: Int
    // konversi dari teks ke nilai
    c = 'a'
    i = c.toInt()
    // untuk menampilakan dari nilai variabel
    println("The character $c was converted to its ASCII value of $i")
    // konversi dari nilai ASCII ke teks
    i = 98
    c = i.toChar()
    println("The ASCII value of $i was converted to its textual value of $c")
}
