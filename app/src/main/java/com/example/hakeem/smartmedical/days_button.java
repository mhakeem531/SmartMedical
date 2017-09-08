package com.example.hakeem.smartmedical;

import android.content.Intent;
import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.format.DateFormat;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class days_button extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_days_button);

        Button buttonDay1 = (Button) findViewById(R.id.day1);
        buttonDay1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(days_button.this, Day.class);
                intent.putExtra("image", R.drawable.one);
                startActivity(intent);
            }
        });

        Button buttonDay2 = (Button) findViewById(R.id.day2);
        buttonDay2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(days_button.this, Day.class);
                intent.putExtra("image", R.drawable.two);
                startActivity(intent);
            }
        });

        Button buttonDay3 = (Button) findViewById(R.id.day3);
        buttonDay3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(days_button.this, Day.class);
                intent.putExtra("image", R.drawable.three);
                startActivity(intent);
            }
        });

        Button buttonDay4 = (Button) findViewById(R.id.day4);
        buttonDay4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(days_button.this, Day.class);
                intent.putExtra("image", R.drawable.four);
                startActivity(intent);

            }
        });

        Button buttonDay5 = (Button) findViewById(R.id.day5);
        buttonDay5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(days_button.this, Day.class);
                intent.putExtra("image", R.drawable.five);
                startActivity(intent);

            }
        });

        Button buttonDay6 = (Button) findViewById(R.id.day6);
        buttonDay6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(days_button.this, Day.class);
                intent.putExtra("image", R.drawable.sex);
                startActivity(intent);

            }
        });

        Button buttonDay7 = (Button) findViewById(R.id.day7);
        buttonDay7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(days_button.this, Day.class);
                intent.putExtra("image", R.drawable.seven);
                startActivity(intent);

            }
        });

        Button buttonDay8 = (Button) findViewById(R.id.day8);
        buttonDay8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(days_button.this, Day.class);
                intent.putExtra("image", R.drawable.eight);
                startActivity(intent);
            }
        });

        Button buttonDay9 = (Button) findViewById(R.id.day9);
        buttonDay9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(days_button.this, Day.class);
                intent.putExtra("image", R.drawable.nine);
                startActivity(intent);
            }
        });

        Button buttonDay10 = (Button) findViewById(R.id.day10);
        buttonDay10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(days_button.this, Day.class);
                intent.putExtra("image", R.drawable.ten);
                startActivity(intent);//اكمل؟؟ yes
            }
        });

        Button buttonDay11 = (Button) findViewById(R.id.day11);
        buttonDay11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(days_button.this, Day.class);
                intent.putExtra("image", R.drawable.eleven);
                startActivity(intent); //select the semi colon also :) ok i catch
            }
        });

        Button buttonDay12 = (Button) findViewById(R.id.day12);
        buttonDay12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(days_button.this, Day.class);
                intent.putExtra("image", R.drawable.twelve);
                startActivity(intent);
            }
        });

        Button buttonDay13 = (Button) findViewById(R.id.day13);
        buttonDay13.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(days_button.this, Day.class);
                intent.putExtra("image", R.drawable.therteen);
                startActivity(intent);
            }
        });

        Button buttonDay14 = (Button) findViewById(R.id.day14);
        buttonDay14.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(days_button.this, Day.class);
                intent.putExtra("image", R.drawable.fourteen);
                startActivity(intent);
            }
        });

        Button buttonDay15 = (Button) findViewById(R.id.day15);
        buttonDay15.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(days_button.this, Day.class);
                intent.putExtra("image", R.drawable.fifteen);
                startActivity(intent);
            }
        });

        Button buttonDay16 = (Button) findViewById(R.id.day16);
        buttonDay16.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(days_button.this, Day.class);
                intent.putExtra("image", R.drawable.sixteen);
                startActivity(intent);
            }
        });

        Button buttonDay17 = (Button) findViewById(R.id.day17);
        buttonDay17.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(days_button.this, Day.class);
                intent.putExtra("image", R.drawable.seventeen);
                startActivity(intent);
            }
        });

        Button buttonDay18 = (Button) findViewById(R.id.day18);
        buttonDay18.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(days_button.this, Day.class);
                intent.putExtra("image", R.drawable.eighteen);
                startActivity(intent);
            }
        });

        Button buttonDay19 = (Button) findViewById(R.id.day19);
        buttonDay19.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(days_button.this, Day.class);
                intent.putExtra("image", R.drawable.nineteen);
                startActivity(intent);
            }
        });

        Button buttonDay20 = (Button) findViewById(R.id.day20);
        buttonDay20.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(days_button.this, Day.class);
                intent.putExtra("image", R.drawable.twenty);
                startActivity(intent);
            }
        });

        Button buttonDay21 = (Button) findViewById(R.id.day21);
        buttonDay21.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(days_button.this, Day.class);
                intent.putExtra("image", R.drawable.twentyone);
                startActivity(intent);
            }
        });

        Button buttonDay22 = (Button) findViewById(R.id.day22);
        buttonDay22.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(days_button.this, Day.class);
                intent.putExtra("image", R.drawable.twentytwo);
                startActivity(intent);
            }
        });

        Button buttonDay23 = (Button) findViewById(R.id.day23);
        buttonDay23.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(days_button.this, Day.class);
                intent.putExtra("image", R.drawable.twentythree);
                startActivity(intent);
            }
        });

        Button buttonDay24 = (Button) findViewById(R.id.day24);
        buttonDay24.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(days_button.this, Day.class);
                intent.putExtra("image", R.drawable.twentyfour);
                startActivity(intent);
            }
        });

        Button buttonDay25 = (Button) findViewById(R.id.day25);
        buttonDay25.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(days_button.this, Day.class);
                intent.putExtra("image", R.drawable.twentyfive);
                startActivity(intent);
            }
        });

        Button buttonDay26 = (Button) findViewById(R.id.day26);
        buttonDay26.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(days_button.this, Day.class);
                intent.putExtra("image", R.drawable.twentysex);
                startActivity(intent);
            }
        });

        Button buttonDay27 = (Button) findViewById(R.id.day27);
        buttonDay27.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(days_button.this, Day.class);
                intent.putExtra("image", R.drawable.twentyseven);
                startActivity(intent);
            }
        });

        Button buttonDay28 = (Button) findViewById(R.id.day28);
        buttonDay28.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(days_button.this, Day.class);
                intent.putExtra("image", R.drawable.twentyeight);
                startActivity(intent);
            }
        });

        Button buttonDay29 = (Button) findViewById(R.id.day29);
        buttonDay29.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(days_button.this, Day.class);
                intent.putExtra("image", R.drawable.twentynine);
                startActivity(intent);
            }
        });

        Button buttonDay30 = (Button) findViewById(R.id.day30);
        buttonDay30.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(days_button.this, Day.class);
                intent.putExtra("image", R.drawable.thirty);
                startActivity(intent);
            }
        });

    }

    @Override
    protected void onStart() {
        super.onStart();

        setDayColor("#ff40ff4a");
    }

    @Override
    protected void onStop() {
        super.onStop();

        setDayColor("#ffffff");
    }

    private void setDayColor(String color) {
        Calendar calendar = Calendar.getInstance();

        SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");
        String dateString = format.format(calendar.getTime());

        Date date = null;
        try {
            date = format.parse(dateString);
        } catch (ParseException e) {
            Toast.makeText(this, "Error with current date !", Toast.LENGTH_SHORT).show();
        }

        String day = (String) DateFormat.format("dd", date);
        String month = (String) DateFormat.format("MM", date);
        String year = (String) DateFormat.format("yyyy", date);

        Button button = null;
        if (year.equals("2017")) {
            if (month.equals("05")) {
                switch (day) {
                    case "27":
                        button = (Button) findViewById(R.id.day1);
                        break;
                    case "28":
                        button = (Button) findViewById(R.id.day2);
                        break;
                    case "29":
                        button = (Button) findViewById(R.id.day3);
                        break;
                    case "30":
                        button = (Button) findViewById(R.id.day4);
                        break;
                    case "31":
                        button = (Button) findViewById(R.id.day5);
                        break;
                }
                if (button != null) button.setTextColor(Color.parseColor(color));
            } else if (month.equals("06")) {
                switch (day) {
                    case "01":
                        button = (Button) findViewById(R.id.day6);
                        break;
                    case "02":
                        button = (Button) findViewById(R.id.day7);
                        break;
                    case "03":
                        button = (Button) findViewById(R.id.day8);
                        break;
                    case "04":
                        button = (Button) findViewById(R.id.day9);
                        break;
                    case "05":
                        button = (Button) findViewById(R.id.day10);
                        break;
                    case "06":
                        button = (Button) findViewById(R.id.day11);
                        break;
                    case "07":
                        button = (Button) findViewById(R.id.day12);
                        break;
                    case "08":
                        button = (Button) findViewById(R.id.day13);
                        break;
                    case "09":
                        button = (Button) findViewById(R.id.day14);
                        break;
                    case "10":
                        button = (Button) findViewById(R.id.day15);
                        break;
                    case "11":
                        button = (Button) findViewById(R.id.day16);
                        break;
                    case "12":
                        button = (Button) findViewById(R.id.day17);
                        break;
                    case "13":
                        button = (Button) findViewById(R.id.day18);
                        break;
                    case "14":
                        button = (Button) findViewById(R.id.day19);
                        break;
                    case "15":
                        button = (Button) findViewById(R.id.day20);
                        break;
                    case "16":
                        button = (Button) findViewById(R.id.day21);
                        break;
                    case "17":
                        button = (Button) findViewById(R.id.day22);
                        break;
                    case "18":
                        button = (Button) findViewById(R.id.day23);
                        break;
                    case "19":
                        button = (Button) findViewById(R.id.day24);
                        break;
                    case "20":
                        button = (Button) findViewById(R.id.day25);
                        break;
                    case "21":
                        button = (Button) findViewById(R.id.day26);
                        break;
                    case "22":
                        button = (Button) findViewById(R.id.day27);
                        break;
                    case "23":
                        button = (Button) findViewById(R.id.day28);
                        break;
                    case "24":
                        button = (Button) findViewById(R.id.day29);
                        break;
                    case "25":
                        button = (Button) findViewById(R.id.day30);
                        break;
                }
                if (button != null) button.setTextColor(Color.parseColor(color));
            }
        }
    }
}
