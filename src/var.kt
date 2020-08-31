fun main(){
    val myByte: Byte = 0
    val myShort: Short = 100
    val myInt: Int = 10
    val myLong = 40L
    val myFloat: Float = 3.14F
    val myDouble: Double = 45.2356765


    var myBoolean: Boolean = true
    myBoolean = false

    val myChar = 'x'

//    var myString1: String = "This is a string."
//    var myString2 = "THis string has a new line\n"
//    var multiLines = """
//        this is line 1
//        this is line 2
//        this is line 3
//    """.trimIndent()
//
//    val acctBalance = 200
//    val mybal = "my balance is $acctBalance"

//    var x = 0
//    val type = listOf("byte", "short", "int", "long", "float", "double", "boolean", "char")
//    val values = listOf(myByte, myShort, myInt, myLong, myFloat, myDouble, myBoolean, myChar)
//    for (a in type)
//        println(a + " demo: " + values[x])
//        x += 1
//    println(x)
    val answer = """
        byte demo: $myByte
        short demo: $myShort
        int demo: $myInt
        long demo: $myLong
        float demo: $myFloat
        double demo: $myDouble
        boolean demo: $myBoolean
        char demo: $myChar
    """.trimIndent()
    println(answer)
}