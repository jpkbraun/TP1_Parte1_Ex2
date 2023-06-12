package com.example.pratica12;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

import org.w3c.dom.Text;

public class MainActivity2 extends AppCompatActivity {
    private TextView tv22_;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        tv22_ = (TextView) findViewById(R.id.tv22);
        String data = getIntent().getStringExtra("data");
        tv22_.setText(data);
    }
}