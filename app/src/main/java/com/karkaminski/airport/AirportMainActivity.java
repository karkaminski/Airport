package com.karkaminski.airport;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class AirportMainActivity extends AppCompatActivity {

    Button btnDepartures;
    Button btnArrivals;

    //TODO: Główne aktivity ma składać się z dwóch duzych przycisków zrobionych z jakiegoś view, z grafikami lądującego i startującego samolotu
    //TODO: Przerobić DeparturesActivity i ArrivalsActivity na Fragments
    //TODO: Dodać do DeparturesActivity i ArrivalsActivity menu pod którycm będzie Refresh
    //TODO: Zrobić dynamicze pobieranie danych JSON z http
    //TODO: jakie jeszcze funkcje może mieć aplikacja? Wkazywanie na mapie lokalizacji lotniska. Pogoda na lotnisku. Informacje o transporcie - żywcem wyjęte z oficjalnej aplikacji - naucze sie formatować duze teksty

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_airport_main);

        btnDepartures = (Button) findViewById(R.id.departures_button);
        btnArrivals = (Button) findViewById(R.id.arrivals_button);

        btnDepartures.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getBaseContext(), DeparturesActivity.class);
                startActivity(intent);
            }
        });

        btnArrivals.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getBaseContext(), ArrivalsActivity.class);
                startActivity(intent);
            }
        });
    }
}
