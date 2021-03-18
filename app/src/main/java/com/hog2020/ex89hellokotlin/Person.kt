package com.hog2020.ex89hellokotlin

//주 생성자에게 var 키워드로 property 를 직접 생성
open class Person constructor(var name:String ,var age:Int){
    init {
        println("create Person instance")
    }

    open fun show(){
        println("name: $name  age : $age")
    }
}