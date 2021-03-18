package com.hog2020.ex89hellokotlin

//보조 생성자 를 사용하여 상속하여 상속할떄는 부모클래스명 옆에 ()를 붙이지 않음
class Teacher: Person {

    //Teacher 클래스안의 property(멤버변수): 보조생성자는 직접 property 를 만들 수 없음
    var subject:String?=null

    //보조 생성자-여기서 부모클래스의 생성자르 호출해주어야 함
    constructor(name:String, age:Int,subject:String):super(name, age){
        this.subject=subject
        println("create Teacher instance")

    }

    override fun show() {
        //super.show()
        println("name : $name  age: $age, subject: $subject")
    }
}