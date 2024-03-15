package com.example.calculator;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    EditText n1;
    EditText n2;
    Button suma, resta, multi, div, potencia, MOP,MOP2;
    static TextView resultado;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        n1 = findViewById(R.id.n1);
        n2 = findViewById(R.id.n2);
        suma = findViewById(R.id.Suma);
        resta = findViewById(R.id.Resta);
        multi = findViewById(R.id.Multi);
        div = findViewById(R.id.Div);
        potencia = findViewById(R.id.Potencia);
        MOP=findViewById(R.id.MOP);
        MOP2=findViewById(R.id.MOP2);
        resultado = findViewById(R.id.Resultado);

        MOP.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, Operaciones_2.class);
                startActivity(intent);
            }
        });

        MOP2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, V3.class);
                startActivity(intent);
            }
        });


        suma.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String numero1Str = n1.getText().toString();
                String numero2Str = n2.getText().toString();
                calcular("+", numero1Str, numero2Str);
            }
        });

        resta.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String numero1Str = n1.getText().toString();
                String numero2Str = n2.getText().toString();
                calcular("-", numero1Str, numero2Str);
            }
        });

        multi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String numero1Str = n1.getText().toString();
                String numero2Str = n2.getText().toString();
                calcular("*", numero1Str, numero2Str);
            }
        });

        div.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String numero1Str = n1.getText().toString();
                String numero2Str = n2.getText().toString();
                calcular("/", numero1Str, numero2Str);
            }
        });

        potencia.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String numero1Str = n1.getText().toString();
                String numero2Str = n2.getText().toString();
                calcular("^", numero1Str, numero2Str);
            }
        });
    }

    public static int calcularPotencia(int base, int exponente) {
        if (exponente == 0) {
            return 1;
        } else {
            return base * calcularPotencia(base, exponente - 1);
        }
    }

    public static double calcularsuma(double nu1, double nu2) {
        return (nu1+nu2);
    }

    public static double calcularresta(double nu1, double nu2) {
        return (nu1-nu2);
    }

    public static double calcularmulti(double nu1, double nu2) {
        return (nu1*nu2);
    }

    public static double calculardiv(double nu1, double nu2) {
        return (nu1/nu2);
    }

    public static void calcular(String operador, String numero1Str, String numero2Str) {
        if (!numero1Str.isEmpty() && !numero2Str.isEmpty()) {
            double numero1 = Double.parseDouble(numero1Str);
            double numero2 = Double.parseDouble(numero2Str);
            double resultadoCalculado = 0;

            switch (operador) {
                case "+":
                    resultadoCalculado = calcularsuma(numero1, numero2);
                    break;
                case "-":
                    resultadoCalculado = calcularresta(numero1 , numero2);
                    break;
                case "*":
                    resultadoCalculado = calcularmulti(numero1 , numero2);
                    break;
                case "^":
                    int numerob = Integer.parseInt(numero1Str);
                    int numeroe = Integer.parseInt(numero2Str);
                    resultadoCalculado = calcularPotencia(numerob, numeroe);
                    break;
                case "/":
                    if (numero2 != 0) {
                        resultadoCalculado =calculardiv(numero1 , numero2);
                    } else {
                        resultado.setText("División por cero no posible");
                        return;
                    }
                    break;
                // Agrega más casos según las operaciones que desees admitir
                default:
                    resultado.setText("Operador no válido");
                    return;
            }

            resultado.setText("Resultado: " + resultadoCalculado);
        } else {
            resultado.setText("Por favor, ingresa números en todos los campos.");
        }
    }
}




