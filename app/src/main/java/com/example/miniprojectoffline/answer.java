package com.example.miniprojectoffline;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;
import android.widget.Toast;

public class answer extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_answer);
        Toast.makeText(answer.this,"Convertion Successful", Toast.LENGTH_SHORT).show();
        Intent intent = getIntent();
        String ans = intent.getStringExtra(binaryTodecimal.EXTRA_NUMBER);
        TextView text1 = findViewById(R.id.text1);
        text1.setText(ans);
    }
}
