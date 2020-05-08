package com.example.sum;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    Button main_button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //button to naviget to secont intent
        main_button = (Button) findViewById(R.id.btn_main);

        //on click listeners..nakuambia I hate this method..I use butterknife
        main_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, SumActivity.class);
                startActivity(intent);
            }
        });

        String value = getIntent().getStringExtra("value");

        Toast.makeText(this, "The sum is:"+value, Toast.LENGTH_SHORT).show();
    }
}
