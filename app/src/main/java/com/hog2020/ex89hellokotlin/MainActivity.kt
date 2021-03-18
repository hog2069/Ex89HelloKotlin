package com.hog2020.ex89hellokotlin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun clickBtn(view: View) {
        //Xml 에 있는 뷰들을 find 하지않고 xml에서 설정한 id 를 변수명으로 바로 사용
        //단, 'kotlin-android-extenstions' 을 plugin  하
        //import kotlinx.android.synthetic.main.activity_main.* 해야함
        tv.setText("Nice meet you")


        //코틀린은 setxxx()메소드를 권장하지 않고 그 객체의 멤버변수에 값 대입을 선호함
        tv.text="holy moly"
    }

    //Override 메소드 가 Java에서는 @Override 어노테이션 을 사용했지만
    //코틀린에서는 메소드 앞에 override 키워드 삽입
    override fun onResume() {
        super.onResume()

        Toast.makeText(this,"onresume",Toast.LENGTH_SHORT)
    }

}