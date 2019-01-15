package com.karkaminski.airport;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

public class AirportMainActivity extends AppCompatActivity {

    Button btnDepartures;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_airport_main);

        btnDepartures = (Button) findViewById(R.id.departures_button);

        btnDepartures.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getBaseContext(), DepartureActivity.class);
                startActivity(intent);
            }
        });
    }
}
