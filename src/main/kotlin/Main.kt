fun main() {
println(introduction("Maureen", "travelling"))
    println(modulus(8,19))
    println(addNumbers(30,23,45.5,3))
    println(findIndex("AkiraChix"))
}





//Concatenation usin the $ sign
fun introduction(name:String, word:String):String{
    var sentence = "Hello, my name is $name and I like $word"
    return sentence
}
fun modulus(num1:Int, num2:Int):Int{
    var result=num1 % num2
    return result
}
//addding numbers
fun addNumbers(numb1:Int, numb2:Int, numb3:Double, numb4:Int):Double{
    var addition = numb1 + numb2 +numb3+numb4
    return addition
}
fun findIndex(school:String):String{
  return school[0]+""+school[1]+""+school[3]
}
