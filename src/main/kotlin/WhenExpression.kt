fun main(){
    val value = 70
    val ranges = 10..500

    when(value){
        in ranges -> println("value ada di range")
        !in ranges -> println("value mu diluar range")
        else -> println("value mu ilang")
    }
}