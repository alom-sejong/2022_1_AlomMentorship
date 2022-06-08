package com.example.practice;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import static java.lang.Double.parseDouble;
import static java.lang.Integer.parseInt;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btnadd=findViewById(R.id.btn_add);
        Button btnsub=findViewById(R.id.btn_sub);
        Button btnmul=findViewById(R.id.btn_mul);
        Button btndiv=findViewById(R.id.btn_div);
        Button btnpow=findViewById(R.id.btn_pow);
        Button btnsqrt=findViewById(R.id.btn_sqrt);

        EditText editText1=findViewById(R.id.editText1);
        EditText editText2=findViewById(R.id.editText2);

        TextView textView=findViewById(R.id.textView);

        btnadd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                double input1=parseDouble(editText1.getText().toString());
                double input2=parseDouble(editText2.getText().toString());
                double result = input1+input2;
                textView.setText(Double.toString(result));

            }
        });

        btnsub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                double input1=parseDouble(editText1.getText().toString());
                double input2=parseDouble(editText2.getText().toString());
                double result = input1-input2;
                textView.setText(Double.toString(result));

            }
        });

        btnmul.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                double input1=parseDouble(editText1.getText().toString());
                double input2=parseDouble(editText2.getText().toString());
                double result = input1*input2;
                textView.setText(Double.toString(result));

            }
        });

        btndiv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                double input1=parseDouble(editText1.getText().toString());
                double input2=parseDouble(editText2.getText().toString());
                if(input2==0){
                    textView.setText("You cannot divide by zero");
                }
                else{
                    double result = input1/input2;
                    textView.setText(Double.toString(result));
                }


            }
        });

        btnpow.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                double input1=parseDouble(editText1.getText().toString());
                double input2=parseDouble(editText2.getText().toString());
                double result = Math.pow(input1,input2);
                textView.setText(Double.toString(result));

            }
        });

        btnsqrt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                double input1=parseDouble(editText1.getText().toString());
                double result = Math.sqrt(input1);
                textView.setText(Double.toString(result));

            }
        });


    }
}
