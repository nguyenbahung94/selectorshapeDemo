package com.example.android.gridlayoutdemo;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.Button;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {
    ImageView imgHinh;
    Button btnPrev, btnNext;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.layerlist);
/*
        imgHinh = (ImageView) findViewById(R.id.imageViewHinh);
        btnNext = (Button) findViewById(R.id.buttonNext);
        btnPrev = (Button) findViewById(R.id.buttonPrev);
        imgHinh.setImageLevel(6);


        btnNext.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                LevelListDrawable listDrawable = (LevelListDrawable) imgHinh.getDrawable();
                int level = listDrawable.getLevel();
                if(level >= 6){
                    level = 0;
                }
                imgHinh.setImageLevel(level  + 1);

            }
        });

        btnPrev.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                LevelListDrawable listDrawable = (LevelListDrawable) imgHinh.getDrawable();
                int level = listDrawable.getLevel();
                if(level == 0){
                    level = 6;
                }
                imgHinh.setImageLevel(level - 1);

            }
        });*/
    }

}
