package com.example.pratica12;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    private EditText et1_;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        et1_ = (EditText) findViewById(R.id.et1);
    }

    public void nextActivity(View view) {
        Intent i = new Intent(this, MainActivity2.class);
        i.putExtra("data", et1_.getText().toString());
        startActivity(i);
    }
}