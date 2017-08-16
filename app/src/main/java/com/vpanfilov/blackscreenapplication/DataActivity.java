package com.vpanfilov.blackscreenapplication;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.FragmentActivity;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;

/**
 * Created by Vladislav on 15.05.2017.
 */
public class DataActivity extends Activity {


    Button mayskayaButton;
    Button dekabristovButton;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_data);

        mayskayaButton = (Button) findViewById(R.id.mayskayaButton);
        dekabristovButton = (Button) findViewById(R.id.dekabristovButton);
    }

    public void onMayskayaClick(View view) {
       Toast toast =  Toast.makeText(getApplicationContext(),"Маркеры добавлены",Toast.LENGTH_SHORT);
        toast.show();
    }

    public void onDekabristovClick(View view) {
    }
}
