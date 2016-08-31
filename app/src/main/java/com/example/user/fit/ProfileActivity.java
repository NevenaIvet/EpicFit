package com.example.user.fit;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import java.io.Serializable;

public class ProfileActivity extends AppCompatActivity  {

    private TextView nameSpace;

    public ProfileActivity(String s, String s1) {
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile);

        nameSpace = (TextView) findViewById(R.id.profileName);

        
    }
}
