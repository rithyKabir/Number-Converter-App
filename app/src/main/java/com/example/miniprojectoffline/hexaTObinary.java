package com.example.miniprojectoffline;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class hexaTObinary extends AppCompatActivity {
    public static final String EXTRA_NUMBER4 = "com.example.miniprojectoffline.EXTRA_NUMBER4";
    private EditText text1;
    private Button button1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hexa_tobinary);
        text1 = findViewById(R.id.textConvertHtoB);
        button1 = findViewById(R.id.convertHtoB);
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
        String s = Integer.toBinaryString(n);
        Intent intent = new Intent(this, answer4.class);
        intent.putExtra(EXTRA_NUMBER4,s);
        startActivity(intent);
    }
}
