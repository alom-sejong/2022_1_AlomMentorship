package com.example.aromcalculater;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        EditText edit1, edit2;
        TextView textResult;
        String tmp;

        Button btnAdd = (Button) findViewById(R.id.btn_add);
        Button btnSub = (Button) findViewById(R.id.btn_sub);
        Button btnMul = (Button) findViewById(R.id.btn_mul);
        Button btnDiv = (Button) findViewById(R.id.btn_div);

        EditText editText1 = findViewById(R.id.editText1);
        EditText editText2 = findViewById(R.id.editText2);

        TextView textView = findViewById(R.id.textView);



        btnAdd.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
            double num1 = Integer.parseInt(editText1.getText().toString());
            double num2 = Integer.parseInt(editText2.getText().toString());
            textView.setText(String.valueOf(num1+num2));
        }
    });
        btnSub.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                double num1 = Integer.parseInt(editText1.getText().toString());
                double num2 = Integer.parseInt(editText2.getText().toString());
                textView.setText(String.valueOf(num1-num2));
            }
        });
        btnMul.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                double num1 = Integer.parseInt(editText1.getText().toString());
                double num2 = Integer.parseInt(editText2.getText().toString());
                textView.setText(String.valueOf(num1*num2));
            }
        });
        btnDiv.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                double num1 = Integer.parseInt(editText1.getText().toString());
                double num2 = Integer.parseInt(editText2.getText().toString());
                if (num2==0){
                textView.setText("0으로 나눌 수 없습니다!");
                }
                else {
                    textView.setText(String.valueOf(num1 / num2));
                } }
        });
}
}