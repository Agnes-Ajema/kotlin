import kotlin.math.expm1

fun main(){
    myFunction("Hello", "Agnes")
     remainder(15, 2)
    add(3,6,7,4)
    myText('I', "am", "smart")
}
fun myFunction(greeting: String, name: String){
    var greeting = ("Hello")
    var name = ("Agnes")
    var result = ("Hello" + " " +"Agnes")
    println(result)
}
fun remainder(num1: Int, num2: Int){
   var num1 = 15
    var num2 = 2
    var answer = num1 % num2
    println(answer)
}
fun add(num1: Int, num2: Int, num3: Int, num4: Int){
    var num1 = 3
    var num2 = 6
    var num3 = 7
    var num4 = 4
    var answer = num1 + num2 + num3 + num4
    println(answer)
}
fun myText(text1: Char, text2: String, text3: String){
    var text1 = 'I'
    var text2 = "am"
    var text3 = "smart"
    var mytext = text1+" "+ text2+" "+ text3
    println(mytext)

}