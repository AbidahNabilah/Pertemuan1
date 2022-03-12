fun main(args: Array<String>) {
    // deklrasi dan inisialisasi variabel
    val s = ".. -.-. - ... --- -.-. .. .- .-.."
    println("The original message: $s")

    // string
    var message = ""

    // mendefinisikan array
    val alphabetChars = "abcdefghijklmnopqrstuvwxyz"
    val morseChars = arrayOf(".-", "-...", "-.-.", "-..", ".", "..-.", "--.", "....", "..", ".---", "-.-",
        ".-..", "--", "-.", "---", ".--.", "--.-", ".-.", "...", "-", "..-", "...-", ".--", "-..-", "-.--", "--..")
    val characters = s.split(" ")
    for (morseChar in characters) {
        val index = morseChars.indexOf(morseChar)
        // karakter ditemukan
        if (index != -1) {
            message += alphabetChars[index]
        }
        println("The decoded message: $message")

    }



}
