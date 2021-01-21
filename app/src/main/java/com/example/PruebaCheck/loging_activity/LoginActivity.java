package com.example.PruebaCheck.loging_activity;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.example.PruebaCheck.R;
import com.example.PruebaCheck.databinding.ActivityLoginBinding;
import com.example.PruebaCheck.second_activity.SecondActivity;

public class LoginActivity extends AppCompatActivity {
    private ActivityLoginBinding binding;
    private final String password = "123Pass";
    private String passScreen;
    private int countPass = 0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        binding = ActivityLoginBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        binding.btnIn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                checkPassword(password);
            }
        });
    }
    private void makeIntent(){
        Intent intent1 = new Intent(this, SecondActivity.class);
        startActivity(intent1);
    }
    private void checkPassword(String password){
        passScreen = binding.textPassword.getText().toString();
        if (passScreen.equals(password)&&countPass<3){
            makeIntent();
        }else {
            countPass += 1;
            Toast.makeText(this, "Contraseña incorrecta, intento "+countPass, Toast.LENGTH_SHORT).show();
        }
        if (countPass>=3){
            binding.btnIn.setBackgroundColor(Color.parseColor("#676666"));
            Toast.makeText(this, "Reinicie App para volver a intentarlo", Toast.LENGTH_LONG).show();
        }
    }
}