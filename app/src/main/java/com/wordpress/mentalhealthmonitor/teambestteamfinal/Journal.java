package com.wordpress.mentalhealthmonitor.teambestteamfinal;

import android.content.Intent;
import android.media.Image;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;


public class Journal extends AppCompatActivity {
    public ImageButton newJournalButton;
    public EditText newJournalName;
    public static String newJournalNameString = "";


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_journal);

        newJournalButton = (ImageButton) findViewById(R.id.newJournalBut);
        newJournalName = (EditText) findViewById(R.id.newJournalTitleEdit);

        newJournalButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                makeJournal();
                finish();
            }
        });
    }
    public void makeJournal(){
        Intent intent = new Intent(this, newJournal.class);
        EditText myText = (EditText) findViewById(R.id.newJournalTitleEdit);
        String str = myText.getText().toString();
        newJournalNameString = str;
        startActivity(intent);
    }
}
