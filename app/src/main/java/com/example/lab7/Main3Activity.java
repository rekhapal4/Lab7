package com.example.lab7;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.content.Intent;
import android.net.Uri;
import android.widget.Button;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.view.View.OnClickListener;


public class Main3Activity extends AppCompatActivity {
    Button back,home;
    TextView txt;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);
        back = (Button) findViewById(R.id.back);
        home = (Button) findViewById(R.id.home);
        txt = (TextView) findViewById(R.id.textView);

        back.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v)
            {
                // some code
                Main3Activity.this.finish();
            }
        });

        home.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(Main3Activity.this, MainActivity.class);
                startActivity(i);
            }
        });

    }
}
