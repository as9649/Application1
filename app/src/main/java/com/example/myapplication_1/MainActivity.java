package com.example.myapplication_1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {
    Button btn;
    ImageView imageView;
    public static Random rnd=new Random();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btn = findViewById(R.id.btn);
        imageView = findViewById(R.id.imageView);

    }

    public void go(View view) {
        int num=rnd.nextInt(3)+1;
        btn.setText(""+num);
        if (num == 1) {
            imageView.setImageResource(R.drawable.one);
        } else if (num == 2) {
            imageView.setImageResource(R.drawable.two);
        } else {
            imageView.setImageResource(R.drawable.three);
        }

    }
}