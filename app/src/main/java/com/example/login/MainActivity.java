package com.example.login;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    private EditText RollNumber;
    private EditText Password;
    private Button Login;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        RollNumber = (EditText)findViewById(R.id.etRollNumber);
        Password = (EditText)findViewById(R.id.etPassword);
        Login = (Button)findViewById(R.id.btnLogin);


        Login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                validate(RollNumber.getText().toString(),Password.getText().toString());

            }
        });
    }


    private void validate(String userRollNumber, String userPassword){
        if ((userRollNumber.equals("admin"))&& (userPassword .equals("1234") )){
            Intent intent = new Intent(MainActivity.this,SecondActivity.class);
            startActivity(intent);
        }
    }
}
