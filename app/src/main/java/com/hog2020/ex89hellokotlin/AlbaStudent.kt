package com.hog2020.ex89hellokotlin

//name age major 는 상속받았기에 주 생성자 의 파라미터 받을 때 var 키워드 사용 안됨
//constructor 생략가능
class AlbaStudent (name:String, age:Int, major:String,var task:String):Student(name, age, major) {
    init {
        println("create AlbaStudent instance")
    }

    override fun show() {
        //super.show()
        println("name: $name  age: $age   major: $major  task: $task")
    }
}