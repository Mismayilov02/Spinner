package com.example.m.ismayilov.spinner;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.Spinner;

public class MainActivity extends AppCompatActivity {

    ImageView imageView;
    Spinner spinner;

    String[] list = new String[]{"Select" , "Sun" , "Cloud" };
    Integer[] imageList = new Integer[]{R.drawable.sun , R.drawable.cloud};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        imageView = findViewById(R.id.imageView);
        spinner = findViewById(R.id.spinner);

        spinner.setAdapter(new ArrayAdapter<String>(this , android.R.layout.simple_spinner_dropdown_item , list));

        spinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
                if(i != 0){
                    imageView.setImageResource(imageList[i-1]);
                }
            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {

            }
        });

    }
}