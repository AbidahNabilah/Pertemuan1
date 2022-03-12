fun main(args: Array<String>) {
    // menampilkan teks
    println("Welcome to calculator")
    println("Enter the firt number:")
    val a = readLine()!!.toDouble()
    println("Enter the second number:")
    // deklrasi dan inisialiasi prgram
    val b = readLine()!!.toDouble()
    val sum = a + b
    val difference = a - b
    val product = a * b
    val quotient = a / b
    // untuk menampilkan hasil dari variabel
    println("Sum: ${sum}")
    println("Difference: ${difference}")
    println("Product: ${product}")
    println("Quotient: ${quotient}")
    println("Thank you for using calculator.")

}