package com.example.hakeem.smartmedical;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button todayButton = (Button) findViewById(R.id.today);
       /* public void onClick(View v) {
            Intent intent = new Intent(MainActivity.this ,days_button.class);
            startActivity(intent);
        }*/

        todayButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this ,days_button.class);
                startActivity(intent);
            }
        });
    }


    /*public void days_table(View view) {
        Intent intent = new Intent(MainActivity.this ,days_button.class);
        startActivity(intent);
    }*/
}
