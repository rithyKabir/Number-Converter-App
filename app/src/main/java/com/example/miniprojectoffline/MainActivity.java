package com.example.miniprojectoffline;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Timer;
import java.util.TimerTask;

public class MainActivity extends AppCompatActivity {
    private ImageView img1, img2, img3, img4, img5;
    private TextView binary, hexa, decimal, display;

    int count = 0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        img1 = findViewById(R.id.img1);
        img2 = findViewById(R.id.img2);
        img3 = findViewById(R.id.img3);
        img4 = findViewById(R.id.img4);
        decimal = findViewById(R.id.decimal);
        display = findViewById(R.id.frontPage);
        hexa = findViewById(R.id.hexa);
        binary = findViewById(R.id.binary);
        Thread t= new Thread()
        {
            public void run()
            {while (!interrupted())
            {
                try{
                    currentThread().sleep(1300);
                    runOnUiThread(new Runnable() {
                        @Override
                        public void run() {
                            count++;
                            if(count==1)
                            {

                                img2.setVisibility(View.VISIBLE);
                                img1.setVisibility(View.GONE);
                                display.setVisibility(View.GONE);
                                binary.setVisibility(View.VISIBLE);
                            }
                            if(count ==2)
                            {
                                img3.setVisibility(View.VISIBLE);
                                img2.setVisibility(View.GONE);
                                binary.setVisibility(View.GONE);
                                hexa.setVisibility(View.VISIBLE);
                            }
                            if(count == 3)
                            {
                                img4.setVisibility(View.VISIBLE);
                                img3.setVisibility(View.GONE);
                                decimal.setVisibility(View.VISIBLE);
                                hexa.setVisibility(View.GONE);
                            }
                            if(count==4) {
                                openActivity2();
                                Thread.interrupted();
                            }
                        }
                    });
                } catch (InterruptedException e){
                    e.printStackTrace();
                }
            }
            }

        };
        t.start();
        Thread t1= new Thread()
        {
            public void run()
            {while (!interrupted())
            {
                try{
                    currentThread().sleep(1500);
                    runOnUiThread(new Runnable() {
                        @Override
                        public void run() {
                            count++;
                            if(count==1)
                            {

                                img2.setVisibility(View.VISIBLE);
                                img1.setVisibility(View.GONE);
                                display.setVisibility(View.GONE);
                                binary.setVisibility(View.VISIBLE);
                            }
                            if(count ==2)
                            {
                                img3.setVisibility(View.VISIBLE);
                                img2.setVisibility(View.GONE);
                                binary.setVisibility(View.GONE);
                                hexa.setVisibility(View.VISIBLE);
                            }
                            if(count == 3)
                            {
                                img4.setVisibility(View.VISIBLE);
                                img3.setVisibility(View.GONE);
                                decimal.setVisibility(View.VISIBLE);
                                hexa.setVisibility(View.GONE);
                            }
                            if(count==4) {
                                openActivity2();
                                img1.setVisibility(View.VISIBLE);
                                display.setVisibility(View.VISIBLE);
                                img4.setVisibility(View.GONE);
                                decimal.setVisibility(View.GONE);
                                Thread.interrupted();
                            }
                        }
                    });
                } catch (InterruptedException e){
                    e.printStackTrace();
                }
            }
            }

        };

    }
    void openActivity2()
    {
        Intent intent = new Intent(this, activity2.class);
        startActivity(intent);
    }
    protected void onStart() {
        super.onStart();
        Toast.makeText(MainActivity.this, "Please Wait", Toast.LENGTH_SHORT).show();
    }
    protected void onStop() {
        super.onStop();
        Toast.makeText(MainActivity.this, "Click on go button", Toast.LENGTH_SHORT).show();
    }
    protected void onPause() {
        super.onPause();
        finish();

    }
}
