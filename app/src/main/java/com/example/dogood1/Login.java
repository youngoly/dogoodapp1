package com.example.dogood1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class Login extends AppCompatActivity implements View.OnClickListener {
    private Button ok;
    private Button zabil;
    private EditText name;
    private EditText password;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        name.setOnClickListener(this);
        name = findViewById(R.id.name);

        zabil.setOnClickListener(this);
        zabil=findViewById(R.id.zabil);

        password.setOnClickListener(this);
        password = findViewById(R.id.password);

        ok.setOnClickListener(this);
        ok = findViewById(R.id.ok);
    }

    @Override
    public void onClick(View v) {
            if(v.getId() == ok.getId()){
                Intent intent = new Intent(this, MainActivity.class);
                startActivity(intent);
            }

            if(v.getId() == zabil.getId()){
                Intent intent2 = new Intent(this, MainActivity.class);
                startActivity(intent2);
            }

    }
}
