package com.example.miniprojectoffline;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;
import android.widget.Toast;

public class answer5 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_answer5);
        Toast.makeText(answer5.this,"Convertion Successful", Toast.LENGTH_SHORT).show();
        Intent intent = getIntent();
        String ans = intent.getStringExtra(hexaTodecimal.EXTRA_NUMBER5);
        TextView text1 = findViewById(R.id.text1);
        text1.setText(ans);
    }

    }

