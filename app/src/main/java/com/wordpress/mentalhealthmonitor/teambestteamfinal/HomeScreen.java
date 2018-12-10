package com.wordpress.mentalhealthmonitor.teambestteamfinal;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.TextView;

public class HomeScreen extends AppCompatActivity {

    public String userNameString;
    public TextView nameFromMain;

    public ImageButton toJournal;
    public ImageButton toData;
    public ImageButton toHelp;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home_screen);

        toJournal = (ImageButton) findViewById(R.id.journalButton);
        toHelp = (ImageButton) findViewById(R.id.helpButton);
        toData = (ImageButton) findViewById(R.id.dataButton);

        toJournal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openJournal();
            }
        });

        toHelp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openHelp();
            }
        });

        toData.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openData();
            }
        });

        nameFromMain = (TextView) findViewById(R.id.textView);
        userNameString = GetName.editTextString;
        nameFromMain.setText(userNameString);

    }
    public void openData(){
        Intent intent = new Intent(this, Data.class);
        startActivity(intent);
    }
    public void openJournal(){
        Intent intent = new Intent(this, Journal.class);
        startActivity(intent);
    }
    public void openHelp(){
        Intent intent = new Intent(this, Help.class);
        startActivity(intent);
    }

}
