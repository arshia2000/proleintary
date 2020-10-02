package com.avmhl.proleintary;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Toast.makeText(MainActivity.this,"salam",Toast.LENGTH_LONG).show();
        Toast.makeText(MainActivity.this,"hello",Toast.LENGTH_LONG).show();
        Toast.makeText(MainActivity.this,"asdf",Toast.LENGTH_LONG).show();
    }
}