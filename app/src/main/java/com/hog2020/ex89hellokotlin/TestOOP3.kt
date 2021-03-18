package com.hog2020.ex89hellokotlin

fun main(){
    //안드로이드에서 많이 사용되는
    //이너클래스 &인터페이스 & 익명클래스

    //1.이너클래스
    //AAA.BBB() //ERROR 이너클래스는 아웃터클래스 만이 객체생성 가능

    val obj = AAA()
    val obj2= obj.getBBBInstance()
    obj2.show()
    println()

    //2.인터페이스
    //val c:Clickable()// 인터페이스는 곧바로 new 불가
    //Clickable 을구현한 Test 클래스 객체생성
    val t= Test()
    t.onClick()

    //3. 익명클래스[자바와 문법이 완전다름: object 키워드 사용]
    val a= object:Clickable{//()없음

        override fun onClick() {
            println("Anonymous class onclick!!")
            println()
        }

    }
    a.onClick()

    //4. Java 와 다르게 static 키워드가 없음
    // 동반객체 [ companion object - java 의 static
    //println(Sample.a)//error: 일반 멤버는 객체생성없이 사용불가
    println(Sample.title)
    Sample.show()
}

//4. companion object
class Sample{
    var a:Int =10

    companion object{
        //이 영역안에 있는것들은 Sample 객체 없이 사용 가능함
        var title:String = "Nice"
        fun show(){
            println("companion object show")
        }
    }
}

//2. 인터페이스
interface  Clickable{
    //추상메소드
    fun onClick()
}

//Clickable interface 구현한 클래스
class Test : Clickable{
    override fun onClick() {
        println("Clicked")
        println()
    }

}

//1.이너클래스 -클래스안에 클래스 설계
class AAA{
    var a:Int=10
    fun show(){
        println("AAA클래스의 show $a")
        println()
    }
    fun getBBBInstance():BBB{
        return BBB()
    }

    //inner  class - 코틀린에서는 반드시 inner 키워드가 있어야 inner 클래스가 됨
    //명시가 없으면 그냥 AAA클래스 안에 숨어있는 BBB 클래스 정도의 느낌
    inner class BBB{
        fun show(){
            //이너클래스 안에서는 아우터클래스(AAA) 의 멤버를 내것인양
            println("아우터클래스 AAA 의 프로퍼티 a: $a")

            //아우터의 this 사용문법
            this@AAA.show()

        }
    }
}