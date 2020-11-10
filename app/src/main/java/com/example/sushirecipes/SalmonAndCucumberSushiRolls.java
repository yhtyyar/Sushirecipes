package com.example.sushirecipes;

import android.os.Bundle;
import android.text.method.ScrollingMovementMethod;
import android.view.View;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class SalmonAndCucumberSushiRolls extends AppCompatActivity {

    @Override
    public void onCreate ( Bundle savedInstanceState) {
        super.onCreate(savedInstanceState );
        setContentView(R.layout.salmon_and_cucumber_sushi_rolls);

        setTitle("Salmon and cucumber sushi rolls");

    }


    public void buttonforSushi2(View view) {
        ((TextView)findViewById(R.id.textForIngridients)).setMovementMethod(new ScrollingMovementMethod());
    }
}

