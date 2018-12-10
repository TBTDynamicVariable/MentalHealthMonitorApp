package com.wordpress.mentalhealthmonitor.teambestteamfinal;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
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



        nameFromMain = (TextView) findViewById(R.id.textView);
        userNameString = GetName.editTextString;
        nameFromMain.setText(userNameString);

    }
}
