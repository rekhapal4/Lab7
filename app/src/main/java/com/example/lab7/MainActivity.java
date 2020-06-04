package com.example.lab7;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.content.Intent;
import android.net.Uri;
import android.widget.Button;
import android.view.View;


public class MainActivity extends AppCompatActivity {

    Button iiitn, google, welcome;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        iiitn=(Button)findViewById(R.id.iiitn);
        google=(Button)findViewById(R.id.google);



        (findViewById(R.id.iiitn)).setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                String url = "https://iiitn.ac.in/";

                Intent i = new Intent(Intent.ACTION_VIEW);
                i.setData(Uri.parse(url));
                startActivity(i);
            }
        });


        google.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, Main2Activity.class);
                startActivity(intent);
            }
        });



    }
}
