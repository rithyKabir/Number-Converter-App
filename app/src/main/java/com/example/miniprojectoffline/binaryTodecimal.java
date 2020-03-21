package com.example.miniprojectoffline;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class binaryTodecimal extends AppCompatActivity {
    public static final String EXTRA_NUMBER = "com.example.miniprojectoffline.EXTRA_NUMBER";
    private EditText text1;
    private Button button1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_binary_todecimal);
        text1 = findViewById(R.id.textConvertBtoD);
        button1 = findViewById(R.id.convertBtoD);
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                openAnswer();
            }
        });
    }
    void openAnswer()
    {
        String s1 = text1.getText().toString();
        int n = Integer.parseInt(s1,2);
        String s = Integer.toString(n);
        Intent intent = new Intent(this, answer.class);
        intent.putExtra(EXTRA_NUMBER,s);
        startActivity(intent);
    }
}
