package com.example.miniprojectoffline;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;
import android.widget.Toast;

public class answer1 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_answer1);
        Toast.makeText(answer1.this,"Convertion Successful", Toast.LENGTH_SHORT).show();
        Intent intent = getIntent();
        String ans = intent.getStringExtra(decimalToHex.EXTRA_NUMBER3);
        TextView text1 = findViewById(R.id.text1);
        text1.setText(ans);
    }
}
