package com.example.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    EditText et1,et2;
    Button bt1,bt2,bt3,bt4;
    TextView tv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        et1=findViewById(R.id.et1);
        et2=findViewById(R.id.et2);
        bt1=findViewById(R.id.bt1);
        bt2=findViewById(R.id.bt2);
        bt3=findViewById(R.id.bt3);
        bt4=findViewById(R.id.bt4);
        tv=findViewById(R.id.tv);

        bt1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int f,s,a;
                f=Integer.parseInt(et1.getText().toString());
                s=Integer.parseInt(et2.getText().toString());
                a=f+s;
                tv.setText("Result="+a);
            }
        });

        bt2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int f,s,a;
                f=Integer.parseInt(et1.getText().toString());
                s=Integer.parseInt(et2.getText().toString());
                a=f-s;
                tv.setText("Result="+a);
            }
        });

        bt3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int f,s,a;
                f=Integer.parseInt(et1.getText().toString());
                s=Integer.parseInt(et2.getText().toString());
                a=f*s;
                tv.setText("Result="+a);
            }
        });

        bt4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int f,s,a;
                f=Integer.parseInt(et1.getText().toString());
                s=Integer.parseInt(et2.getText().toString());
                a=f/s;
                tv.setText("Result="+a);
            }
        });
    }
}