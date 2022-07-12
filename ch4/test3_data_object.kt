package com.kbstar.androidtestlab.ch3.test1_package.test3

data class User(val no: Int, val name: String)

open class Super {
    open fun some(){}
}
class Outer {
    var data1 = 10

    val obj = object : Super() {
        override fun some() {
        }
    }

    companion object {
        var data2 = 20
        fun sayHello() {}
    }
}
fun main() {
    val user1 = User(10, "kim")
    val user2 = User(10, "kim")

    println("${user1.equals(user2)}")
    println(user1.toString())

//    Outer.data1++//error
    Outer().data1++//ok
    Outer.data2++//ok
    Outer.sayHello()//ok
    //companion object..  java  의 static 효과..
    //클래스명으로..
//    Outer().data2++;//error...  객체로는 접근이 안된다..
}