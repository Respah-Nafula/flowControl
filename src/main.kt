fun main(){
    oddNumbers()
    println(Names(arrayOf("Becky","Euny","Esther","Joy","Anastacia")))
    Robots(4)
    Robots(13)
    Robots(25)
    numbers()



}
fun oddNumbers() {
    for (num in 1..100){
        if (num%2!=0)
            println(num)
    }
}
fun Names(identity:Array<String>):Int{
    var identification=0
    identity.forEach { identify->
        if (identify.length>5)
        identification++

        }
         return identification
        }
fun Robots(guestsAge:Int){
    if (guestsAge<6){
        println("Serve a glass of Milk")
}
else if (guestsAge>6 && guestsAge<15){
    println("Serve a bottle of Fanta orange")
}
else{
    println("Serve a bottle of coca cola")
      }
      }
fun numbers(){
for(nums in 1..100) {
    if (nums % 3 == 0 && nums % 5 == 0)
        println("FizzBuzz")
    else if (nums % 3 == 0) {
        println("Fizz")
    } else if (nums % 5 == 0) {
        println("Buzz")
    } else {
        println(nums)
    }
}


}

