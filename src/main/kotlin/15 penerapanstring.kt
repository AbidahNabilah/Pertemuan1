fun main(args: Array<String>) {
    // deklarasi dan inisialisasi variabel untuk mencari konsonan, huruf vocal, dan karakter lainnya
    var s = "A programmer gets stuck in the shower because the instructions on the shampoo were: alther, " +
            "wash and repeat."

    var vowelCount = 0
    var consonantCount = 0

    // mendefinisakan karater group
    val vowels = "aeiouy"
    val consonants = "bcdfghjklmnpqrstvwxz"

    for (c in s) {
        if (vowels.contains(c)) {
            vowelCount++
        } else if (consonants.contains(c)) {
            consonantCount++
        }
    }
    println("Vowels: $vowelCount")
    println("Consonants: $consonantCount")
    println("Other characters: ${s.length - (vowelCount + consonantCount)}")


}