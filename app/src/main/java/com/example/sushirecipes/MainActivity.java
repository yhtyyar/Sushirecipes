package com.example.sushirecipes;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.animation.TranslateAnimation;
import android.widget.Button;

import java.util.ArrayList;
import java.util.logging.Handler;
import java.util.logging.LogRecord;

public class MainActivity extends AppCompatActivity {


    private RecyclerView recyclerView;
    private RecyclerView.Adapter adapter;
    private RecyclerView.LayoutManager layoutManager;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        ArrayList<RecyclerViewItem> recyclerViewItems = new ArrayList<>();
        recyclerViewItems.add(new RecyclerViewItem(R.drawable.recipe_image_1_90,
                "Smoked salmon and avocado sushi  ",
                "Fancy making sushi at home? This simple recipe makes " +
                "32 healthy little bites, ideal for lunch or served as canapés",
                "Salmon and cucumber sushi rolls",
                "Follow our simple step-by-step guide to rolling your own,"+
                        " low-fat and healthy Japanese sushi " ));


        recyclerView = findViewById(R.id.recyclerView);
        recyclerView.setHasFixedSize(true);
        adapter = new RecyclerViewAdapter(recyclerViewItems);
        layoutManager = new LinearLayoutManager(this);

        recyclerView.setAdapter(adapter);
        recyclerView.setLayoutManager(layoutManager);


    }




    public void buttonforSushi(View view) {

        startActivity(new Intent(this, SmokedSalmonAndAvocadoSushi.class));
    }

    public void buttonforSushi2(View view) {

        startActivity(new Intent(this, SalmonAndCucumberSushiRolls.class));
    }
}

