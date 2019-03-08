package br.edu.ifsc.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import java.text.DecimalFormat;

public class IMC extends AppCompatActivity {

    private double imc;
    private double peso;
    private double altura;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_imc);

    }

        public void imc (View view) {

        EditText editTextAltura = (EditText) findViewById(R.id.editTextAltura);
        altura = Double.parseDouble(editTextAltura.getText().toString());

        EditText editTextPeso = (EditText)findViewById(R.id.editTextPeso);
        peso = Double.parseDouble(editTextPeso.getText().toString());


        Button button = (Button) findViewById(R.id.button);
        calculaImc(altura, peso);


        }

        private Double calculaImc(double altura, double peso) {

        imc = peso/(altura*altura);
        DecimalFormat f = new DecimalFormat("#.##");

        TextView text = (TextView) findViewById(R.id.imc);
        text.setText(Double.toString(imc));

        return Double.parseDouble(f.format(imc));


        }


}
