package com.wordpress.mentalhealthmonitor.teambestteamfinal;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.TextView;




public class GetName extends AppCompatActivity {
    public EditText userName;
    private ImageButton toMainButton;
    public static String editTextString = "";


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_getname);

        userName = (EditText) findViewById(R.id.userName);
        toMainButton = (ImageButton) findViewById(R.id.toMainButton);

        toMainButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openMain();
            }
        });
    }

    public void openMain(){
        Intent intent = new Intent(this, HomeScreen.class);
        EditText myText = (EditText) findViewById(R.id.userName);
        String str = myText.getText().toString();
        editTextString = str;
        startActivity(intent);
    }
}
