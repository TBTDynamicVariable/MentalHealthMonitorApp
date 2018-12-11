package com.wordpress.mentalhealthmonitor.teambestteamfinal;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class newJournal extends AppCompatActivity {

    public Button newJournalButton;
    public String myString;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_new_journal);

        myString = Journal.newJournalNameString;
        newJournalButton = (Button) findViewById(R.id.newJournalButtonButton);
        newJournalButton.setText(myString);
        newJournalButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openEntry();
            }
        });
    }

    public void openEntry(){
        Intent intent = new Intent(this, Entry.class);
        startActivity(intent);
    }

}
