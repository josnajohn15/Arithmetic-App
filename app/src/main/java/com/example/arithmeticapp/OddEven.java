package com.example.arithmeticapp;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatButton;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class OddEven extends AppCompatActivity {
    EditText ed;
    AppCompatButton b1,b2;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_odd_even);
        ed=(EditText) findViewById(R.id.num);
        b1=(AppCompatButton) findViewById(R.id.oe);
        b2=(AppCompatButton) findViewById(R.id.back);


        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try {
                    String Num = ed.getText().toString();
                    int n1 = Integer.parseInt(Num);
                    int n2 = n1 % 2;
                    if (n2 == 0) {
                        Toast.makeText(getApplicationContext(), String.valueOf(n1) + " " + "is even", Toast.LENGTH_LONG).show();

                    } else {
                        Toast.makeText(getApplicationContext(), String.valueOf(n1) + " " + "is odd", Toast.LENGTH_LONG).show();
                    }
                } catch (Exception e) {
                    Toast.makeText(getApplicationContext(), e.toString(), Toast.LENGTH_SHORT).show();
                }
            }
        });
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(getApplicationContext(),MainActivity.class);
                startActivity(i);
            }
        });


    }
}