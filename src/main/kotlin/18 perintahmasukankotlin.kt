fun main(args: Array<String>) {
   // deklrasi program masukan dikotlin
    println("Hi I'm Lora, the virtual parrot, and i love to repeat!");
    println("Type something in: ");
    var input: String
    input = readLine()!!
    var output: String
    output = input + ", " + input + "!"
    println(output)

    //untuk merubah nilai string gunakan konversi secara eksplisit
    println("Enter a number and I'll double it: ")
    val inputt = readLine()!!
    var a = inputt.toInt()
    a = a * 2
    println(a)
    println("Enter a number, and I'll square it:")
    val number = readLine()!!.toInt()
    val square = number * number
    println("Result: " + square)
}
