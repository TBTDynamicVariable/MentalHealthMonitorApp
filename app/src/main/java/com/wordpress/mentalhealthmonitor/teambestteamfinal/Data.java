package com.wordpress.mentalhealthmonitor.teambestteamfinal;

import android.media.Image;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView;

public class Data extends AppCompatActivity {


    public ImageButton HRVButton;
    public ImageButton HRButton;
    public ImageView showDataView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_data);
        HRVButton = (ImageButton) findViewById(R.id.hrvButton);
        HRButton = (ImageButton) findViewById(R.id.heartratebutton);
        showDataView = (ImageView) findViewById(R.id.dataImageView);

        HRVButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                setHRV();
            }
        });
        HRButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                setHR();
            }
        });


    }
    public void setHRV(){
        final Handler handler = new Handler();
        handler.postDelayed(new Runnable() {
            @Override
            public void run() {
                ImageView showDataView = (ImageView) findViewById(R.id.dataImageView);
                showDataView.setImageResource(R.drawable.fraome48);
            }
        }, 2000);
        final Handler handler2 = new Handler();
        handler2.postDelayed(new Runnable() {
            @Override
            public void run() {
                ImageView showDataView = (ImageView) findViewById(R.id.dataImageView);
                showDataView.setImageResource(R.drawable.frame46);
            }
        }, 6000);
        final Handler handler1 = new Handler();
        handler1.postDelayed(new Runnable() {
            @Override
            public void run() {
                ImageView showDataView = (ImageView) findViewById(R.id.dataImageView);
                showDataView.setImageResource(R.drawable.frame50);
            }
        }, 1000);
        final Handler handler3 = new Handler();
        handler3.postDelayed(new Runnable() {
            @Override
            public void run() {
                ImageView showDataView = (ImageView) findViewById(R.id.dataImageView);
                showDataView.setImageResource(R.drawable.frame47);
            }
        }, 2000);

        final Handler handler5 = new Handler();
        handler5.postDelayed(new Runnable() {
            @Override
            public void run() {
                ImageView showDataView = (ImageView) findViewById(R.id.dataImageView);
                showDataView.setImageResource(R.drawable.fraome48);
            }
        }, 5000);
    }
    public void setHR(){
        final Handler handler = new Handler();
        handler.postDelayed(new Runnable() {
            @Override
            public void run() {
                ImageView showDataView = (ImageView) findViewById(R.id.dataImageView);
                showDataView.setImageResource(R.drawable.frame77);
            }
        }, 2000);

        final Handler handler1 = new Handler();
        handler1.postDelayed(new Runnable() {
            @Override
            public void run() {
                ImageView showDataView = (ImageView) findViewById(R.id.dataImageView);
                showDataView.setImageResource(R.drawable.frame78);
            }
        }, 5000);
        final Handler handler2 = new Handler();
        handler2.postDelayed(new Runnable() {
            @Override
            public void run() {
                ImageView showDataView = (ImageView) findViewById(R.id.dataImageView);
                showDataView.setImageResource(R.drawable.frame79);
            }
        }, 8000);
        final Handler handler3 = new Handler();
        handler3.postDelayed(new Runnable() {
            @Override
            public void run() {
                ImageView showDataView = (ImageView) findViewById(R.id.dataImageView);
                showDataView.setImageResource(R.drawable.frame77);
            }
        }, 5000);
        final Handler handler4 = new Handler();
        handler4.postDelayed(new Runnable() {
            @Override
            public void run() {
                ImageView showDataView = (ImageView) findViewById(R.id.dataImageView);
                showDataView.setImageResource(R.drawable.frame79);
            }
        }, 8000);
    }
}
