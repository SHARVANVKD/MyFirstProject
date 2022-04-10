package com.example.simplecalculater;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    int ans = 0;
    TextView results;
    EditText numbers;
    Button btnPlus,btnMinus,btnMultipple,btnDivid,btnEquals;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //declare
        numbers  = findViewById(R.id.numbers);
        btnPlus    = findViewById(R.id.btnPlus);
        btnMinus    = findViewById(R.id.btnMinus);
        btnMultipple    = findViewById(R.id.btnMultipple);
        btnDivid    = findViewById(R.id.btnDivid);
        btnEquals    = findViewById(R.id.btnEquals);
        results   = findViewById(R.id.results);



        btnPlus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(numbers.getText().toString() == ""){
                    results.setText("Enter Any Values");
                }else{
                    int a = Integer.parseInt(numbers.getText().toString());
                    ans = ans +a;
                    numbers.setText("");
                    results.setText(Integer.toString(ans));
                }
            }
        });

        btnMinus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(numbers.getText().toString() == ""){
                    results.setText("Enter Any Values");
                }else {
                    int a = Integer.parseInt(numbers.getText().toString());
                    if (ans == 0) {
                        ans = a;
                        numbers.setText("");
                        results.setText(Integer.toString(ans));
                    } else {
                        ans = ans - a;
                        numbers.setText("");
                        results.setText(Integer.toString(ans));
                    }
                }
            }
        });

        btnMultipple.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(numbers.getText().toString() == ""){
                    results.setText("Enter Any Values");
                }else {
                    int a = Integer.parseInt(numbers.getText().toString());
                    if (ans == 0) {
                        ans = 1 * a;
                        numbers.setText("");
                        results.setText(Integer.toString(ans));
                    } else {
                        ans = ans * a;
                        numbers.setText("");
                        results.setText(Integer.toString(ans));
                    }
                }
            }
        });

        btnDivid.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(numbers.getText().toString() == ""){
                    results.setText("Enter Any Values");
                }else {
                    int a = Integer.parseInt(numbers.getText().toString());
                    if (ans == 0) {
                        ans = a;
                        numbers.setText("");
                        results.setText(Integer.toString(ans));
                    } else {
                        ans = ans / a;
                        numbers.setText("");
                        results.setText(Integer.toString(ans));
                    }
                }
            }
        });


        btnEquals.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //numbers.setText(Integer.toString(ans));
                results.setText("");
                ans= 0;
            }
        });





        //void add(){

        //}

                //7818





    }
}