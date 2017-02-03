package com.oscar.mycalculadora;

import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;



public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private double resultado;
    private String concatenado ="";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        resultado = 0.0;
        findViewById(R.id.cero).setOnClickListener(this);
        findViewById(R.id.numero_1).setOnClickListener(this);
        findViewById(R.id.numero_2).setOnClickListener(this);
        findViewById(R.id.numero_3).setOnClickListener(this);
        findViewById(R.id.numero_4).setOnClickListener(this);
        findViewById(R.id.numero_5).setOnClickListener(this);
        findViewById(R.id.numero_6).setOnClickListener(this);
        findViewById(R.id.numero_7).setOnClickListener(this);
        findViewById(R.id.numero_8).setOnClickListener(this);
        findViewById(R.id.numero_9).setOnClickListener(this);
        findViewById(R.id.cero).setOnClickListener(this);
        findViewById(R.id.signo_igual).setOnClickListener(this);
        findViewById(R.id.signo_mas).setOnClickListener(this);
        findViewById(R.id.signo_menos).setOnClickListener(this);
        findViewById(R.id.signo_por).setOnClickListener(this);
        findViewById(R.id.punto).setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {

        switch (v.getId()) {
            case R.id.numero_1:
                concatenar("1");
                break;
            case R.id.numero_2:
                concatenar("2");
                break;
            case R.id.numero_3:
                concatenar("3");
                break;
            case R.id.numero_4:
                concatenar("4");
                break;
            case R.id.numero_5:
                concatenar("5");
                break;
            case R.id.numero_6:
                concatenar("6");
                break;
            case R.id.numero_7:
                concatenar("7");
                break;
            case R.id.numero_8:
                concatenar("8");
                break;
            case R.id.numero_9:
                concatenar("9");
                break;
        }

    }

    private void concatenar(String numero) {

        TextView resultado = (TextView) findViewById(R.id.txtRes);

        concatenado = concatenado + numero;
        resultado.setText(concatenado);
    }

}
