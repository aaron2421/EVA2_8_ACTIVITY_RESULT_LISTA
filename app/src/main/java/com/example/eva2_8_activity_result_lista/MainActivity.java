package com.example.eva2_8_activity_result_lista;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Layout;
import android.view.View;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity {

    Clima[] Ciudades = {
            new Clima(),
            new Clima(R.drawable.sunny, "Camargo", 25, "Apenas pa un 12"),
            new Clima(R.drawable.rainy, "Delicias", 18, "2 Triquis"),
            new Clima(R.drawable.atmospher, "Parrar", 14, "Normal"),
            new Clima(R.drawable.cloudy, "Chihuahua", 21, "likea (hell)"),
            new Clima(R.drawable.tornado, "Juarez", 23, "se pronostican lluvias de balas"),
    };

    ListView listaClima;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        listaClima = findViewById(R.id.listaClima);
        listaClima.setAdapter(new ClimaAdapter(this, R.layout.layout_clima, Ciudades));
        listaClima.setOnItemClickListener(this);
    }

    public void onClickR(View v){

    }

    public void onClickC(View v){

    }
}
