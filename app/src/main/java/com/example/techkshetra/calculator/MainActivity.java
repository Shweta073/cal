package com.example.techkshetra.calculator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView result;
    EditText num1, num2;
    Button add, sub, multiplication, division;

    float result_no;
    int no1, no2;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        result = (TextView) findViewById(R.id.result);

        num1 = (EditText) findViewById(R.id.num1);
        num2 = (EditText) findViewById(R.id.num2);

        add = (Button) findViewById(R.id.add);
        sub = (Button) findViewById(R.id.sub);
        multiplication = (Button) findViewById(R.id.multiplication);
        division = (Button) findViewById(R.id.division);

        add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


                no1 = Integer.parseInt(num1.getText().toString());
                no2 = Integer.parseInt(num2.getText().toString());
                result_no = no1 + no2;
                result.setText(String.valueOf(result_no));
            }

        });

        sub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                no1 = Integer.parseInt(num1.getText().toString());
                no2 = Integer.parseInt(num2.getText().toString());
                result_no = no1 - no2;
                result.setText(String.valueOf(result_no));

            }
        });

        multiplication.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                no1 = Integer.parseInt(num1.getText().toString());
                no2 = Integer.parseInt(num2.getText().toString());
                result_no = no1 * no2;
                result.setText(String.valueOf(result_no));

            }
        });

        division.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                no1 = Integer.parseInt(num1.getText().toString());
                no2 = Integer.parseInt(num2.getText().toString());
                result_no = no1 /    no2;
                result.setText(String.valueOf(result_no));

            }
        });
    }
}

