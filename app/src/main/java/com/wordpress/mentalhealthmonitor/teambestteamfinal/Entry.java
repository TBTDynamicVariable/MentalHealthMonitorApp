package com.wordpress.mentalhealthmonitor.teambestteamfinal;

import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.EditText;

public class Entry extends AppCompatActivity {

    private static final int PREFERENCE_MODE = 0;
    public EditText journalEditText;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_entry);

        journalEditText = (EditText) findViewById(R.id.JournalEntryText);
        SetText();

    }

    @Override
    public void onBackPressed() {
        SavePreferences();


        super.onBackPressed();
    }

    public void SavePreferences(){
        String journalText = journalEditText.getText().toString();
        String journalName = Journal.newJournalNameString;
        SharedPreferences preferenceSettings = getPreferences(PREFERENCE_MODE);
        SharedPreferences.Editor preferenceEditor = preferenceSettings.edit();
        preferenceEditor.commit();
        preferenceEditor.putString(journalName, journalText);
    }
    public void SetText(){
        String journalName = Journal.newJournalNameString;
        String journalText;
        SharedPreferences preferenceSettings = getPreferences(PREFERENCE_MODE);
        journalText = preferenceSettings.getString(journalName,"");
        journalEditText.setText(journalText);
    }

}
