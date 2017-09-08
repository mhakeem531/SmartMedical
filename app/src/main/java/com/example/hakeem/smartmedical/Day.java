package com.example.hakeem.smartmedical;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;

public class Day extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_day);

        Intent intent = getIntent();
        int imageId = intent.getIntExtra("image", 0);
        //int imageId = intent.getIntExtra();

        ImageView imageView = (ImageView) findViewById(R.id.AtBegining);
        imageView.setImageResource(imageId);
    }
}
