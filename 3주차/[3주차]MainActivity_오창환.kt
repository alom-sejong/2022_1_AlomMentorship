package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // xml에서 버튼을 찾아 변수에 등록 (덧셈, 뺄셈, 곱셈, 나눗셈)
        val btnAdd = findViewById<Button>(R.id.btn_add);
        val btnSub = findViewById<Button>(R.id.btn_sub);
        val btnMul = findViewById<Button>(R.id.btn_mul);
        val btnDiv = findViewById<Button>(R.id.btn_div);

        // xml에서 edittext 찾아서 변수에 등록 (연산을 위한 숫자 입력란 2개)
        val editText1 = findViewById<EditText>(R.id.editText1);
        val editText2 = findViewById<EditText>(R.id.editText2);

        // xml에서 textView 찾아서 변수에 등록 (연산 결과창)
        val textView = findViewById<TextView>(R.id.textView);

        fun getNumberA(): Double{
            return editText1.text.toString().toDouble();
        }
        fun getNumberB(): Double{
            return editText2.text.toString().toDouble();
        }

        // 각 4개의 버튼 이벤트 등록, 과제 1 실수 연산 및 오류처리.
        btnAdd.setOnClickListener() {
            // 덧셈 로직
            textView.text = (getNumberA() + getNumberB()).toString();
        }
        btnSub.setOnClickListener() {
            // 뺄셈 로직
            textView.text = (getNumberA() - getNumberB()).toString();
        }
        btnMul.setOnClickListener() {
            // 곱셈 로직
            textView.text = (getNumberA() * getNumberB()).toString();
        }
        btnDiv.setOnClickListener() {
            // 나눗셈 로직
            if(getNumberA().toInt() == 0)
                textView.text = ("분자에 0이 있습니다.")
            else
                textView.text = (getNumberA() / getNumberB()).toString();
        }

    }




}