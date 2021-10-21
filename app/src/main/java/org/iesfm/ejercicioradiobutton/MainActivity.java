package org.iesfm.ejercicioradiobutton;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

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
        setText();
    }

    public void inicializarVariables() {

        contadorWin = 0;
        contadorAndroid = 0;
        contadorLinux = 0;
        contadorIos = 0;
        votacion = (TextView) findViewById(R.id.tvVotacion);
    }


    public void setText() {

        StringBuilder resultadoVotacion = new StringBuilder().append("Resultado de la votracion:\n")
                .append("Windows: ").append(contadorWin).append(" votos.").append("\n")
                .append("Android: ").append(contadorAndroid).append(" votos.").append("\n")
                .append("Linux: ").append(contadorLinux).append(" votos.").append("\n")
                .append("IOS: ").append(contadorIos).append(" votos.");

        votacion.setText(resultadoVotacion);
    }

    public void votar(View v) {

        setText();
        RadioGroup rgSistemasOperatios = (RadioGroup) findViewById(R.id.rgSistemasOperativos);

        switch (rgSistemasOperatios.getCheckedRadioButtonId()) {
            case R.id.rbWin:
                contadorWin++;
                Toast.makeText(this, "Ha votado por Windows", Toast.LENGTH_SHORT).show();
                break;
            case R.id.rbAndroid:
                contadorAndroid++;
                Toast.makeText(this, "Ha votado por Android", Toast.LENGTH_SHORT).show();
                break;
            case R.id.rbLinux:
                contadorLinux++;
                Toast.makeText(this, "Ha votado por Linux", Toast.LENGTH_SHORT).show();
                break;
            case R.id.rbIos:
                contadorIos++;
                Toast.makeText(this, "Ha votado por IOS", Toast.LENGTH_SHORT).show();
                break;
        }
        setText();
    }
}