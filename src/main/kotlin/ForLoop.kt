fun main(){
    val ranges = 1.rangeTo(13) step 2
    ranges.forEachIndexed { index, value -> println("Duit kamu cuma $value dan punya utang $index") }
}