package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.ScrollView;
import android.widget.Scroller;
import android.widget.TextView;
import android.widget.Toast;

import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

import com.bumptech.glide.Glide;

public class Resultado extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_resultado);

        Fragment_list leadsFragment = (Fragment_list)
                getSupportFragmentManager().findFragmentById(R.id.resultado2);

        if (leadsFragment == null) {
            leadsFragment = Fragment_list.newInstance();
            getSupportFragmentManager().beginTransaction()
                    .add(R.id.resultado2, leadsFragment)
                    .commit();
        }
    }
}