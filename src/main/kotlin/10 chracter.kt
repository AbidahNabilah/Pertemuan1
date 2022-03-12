fun main() {
    // deklarasi dan inisialisasi menggunakan char
    val charA : Char = 'A'
    // untuk menampilkan variabel,  maka char di kotlin sebagai objek yang memiliki fungsi sebagai anggota
    println(charA.isUpperCase())
    println(charA.isLowerCase())
    println(charA.isDigit())
    println(charA.toLowerCase())
    val strA: String = charA.toString()
    println("Kini charA sudah menjadi String = "+strA)
}