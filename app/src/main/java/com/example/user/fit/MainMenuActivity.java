package com.example.user.fit;

import android.graphics.Typeface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

import org.w3c.dom.Text;

public class MainMenuActivity extends AppCompatActivity {

    //buttons for choosing options by the menu
    private Button profile;
    private Button activities;
    private Button challenges;
    private Button progress;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_menu);

        profile = (Button) findViewById(R.id.button_profile_menu);
        activities = (Button) findViewById(R.id.button_activities_menu);
        challenges = (Button) findViewById(R.id.button_chalenges_menu);
        progress = (Button) findViewById(R.id.button_progress_menu);

        //TODO on click listeners





    }
}
