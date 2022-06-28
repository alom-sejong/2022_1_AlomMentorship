package com.example.myapplication;

import static java.lang.Double.parseDouble;
import static java.lang.Integer.parseInt;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity{
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // xml에서 버튼 찾기
        Button btnAdd = findViewById(R.id.btn_add);
        Button btnSub = findViewById(R.id.btn_sub);
        Button btnMul = findViewById(R.id.btn_mul);
        Button btnDiv = findViewById(R.id.btn_div);


        // xml에서 edittext 찾아서 변수에 등록
        EditText editText1 = findViewById(R.id.editText1);
        EditText editText2 = findViewById(R.id.editText2);

        // xml에서 textview 찾아서 변수에 등록
        TextView textView = findViewById(R.id.textView);

        View.OnClickListener click = new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                double input1 = parseDouble(editText1.getText().toString());
                double input2 = parseDouble(editText2.getText().toString());
                double result;
                switch (v.getId()) {
                    case R.id.btn_add:
                        result = input1 + input2;
                        textView.setText(Double.toString(result));
                        break;
                    case R.id.btn_sub:
                        result = input1 - input2;
                        textView.setText(Double.toString(result));
                        break;
                    case R.id.btn_mul:
                        result = input1 * input2;
                        textView.setText(Double.toString(result));
                        break;
                    case R.id.btn_div:
                        if (input2 == 0)
                            textView.setText("0으로 나눌 수 없습니다.");
                        else {
                            result = input1 / input2;
                            textView.setText(Double.toString(result));
                        }
                        break;
                }
            }
        };

        btnAdd.setOnClickListener(click);
        btnSub.setOnClickListener(click);
        btnMul.setOnClickListener(click);
        btnDiv.setOnClickListener(click);

//        btnAdd.setOnClickListener(new View.OnClickListener(){
//            public void onClick(View v) {
//                double input1 = parseDouble(editText1.getText().toString());
//                double input2 = parseDouble(editText2.getText().toString());
//                double result = input1 + input2;
//                textView.setText(Double.toString(result));
//            }
//        });
//
//        btnSub.setOnClickListener(new View.OnClickListener(){
//            public void onClick(View v) {
//                double input1 = parseDouble(editText1.getText().toString());
//                double input2 = parseDouble(editText2.getText().toString());
//                double result = input1 - input2;
//                textView.setText(Double.toString(result));
//            }
//        });
//
//        btnMul.setOnClickListener(new View.OnClickListener(){
//            public void onClick(View v) {
//                double input1 = parseDouble(editText1.getText().toString());
//                double input2 = parseDouble(editText2.getText().toString());
//                double result = input1 * input2;
//                textView.setText(Double.toString(result));
//            }
//        });
//
//        btnDiv.setOnClickListener(new View.OnClickListener(){
//            public void onClick(View v) {
//                double input1 = parseDouble(editText1.getText().toString());
//                double input2 = parseDouble(editText2.getText().toString());
//                if(input2 == 0)
//                    textView.setText("0으로 나눌 수 없습니다.");
//                else {
//                    double result = input1 / input2;
//                    textView.setText(Double.toString(result));
//                }
//            }
//        });
    }
}