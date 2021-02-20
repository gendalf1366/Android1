package ru.geekbrains.lesson1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Обработчик события перехода на другой Activity
        Button button = findViewById(R.id.button);
        button.setOnClickListener(view -> openTwoActivity());
    }

    public void openTwoActivity(){
        Intent intent = new Intent(this, TwoActivity.class);
        startActivity(intent);
    }
}