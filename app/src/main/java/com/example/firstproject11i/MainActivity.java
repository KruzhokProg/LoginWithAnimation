package com.example.firstproject11i;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    EditText etEmail, etPassword;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        etEmail = findViewById(R.id.etEmail);
        etPassword = findViewById(R.id.etPassword);

    }

    public void btn_check_user(View view) {
        String password = etPassword.getText().toString();
        String email = etEmail.getText().toString();

        if(password.equals("admin") && email.equals("admin")){
            Toast.makeText(this, "Вы вошли!", Toast.LENGTH_SHORT).show();
            Intent i = new Intent(this, AdminActivity.class);
            startActivity(i);
        }
        else{
            Toast.makeText(this, "Данные некорректны!", Toast.LENGTH_SHORT).show();
        }
    }
}
