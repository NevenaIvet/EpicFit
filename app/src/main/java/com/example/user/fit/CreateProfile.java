package com.example.user.fit;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;


import com.example.user.fit.model.Manager;
import com.example.user.fit.model.athlete.InvalidUsernameException;
import com.example.user.fit.model.athlete.Profile;
import com.example.user.fit.model.athlete.UnsecurePasswordException;

import java.io.Serializable;

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
    private Profile p;
    public static final int REQUEST_CODE = 1;

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
                if(!(name.getText().toString().isEmpty() && username.getText().toString().isEmpty()
                        && email.getText().toString().isEmpty() && weight.getText().toString().isEmpty() && height.getText().toString().isEmpty() &&
                password.getText().toString().isEmpty() && confirmPassword.getText().toString().isEmpty())){
                    if(password.getText().toString().equals(confirmPassword.getText().toString())) {
                        String userName = username.getText().toString();
                        String pass = password.getText().toString();
                        try {
                            p = new Profile(userName,pass);
                        } catch (InvalidUsernameException e) {

                        } catch (UnsecurePasswordException e) {

                        }
                        Manager.getInstance().registerUser(p.getUsername(), p.getPassword());
                        Intent goToProfile = new Intent(CreateProfile.this, LogIn.class);
                        goToProfile.putExtra("Profile" , (Serializable) p);
                        startActivityForResult(goToProfile,REQUEST_CODE);
                    }
                    else{
                        confirmPassword.setError("Passwords don't match!");
                        return;
                    }
                }

                else{
                    Toast.makeText(CreateProfile.this, "You have empty fields!", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
}
