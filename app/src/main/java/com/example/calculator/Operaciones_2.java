package com.example.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class Operaciones_2 extends AppCompatActivity {

    EditText N3;

    Button Facto,Back ;

    static TextView resul;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_operaciones2);

        N3=findViewById(R.id.N3);
        Facto= findViewById(R.id.Fac);
        Back=findViewById(R.id.back);
        resul=findViewById(R.id.RST);

        Back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Operaciones_2.this,MainActivity.class);
                startActivity(intent);
            }
        });

        Facto.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String numero3Str = N3.getText().toString();
                calcular("FT", numero3Str);

            }
        });



    }


    public static int factorial(int n) {
        if (n == 0) {
            return 1;
        } else {
            return n * factorial(n - 1);
        }
    }



    public static void calcular(String operador, String numero1Str) {
        if (!numero1Str.isEmpty()) {
            int numero1 = Integer.parseInt(numero1Str);
            long resultadoCalculado = 0;

            switch (operador) {
                case "FT":
                    if (numero1 > 0){
                        resultadoCalculado = factorial(numero1);
                    }
                    else{
                        resul.setText("Error, numero debe ser mayor a cero");
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