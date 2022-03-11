fun main(args: Array<String>) {
    /* deklarasi dan inisialisasi dari tipe data  Byte,Short,Int,dan long untuk bilangan bulat
    Double atau float untuk bilangan desimal atau real, Char untuk karakter, Boolean untuk true/false,

    */
    val minByte: Byte = -128
    val maxByte: Byte = 127
    val minShort: Short = -32768
    val maxShort: Short = 32767
    val minInt: Int = -2147483648
    val maxInt: Int = 2147483647
    val minLong: Long = -9223372036854775807
    val maxLong: Long = 9223372036854775807

    println("minByte:" + minByte)
    println("maxByte:" + maxByte)
    println("minShort:" + minShort)
    println("maxShort:" + maxShort)
    println("minInt:" + minInt)
    println("maxInt:" + maxInt)
    println("minLong:" + minLong)
    println("maxLong:" + maxLong)


    // kode program menggunakan tipe data bilangan decimal
    val maxFloat: Float = 9.123456789f
    val maxDouble: Double = 9.123456789

    println("maxFloat: " + maxFloat)
    println("maxDouble: " + maxDouble)

}
