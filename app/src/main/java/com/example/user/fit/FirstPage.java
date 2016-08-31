package com.example.user.fit;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class FirstPage extends AppCompatActivity {

    private Button create;
    private Button login;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_first_page);

        create = (Button) findViewById(R.id.button_create);
        login = (Button) findViewById(R.id.button_login);

        create.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent createProfile = new Intent(FirstPage.this, CreateProfile.class);
                startActivity(createProfile);
            }
        });

        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent login = new Intent(FirstPage.this, LogIn.class);
                startActivity(login);
            }
        });
        finish();
    }
}
