package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class Bibliografia extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bibliografia);

        TextView textView = findViewById(R.id.bio);
        Bundle datos = getIntent().getExtras();

        textView.setText(datos.getString("bio"));

        this.setTitle(datos.getString("name"));


    }
}