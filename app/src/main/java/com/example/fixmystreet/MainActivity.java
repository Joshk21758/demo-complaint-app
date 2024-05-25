package com.example.fixmystreet;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    EditText username;
    EditText password;
    EditText submitProblem;
    Button loginButton;
    Button submitButton;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);


        username = findViewById(R.id.username_input);
        password = findViewById(R.id.password_input);
        loginButton = findViewById(R.id.login_btn);


        loginButton.setOnClickListener(v -> {
            if (username.getText().toString().equals("user") && password.getText().toString().equals("12345")){
                Toast.makeText(MainActivity.this, "Login Successful!", Toast.LENGTH_SHORT).show();
                setContentView(R.layout.report_problem_page);

            } else{
                Toast.makeText(MainActivity.this, "Login failed", Toast.LENGTH_SHORT).show();

            }
        });

        }


    public void thankyoupage(View view) {
        setContentView(R.layout.thankpage);

    }
}










