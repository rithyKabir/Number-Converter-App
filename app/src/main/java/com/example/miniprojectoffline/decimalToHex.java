package com.example.miniprojectoffline;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class decimalToHex extends AppCompatActivity {
    public static final String EXTRA_NUMBER3 = "com.example.miniprojectoffline.EXTRA_NUMBER3";
    private EditText text1;
    private Button button1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_decimal_to_hex);
        text1 = findViewById(R.id.textConvertDtoH);
        button1 = findViewById(R.id.convertDtoH);
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
        int n = Integer.parseInt(s1);
        String s = Integer.toHexString(n);
        Intent intent = new Intent(this, answer1.class);
        intent.putExtra(EXTRA_NUMBER3,s);
        startActivity(intent);
    }

}
