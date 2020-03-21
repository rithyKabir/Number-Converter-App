package com.example.miniprojectoffline;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class activity2 extends AppCompatActivity {
    private Button htod, htob, btod, btoh,dtob,dtoh;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_activity2);
        htob = findViewById(R.id.htob);
        htod = findViewById(R.id.htod);
        dtob = findViewById(R.id.dtob);
        dtoh = findViewById(R.id.dtoh);
        btod = findViewById(R.id.btod);
        btoh = findViewById(R.id.btoh);
        htob.setOnClickListener(new View.OnClickListener()
        {

            @Override
            public void onClick(View v) {
                hexaTObinary();
            }
        }
        );
        htod.setOnClickListener(new View.OnClickListener()
                                {

                                    @Override
                                    public void onClick(View v) {
                                        hexaTOdecimal();
                                    }
                                }
        );
        dtob.setOnClickListener(new View.OnClickListener()
                                {

                                    @Override
                                    public void onClick(View v) {
                                        decimalTObinary();
                                    }
                                }
        );
        dtoh.setOnClickListener(new View.OnClickListener()
                                {

                                    @Override
                                    public void onClick(View v) {
                                        decimalTOhex();
                                    }
                                }
        );
        btod.setOnClickListener(new View.OnClickListener()
                                {

                                    @Override
                                    public void onClick(View v) {
                                        binaryTOdecimal();
                                    }
                                }
        );
        btoh.setOnClickListener(new View.OnClickListener()
                                {

                                    @Override
                                    public void onClick(View v) {
                                        binaryTOhexa();
                                    }
                                }
        );
    }
    void hexaTObinary()
    {
        Intent intent = new Intent(this, hexaTObinary.class);
        startActivity(intent);

    }
    void hexaTOdecimal()
    {
        Intent intent = new Intent(this, hexaTodecimal.class);
        startActivity(intent);
    }
    void decimalTObinary()
    {
        Intent intent = new Intent(this, decimalTObinary.class);
        startActivity(intent);
    }
    void decimalTOhex()
    {
        Intent intent = new Intent(this, decimalToHex.class);
        startActivity(intent);
    }
    void binaryTOdecimal()
    {
        Intent intent = new Intent(this, binaryTodecimal.class);
        startActivity(intent);
    }
    void binaryTOhexa()
    {
        Intent intent = new Intent(this, binaryTOhex.class);
        startActivity(intent);
    }


}
