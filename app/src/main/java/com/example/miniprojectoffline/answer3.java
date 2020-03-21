package com.example.miniprojectoffline;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;
import android.widget.Toast;

public class answer3 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_answer3);
        Toast.makeText(answer3.this,"Convertion Successful", Toast.LENGTH_SHORT).show();
        Intent intent = getIntent();
        String ans = intent.getStringExtra(binaryTOhex.EXTRA_NUMBER2);
        TextView text1 = findViewById(R.id.text1);
        text1.setText(ans);
    }
}
