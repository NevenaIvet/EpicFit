package com.example.user.fit;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Interpolator;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class CreateProfile extends AppCompatActivity {

    private Button save;
    private Button cancel;
    private EditText name;
    private EditText username;
    private EditText email;
    private EditText weight;
    private EditText height;
    private EditText password;
    private EditText confirmPassword;
//neshto

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_create_profile);

        save = (Button) findViewById(R.id.button_save);
        cancel = (Button) findViewById(R.id.button_cancel);
        name = (EditText) findViewById(R.id.name);
        username = (EditText) findViewById(R.id.username);
        email = (EditText) findViewById(R.id.email);
        weight = (EditText) findViewById(R.id.weight);
        height = (EditText) findViewById(R.id.height);
        password = (EditText) findViewById(R.id.password);
        confirmPassword = (EditText) findViewById(R.id.confirmPassword);




        cancel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                name.setText(null);
                username.setText(null);
                email.setText(null);
                weight.setText(null);
                height.setText(null);
                password.setText(null);
                confirmPassword.setText(null);
            }
        });

        save.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(name.isEnabled() && username.isEnabled() && email.isEnabled() && weight.isEnabled() && height.isEnabled() && password.isEnabled() && confirmPassword.isEnabled()){
                    //need verification for email
                    //need verificatio for password

                    if(password.equals(confirmPassword)) {
                        Intent goToProfile = new Intent(CreateProfile.this, Profile.class);
                        startActivity(goToProfile);
                    }


                }
            }
        });
    }
}
