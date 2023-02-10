fun main() {
    val r = "residential"
    val b = "business"
    println("Are you a Residential or Business Customer? ")
    var customer = readLine()!!.lowercase()
    if (customer == r){
        println("Enter your name: ")
        var n = readLine().toString()
        println("Enter your phone number: ")
        var p = readLine().toString()
        userInfo(n, p)
    }else if (customer == b){
        println("Enter your Business name: ")
        var b = readLine().toString()
        println("Enter your name: ")
        var n = readLine().toString()
        println("Enter your phone number: ")
        var p = readLine().toString()
        userInfo(b, n, p)
    }
}

fun userInfo(b: String, n: String, p: String): String {
    var b = println("The business name you entered is $b. ")
    var n = println("The name you entered is $n. ")
    var p = println("The phone number you entered is $p. ")
    return println("$b" + "$n" + "$p").toString()
}

fun userInfo(n: String, p: String): String{
    var n = println("The name you entered is $n. ")
    var p = println("The phone number you entered is $p. ")
    return println("$n" + "$p").toString()
}