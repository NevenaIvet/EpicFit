package com.example.user.fit;

import android.graphics.Typeface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import java.io.Serializable;

public class ProfileActivity extends AppCompatActivity  {

    private TextView profileText;

    public ProfileActivity(String s, String s1) {
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile);

        profileText = (TextView) findViewById(R.id.profileName);
        //adding a new font called "Athletic", from assets folder
        Typeface athletic = Typeface.createFromAsset(getAssets(), "athletic.ttf");
        profileText.setTypeface(athletic);



        
    }
}
