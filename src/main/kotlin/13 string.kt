fun main(args: Array<String>) {
    // inisialisasi dan deklarasi menggunakan string
    val myName: String = "Abidah Nabilah"
    for(chr in myName){
        print(chr)
    }
    print('\n')
    // menggabunagkan string dengan tipe data lain dengan menggunakan operator +
    val s = "abc" + 1
    println(s + "def")

    // menggunakan raw string --> (""") untuk menyimpan data string yang memuat keyword di kotlin
    var text = """
        for (c in "foo")
        print(c)
    """
    println(text)

    // menghapus spasi yang tidak diperluakn di raw string
    var texxt = """
        |Tell me and I forget.
        |Teach me and I remember.
        |Involve me and I learn.
        |(Wang Yibo)
    """.trimMargin()
    println(texxt)

    //deklarsi dan inisialisai menggunakan string teplates
    val a = 7
    val b = 8
    val c = a + b
    val d = "When we add $a and $b, we get $c"
    println(d)
    println("When we add $a and $b, we get ${a + b}")
    val price = """
    ${'$'}9.99
    """
    println(price)


}