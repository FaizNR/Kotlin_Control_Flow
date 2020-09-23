fun main(){
    val rangeInt = 1.rangeTo(10) step 5
    rangeInt.forEach { print("$it ") }
    println(rangeInt.step)
}