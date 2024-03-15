package com.example.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class V3 extends AppCompatActivity {

    EditText N3;

    Button Fibo,Back ;

    static TextView resul;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_v3);

        N3=findViewById(R.id.N4);
        Fibo= findViewById(R.id.Fib);
        Back=findViewById(R.id.back2);
        resul=findViewById(R.id.RST2);

        Back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(V3.this,MainActivity.class);
                startActivity(intent);
            }
        });

        Fibo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String numero3Str = N3.getText().toString();
                calcular("FB", numero3Str);
            }
        });


    }

    public static long calcularFibonacci(int n){

        if ( n>-1 && n <= 1) {
            return n;
        } else {
            return calcularFibonacci(n - 1) + calcularFibonacci(n - 2);
        }
    }

    public static void calcular(String operador, String numero1Str) {
        if (!numero1Str.isEmpty()) {
            int numero1 = Integer.parseInt(numero1Str);
            long resultadoCalculado = 0;

            switch (operador) {
                case "FB":
                    if (numero1 >= 0){
                        resultadoCalculado = calcularFibonacci(numero1);
                    }
                    else{
                        resul.setText("Error, numero debe ser mayor o igual a cero");
                        return;

                    }
                    break;
            }

            resul.setText("Resultado: " + resultadoCalculado);
        } else {
            resul.setText("Por favor, ingresa números en todos los campos.");
        }
    }
}
