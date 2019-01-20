package com.karkaminski.airport;

import android.content.Context;
import android.content.Intent;
import android.support.constraint.ConstraintLayout;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebView;
import android.widget.Button;

public class AirportMainActivity extends AppCompatActivity {

    ConstraintLayout btnDeparturesCL;
    ConstraintLayout btnArrivalsCL;
    ConstraintLayout btnTransportCL;
    WebView weatherWebView;

    //TODO: Prezentacja pogody w Balicach
    //TODO: Zaktualizować klucz do OpenWeatherMap!
    //TODO: sensowne zachowanie po obróceniu telefonu.
    //TODO: Działanie na różnych ekranach
    //TODO: Zmiana tytułu Action Bar w zaleznosci od Activity
    //TODO: Zrobić dynamicze pobieranie danych JSON z http
    //TODO: Zaimplementować działanie przycisku Refresh
    //TODO: co ma się dziać po kliknięciu danego lotu?
    //TODO: jakie jeszcze funkcje może mieć aplikacja? Wkazywanie na mapie lokalizacji lotniska. Pogoda na lotnisku. Informacje o transporcie - żywcem wyjęte z oficjalnej aplikacji - naucze sie formatować duze teksty

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_airport_main);

        btnDeparturesCL = (ConstraintLayout) findViewById(R.id.departures_button_view);
        btnArrivalsCL = (ConstraintLayout) findViewById(R.id.arrivals_button_view);
        btnTransportCL = (ConstraintLayout) findViewById(R.id.transport_button_view);
        weatherWebView = (WebView) findViewById(R.id.weather_web_view);
        weatherWebView.loadUrl("http://api.openweathermap.org/data/2.5/weather?lat=50.1&lon=19.8&mode=html&appid=4526d487f12ef78b82b7a7d113faea64");

        btnDeparturesCL.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getBaseContext(), DeparturesActivity.class);
                startActivity(intent);
            }
        });

        btnArrivalsCL.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getBaseContext(), ArrivalsActivity.class);
                startActivity(intent);
            }
        });

        btnTransportCL.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getBaseContext(), TransportActivity.class);
                startActivity(intent);
            }
        });


    }
}
