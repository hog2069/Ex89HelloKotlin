package com.hog2020.ex89hellokotlin

//코틀린 언어 기초문법 [코틀린 연습 사이트 : http://try.kotlinlang.org]

//문법적 주요 특징
//1. 문장의 끝을 나타내는 ; 사용하지 않음, 단 사용해도 에러는 아니지만 무시됨
//2. 변수를 만들때 자료형을 사용하지 않고 var 키워드 사용함. 단 자료형은 존재함.자동 형변환이 안됨. 즉 정적타입 언어임
//3. 코틀린은 함수형 언어임. 즉, 함수를 객체처럼 변수에 저장하고 파라미터로 넘겨주는 등의 작업 가능함.[객체 지향 언어가 아님(Java)]

//1. 프로그램의 시작함수인 main() 함수가 반드시 있어야 함.
//2. 함수를 정의할 때 리턴타입위치에 'fun' 키워드(function 의 약자) 사용
fun main(){

    //3. 화면 출력 print(), println()
    println("Hello world")
    println(10)
    println(10.5)
    println('A')
    println(true)
    println(5+3)

    // ; 이 없으므로 한줄에 2개의 코드를 작성할 수 없음
    //println(10) println(20) error

    //4. 자료형과 변수
    //4.1 기본자료형: Boolean, Char, Byte, Short, Int, Long, Float, Double, String, Any(Java 의 Object 와 비슷)[기본적으로 코틀린은 모든 변수가 객체임 즉 모두 참조변수임]
    //             -Boolean, String, Any, Char 은 숫자타입[Number Type]이  아님

    //4.2 변수선언 문법 [var 키워드]
    //var a // Error: ;이 없기 때문에 변수를 만들때 반드시 초기화가 있어야함
    var a =10
    var b= 3.14
    var c= 5.24f
    var d= true
    var e= 'A'
    var f="Hello"
    //주의 변수선언시에 자료형 표기가 없지만 값을 대입할 때 자료형이 결정됨(자동 추정). 즉 변수는 자료형이 있음

    //변수이므로 변수가 가진 값을 변경 가능함
    a=30
    b=33.14
    println(a)
    println(b)

    //변수는 자료형이 정해져 있으므로 다른 자료형을 대입할 수 없음
    //a=3.14 //error [Int 변수에 Double 대입] 자동변환 안됨

    //명시적으로 형변환하는 방법 [ .toxxx() 로 변환]
    //a=(Int)3.14 //()로 하는 형변환 문법이 없음
    a=3.14.toInt()
    b=50.toDouble()

    println(a)
    println(b)

    //var 키워드만 사용하고 자료형을 표기하지 않는 것이 가능하다 보니
    //실제 사용할때 실수의 여지가 가급적 변수를 만들 때 자료형을 표기하는 것을 권장
    var a2: Int =10
    var b2: Double=3.14
    var c2: Boolean // 자료형을 표기하면 초기화를 안해도 됨
    println(a2)
    println(b2)
    //println(c2)// error - 변수에 초기화값이 없는 상태로 사용하면 에러

    //정수값 표기의 특이한 점
    var a3= 5_000_000 // [실생활에서 3자리 마다, 구분하듯이 사용]
    println(a3)

    // ** 화면 출력의 format 만들기
    println("Hello"+"Kotlin")

    //Int 와 String +결합연산자를 사용했을때
    //Java 에서는 int 형을 자동으로 "10" String 으로 변환하여 결합해줌
    //Kotlin 은 자동 형변환 이 안됨
    println(10.toString()+"입니다")

    //또 특이점은 순서를 바꾸면 자동형변환 해줌, 즉 , 기본형보다 문자열이 먼저 있다면
    println("출력 : "+ 10)
    println()

    //즉 , 변수 2개를 출력해주는 코드
    var number= 50
    var number2= 30
    //println(number+"+"+number2+"="+(number+number2))//error : 숫자가 먼저 있으면 자동형변환 x
    //println(""+number+"+"+number2+"="+(number+number2))//앞에 문자열을 먼저 결합
    //println(number.toString()+"+"+number2.toString()+"="+(number+number2).toString())

    //위 두가지 방법의 해결책 모두 코드가 지저분하다 가독성이 떨어진다
    //마치 php 에서 "출력 : @aa" --> ""안에 $ 키워드로 변수명을 구분하는 방식을 사용할 수 있음
    println("$number + $number2 = ${number+number2}")
    //이렇게 $ 변수명 을 사용하는 것은 [문자열 템플릿] 이라고 부름
    var s ="$number 입니다"
    println(s)

    //종합하여
    var name ="sam"
    var age =20
    println("name: $name \n age: $age")
    println()

    //Any 타입 [타입이 없다는 표현식]
    //어떤 자료형의 데이터도 넣을 수 있다보니 초보자들이 선호하지만
    //코드가 방대하고 복잡해지면 타입을 특정하기 어려워서 오히려 힘듬
    var v: Any
    v= 10
    println(v)

    v=3.14
    println(v)

    v="Hello"
    println(v)

    //변수에 값을 대입할때 특이점
    //null 값에대한 체크
    var n =null
    println(n)

    //자료형을 명시하면 기본적으로 null 저장 할 수 없음
    //var n2:Int=null //error [null 값을 저장할 수 없음]
    //var s2:String=null//error [null 값을 저장할 수 없음]

    // null 값을 가질 수 있는 변수라고 표시할 수 있음[Nullable 변수]
    var n3:Int?=null
    var s3:String?=null

    println(n3)
    println(s3)
    println()

    //4.3 상수[val 키워드]
    val m = 10
    //값 변경하면 에러
    //m=20//error

    //자료형을 명시하면 다음줄에서 값을 대입할 수 있음
    val u:Int
    u=50
    //u=30//error


    //4.연산자 특이점
    // 숫자타입들 간의 산술연산은 자동 형변환이 수행됨[작은것->큰것]
    println(10+3.14)

    //숫자타입이 아닌 자료형과는 자동 형변환이 안됨
    //println(10+true)
    //println(10+'A')
    println()

    //자료형을 체크해주는 연산자 is
    var n4=10
    if (n4 is Int){
        println("n4 변수는 Int 타입 입니다")
    }

    var s4: String = "Hello"
    if (s4 is String) println("s4는 String 타입입니다")
    //String? 와 String은 같은 타입
    if (s4 is String?) println("s5는 String 타입입니다")

    //!is 연산자
    if (s4 !is String) println("s4는 String 이 아닙니다")

    //다른 자료형은 is 연산자로 체크하면 문법적 에러
    //if (n4 is String) //error

    //이 is 는 Any 타입을 검증할 때 많이 사용함
    var obj: Any

    obj=10
    obj=3.14
    if (obj is Int) println("$obj 는 Int 입니다")
    if (obj is Double) println("$obj 는 Double 입니다")

    //is 는 java 의 instanceof 연산자와 같은 기능으로 사용
    class Person{
        //코틀린은 멤버변수를 속성 (property)이라고 명명함
        //주의 [property] 는 반드시 초기화 되어 있어야함
        var name:String="sam"
        var age: Int =20
    }

    //Person p= new Person()
    //코틀린 new 키워드 없음
    var p =Person()
    if(p is Person){
        println(p.name+":"+p.age)
        println("이름: ${p.name} 나이: ${p.age}")
    }

    //5. 제어문 에서 특이점
    //5.1 삼항연산자 없음 , 대신 if문을 삼항연산자 처럼 사용가능
    //String str =(10>5)? "Hello":"Nice"// ERROR
    //var str (10>5)? "Hello": "Nice" //ERROR

    //if 문의 결과를 대입 할 수 있음 그래서 코틀린에서는 if 문을 제어문이라
    //부르지 않고 if 표현식 이라고 부름
    var str=if (10>5)"Hello" else "Nice"

    //혹시 if 나 else 문의 실행문이 여러줄이면 마지막 실행문이 변수에 대입됨
    var str2=if (10<5){
        "Hello"
        "Good"
    }else{
        "Nice"
        println("gggg")// 값이 아니라 실행문을 쓰면 그냥 실행됨
        "Bad"
        println("bbbb")//이 println의 리턴값이 Unit 이라는
    }
    println(str2)
    println()

    //5.2 Swich 문법이 없어짐 when 문법이 이를 대처함
    var h:Any? =null
    var n5 =10
    h=10
    when(h){
        10->println("aaa")
        20-> println("bbb")
        //자료형이 달라도 상관없음
        "Hello"-> println("Hello")
        true -> println(true)

        //변수의 값으로도 됨
        n5 -> println("n5 와 같음")

        //2개이상의 조건을 묶을 수도 있음
        30,40-> println("30 or 40")

        //swich 의 default 처럼 : 위 조건값중에 같은것이 없다면
        else->{
            println("adadad")
            println("end")
        }

    }

    //when 을 특정 수식으로 제정하고 싶다면....()을 생략
    h=85
    when{
        h>=90 && h<=100 -> println("A학점")
        h>=80 -> println("B학점")
        h>=70 -> println("C학점")
        h>=60 -> println("D학점")

        else-> println("F학점")
    }

    //when 에 is 키워드도 됨
    when(h){
        is Int -> println("Int 타입")
        is String -> println("String Type")
    }
    println()

    //5.3 for 문을 작성하는 방법은 완전 다름
    for (i in 0..5){ //i변수 앞에 var 키워드 쓰면 에러
        println(i)
    }
    println()

    //마지막 번호 전까지 로 반복하고자 싶다면
    for (a in 0 until 5){ // 0.1.2.3.4
        println(a)
    }
    println()

    //값이 2씩 증가하려면
    for (i in 0..10 step 2){
        println(i)
    }
    println()

    //값이 2씩 감소
    for (i in 10 downTo 0 step 2){
        println(i)
    }
    println()

    //6. 배열  Array
    var arr= arrayOf(10,20,30)
    println(arr[0])
    println(arr[1])
    println(arr[2])
    //println(arr[3]) //Exception 발생

    //특이한 점이 있다면 배열도 갹체이고 객체의 요소값들을 얻어오는 기능메소드가 자동으로 존재함
    println(arr.get(0))//마치 arraylist 처럼 get()메소드가 존재함
    println(arr.get(1))
    println(arr.get(2))
    println()

    //배열의 길이
    println("배열의길이 ${arr.size}")
    println()

    //배열의값 출력 일일이 하면 귀찮음
    for (i in 0 until arr.size){
        println(arr[i])
    }
    println()

    //for each 문처럼
    for (e in arr){ //e 는 index 번호가 아니고 요소값
        println(e)
    }
    println()

    //혹시 for each 문을 index 번호로 가져오고 싶다면
    for (index in arr.indices){
        println(index)
    }
    println()

    //혹시 index 와 value 를 모두 for 로 접근하고 싶다면
    for ((i,v) in arr.withIndex()){
        println("$i : $v")
    }
    println()

    //배열의 특이점
    //자료형을 저장하지 않으면 자동 요소들은 Any 타입이 됨
    // 그러므로 배열요소마다 자료형을 가질 수 있음
    var arr2= arrayOf(10,"Hello",true)
    for (t in arr2){
        println(t)
    }
    println()

    //배열 요소의 타입이 Any 타입이므로 다른 자료형의 값을 가질 수 있음
    arr2[1]=true
    println(arr2.get(1))
    println()

    //단, Type 을 지정하여 배열을 만들 수 있음
    //var arr3= arrayOf<Int>(10,20,30)

    //<Int> 제네릭 표기법이 보기싫다면
    var arri = intArrayOf(10,20,30)

    //배열 참조변수만 먼저 만들고 나중에 배열객체 대입하려면
    //변수 만들때 자료형을 표시
    var arr5:IntArray
    arr5= intArrayOf(1,2,3)

    //배열의 요소값의 시작을 null 값을 가진 배열 만들기[길이:5]
    var arr6= arrayOfNulls<Any>(5)
    for (t in arr6){
        println(t)
    }
    println()

    //개수를 변경할 수 있는 배열 :ArrayList
    val arrList= arrayListOf(10,"Hello",true)
    for (e in arrList){
        println(e)
    }
    println()

    //요소 추가
    arrList.add(3)
    for (e in arrList){
        println(e)
    }
    println()

    //특정위치 축가 가능
    arrList.add(0,"Nice")
    for (e in arrList){
        println(e)
    }
    println()

    //인덱스 번호 지우기
    arrList.removeAt(0)
    for (e in arrList){
        println(e)
    }
    println()

    //요소의 개수
    println("요소의개수 ${arrList.size}")
    arrList.set(0,20) //0번 방의값을 20으로 변경
    println(arrList.get(0))

    //2차원 배열
    val arrays= arrayOf(arrayOf(10,20), arrayOf("aa","bb"), arrayOf(true,false))
    for (ar in arrays){
        for (e in ar){
            print(e)
            print("   ")
        }
        println()


    }

    //7.함수 ////
    //7.1 함수 호출
    show()

    //7.2 파라미터 전달
    output(100,"Hello")


    //7.3 리턴값 받기
    var aaa= sum(5,3)
    println(aaa)
    println()

    //참고로 리턴타입이 없으면 void 가 아니라 Unit 타입임
    var bbb=display()
    println(bbb)
    println()

    //7.4 함수 선언의 단순화, 리턴 키워드를 할당 연산자(=) 바꿀수 있음
    val s2 = getData()
    println(s2)

    val s5 = getData2()
    println(s5)
    println()

    println(getData3(5))
    println()

    println(getData4(15))
    println()

    val len = stringlength("Android")
    println(len)
    println()

    //nnn 이라는 변수가 함수를 가지고 있다
    val len2= nnn("Kotlin")
    println(len2)

    //고차함수 사용- 함수의 인자로 다른익명함수를 전달
    val len3= getlength("aaa",{str -> str.length})
    println(len3)


}//main  함수



//7.1 함수 정의- 리턴타입 위치에 fun 키워드 적용
fun show(){
    println("show!!!")
    println()
}

//7.2 파라미터 전달 받는 함수 - 매개변수 만들떄 var 키워드 쓰면 에러, 자료형 명시
fun output(x:Int,y:String) {
    println(x)
    println(y)
    println()
}

//7.3 리턴하는 함수- 리턴타입을 함수명 앞이 아니라 ()뒤에 : 하고 표시
fun sum(a:Int,b:Int):Int{
    return a+b

}

//참고로 리턴타입이 없으면 void 가 아니라 Unit 타입임
fun display(){
    println("display")
    println()
}

//7.4 함수 선언의 단순화, 리턴 키워드를 할당 연산자(=) 바꿀수 있음
//7.4.1 기본적인 return 함수
fun getData():String {
    return "Hello"
}

//7.4.2 return 키워드를 할당연산자로 바꿔서 함수 정의
fun getData2():String ="Hello"

//7.4.3 좀더 복잡한 함수 코드가 있어도 할당연산자 사용가능
fun getData3(num:Int):String{
    if (num<10)return "Good"
    else return "Bad"
}

fun getData4(num: Int):String = if (num<10) "Good" else "Bad"

//7.5 익명 함수
//7.5.1 기본적인 함수 [String 을 입력받아 글자수를 int 로 리턴해주는 기능 함수]
fun stringlength(str:String): Int{
    return str.length
}

//7.5.2 익명함수 [함수를 nnn 이라는 변수에 넣는 느낌의 코드, (String)->Int 는 이함수는 String 을  받아서 Int 를리턴 하는 함수]
val nnn : (String)->Int = {
    str -> str.length
}
//이 익명 함수는 '고차함수' 라는 곳에서 일반적으로 사용함
//'고차함수' : 함수의 파라미터로 다른 함수를 사용하는 것을 고차함수  라고 부름
//두번째 파라미터 mmm 은 익명함수를 인자로 받겠다고 표시
fun getlength(str:String, mmm: (String)->Int):Int{
    return mmm(str)

}