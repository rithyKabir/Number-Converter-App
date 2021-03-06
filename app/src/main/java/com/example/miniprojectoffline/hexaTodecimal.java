package com.example.miniprojectoffline;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class hexaTodecimal extends AppCompatActivity {
    public static final String EXTRA_NUMBER5 = "com.example.miniprojectoffline.EXTRA_NUMBER5";
    private EditText text1;
    private Button button1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hexa_todecimal);
        text1 = findViewById(R.id.textConvertHtoD);
        button1 = findViewById(R.id.convertHtoD);
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
        int n = Integer.parseInt(s1,16);
        String s = Integer.toString(n);
        Intent intent = new Intent(this, answer5.class);
        intent.putExtra(EXTRA_NUMBER5,s);
        startActivity(intent);
    }
}
