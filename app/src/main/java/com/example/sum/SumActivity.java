package com.example.sum;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;


import androidx.appcompat.app.AppCompatActivity;

public class SumActivity extends AppCompatActivity {

    EditText number1;
    EditText number2;
    Button Add_button;
    int ans = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sum);

        // by ID we can use each component which id is assign in xml file
        number1 = (EditText) findViewById(R.id.editText_first_no);
        number2 = (EditText) findViewById(R.id.editText_second_no);
        Add_button = (Button) findViewById(R.id.add_button);


        // num1 or num2 double type
        // get data which is in edittext, convert it to string
        // using parse Double convert it to Double type
        double num1 = Double.parseDouble(number1.getText().toString());
        double num2 = Double.parseDouble(number2.getText().toString());
        // add both number and store it to sum
        final double sum = num1 + num2;


        // Add_button add clicklistener
        Add_button.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {

                Intent intent = new Intent(SumActivity.this, MainActivity.class);
                intent.putExtra("value",String.valueOf(sum));
                startActivity(intent);

            }

        });

    }
}
