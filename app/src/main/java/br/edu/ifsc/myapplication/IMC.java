package br.edu.ifsc.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

import java.text.DecimalFormat;

public class IMC extends AppCompatActivity {

    private double imc;
    private double imcCalculado;
    private double peso;
    private double altura;
    private ImageView imagem;


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

        ImageView imagem = (ImageView) findViewById(R.id.imageView);
        imagem.setImageResource(R.drawable.perfil);

        Button button = (Button) findViewById(R.id.button);
        imcCalculado = calculaImc(altura, peso);

        if (imcCalculado < 18.5) {
            imagem.setImageResource(R.drawable.abaixopeso);
            }
            else if (imcCalculado > 18.6 && imcCalculado < 24.9){

            imagem.setImageResource(R.drawable.normal);

            }
            else if (imcCalculado > 25 && imcCalculado < 29.9){

                imagem.setImageResource(R.drawable.sobrepeso);

            }
            else if (imcCalculado > 30 && imcCalculado < 34.9){

            imagem.setImageResource(R.drawable.obesidade1);

            }
            else if (imcCalculado > 35 && imcCalculado < 39.9){

            imagem.setImageResource(R.drawable.obesidade2);

            }
            else if (imcCalculado > 40){

            imagem.setImageResource(R.drawable.obesidade3);
        }

        DecimalFormat f = new DecimalFormat("#.##");
        TextView text = (TextView) findViewById(R.id.imc);
        text.setText(f.format(imcCalculado));

        }

        private Double calculaImc(double altura, double peso) {

        imc = peso/(altura*altura);

        //TextView text = (TextView) findViewById(R.id.imc);
        //text.setText(Double.toString(imc));

        return imc;


        }


}
