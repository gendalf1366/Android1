package ru.geekbrains.lesson1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

public class TwoActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_two);

        Button button = findViewById(R.id.button2);
        button.setOnClickListener(view -> openOneActivity());
    }

    public void openOneActivity(){
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
    }
}