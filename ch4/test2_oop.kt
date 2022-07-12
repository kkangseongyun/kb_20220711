package com.kbstar.androidtestlab.ch3.test1_package

import java.util.*

open class Super(no: Int){
    constructor(no: Int, name: String): this(no){
        println("Super... constructor")
    }
    init {
        println("Super..... init")
    }
}
class Sub(no: Int): Super(no, "kkang") {
    constructor(no: Int, name: String): this(no){
        println("Sub... constructor")
    }
    init {
        println("Sub... init")
    }
}
fun main() {
    val obj = Sub(10, "kim")
}