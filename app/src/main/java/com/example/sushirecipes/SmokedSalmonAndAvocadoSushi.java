package com.example.sushirecipes;

import android.os.Bundle;
import android.text.method.ScrollingMovementMethod;
import android.view.View;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;


public class SmokedSalmonAndAvocadoSushi extends AppCompatActivity {


    @Override
    public void onCreate ( Bundle savedInstanceState) {
        super.onCreate(savedInstanceState );
        setContentView(R.layout.smoked_salmon_and_avocado_sushi);

        setTitle("Smoked salmon and avocado sushi");
    }


    public void buttonForSushi1 (View view) {
        ((TextView)findViewById(R.id.textForIngridients)).setMovementMethod(new ScrollingMovementMethod());
    }
}
