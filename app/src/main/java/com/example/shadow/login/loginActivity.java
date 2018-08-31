package com.example.shadow.login;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class loginActivity extends AppCompatActivity {

    EditText username;
    EditText password;
    Button signin;
    TextView wrong;
    String user = "sadegh";
    String pass = "123";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        username = findViewById(R.id.username);
        password = findViewById(R.id.password);
        signin = findViewById(R.id.signin);
        wrong = findViewById(R.id.wrong);


        signin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (username.getText().toString().equals(user) && password.getText().toString().equals(pass)) {
                    Intent login = new Intent(getApplicationContext(), SecActivity.class);
                    startActivity(login);
                } else {
                    wrong.setText("Invalid Login Information");
                }
            }
        });
    }
}
