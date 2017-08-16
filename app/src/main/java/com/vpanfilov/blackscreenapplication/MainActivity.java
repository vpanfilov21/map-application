package com.vpanfilov.blackscreenapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button exitButton;
    Button mapButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        exitButton = (Button) findViewById(R.id.exitButton);
        mapButton = (Button) findViewById(R.id.mapButton);
    }

    public void onExitClick(View view) {
       this.finish();
    }

    public void onMapClick(View view) {
        Intent intent = new Intent(MainActivity.this, MapsActivity.class);
        startActivity(intent);
    }

    public void onDBClick(View view) {
        Intent dbIntent = new Intent(MainActivity.this, DataActivity.class);
        startActivity(dbIntent);
    }
}
