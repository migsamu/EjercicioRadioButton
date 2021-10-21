package org.iesfm.ejercicioradiobutton;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private int contadorWin;
    private int contadorAndroid;
    private int contadorLinux;
    private int contadorIos;
    private TextView votacion;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        inicializarVariables();
    }

    public void inicializarVariables() {

        contadorWin = 0;
        contadorAndroid = 0;
        contadorLinux = 0;
        contadorIos = 0;
        votacion = (TextView) findViewById(R.id.tvVotacion);
    }

    public void votar(View v) {
        RadioGroup rgSistemasOperatios = (RadioGroup) findViewById(R.id.rgSistemasOperativos);

        switch (rgSistemasOperatios.getCheckedRadioButtonId()) {
            case R.id.rbWin:
                contadorWin++;
                break;
            case R.id.rbAndroid:
                contadorAndroid++;
                break;
            case R.id.rbLinux:
                contadorLinux++;
                break;
            case R.id.rbIos:
                contadorIos++;
                break;
        }

    }
}