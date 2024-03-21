package com.example.calculator

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import com.example.calculator.MainActivity

class V3 : AppCompatActivity() {
    var N3: EditText? = null
    var Fibo: Button? = null
    var Back: Button? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_v3)
        N3 = findViewById(R.id.N4)
        Fibo = findViewById(R.id.Fib)
        Back = findViewById(R.id.back2)
        resul = findViewById(R.id.RST2)
        Back?.setOnClickListener(View.OnClickListener {
            val intent = Intent(this@V3, MainActivity::class.java)
            startActivity(intent)
        })
        Fibo?.setOnClickListener(View.OnClickListener {
            val numero3Str = N3?.getText().toString()
            calcular("FB", numero3Str)
        })
    }

    companion object {
        var resul: TextView? = null
        fun calcularFibonacci(n: Int): Long {
            return if (n > -1 && n <= 1) {
                n.toLong()
            } else {
                calcularFibonacci(n - 1) + calcularFibonacci(
                    n - 2
                )
            }
        }

        fun calcular(operador: String?, numero1Str: String) {
            if (!numero1Str.isEmpty()) {
                val numero1 = numero1Str.toInt()
                var resultadoCalculado: Long = 0
                when (operador) {
                    "FB" -> if (numero1 >= 0) {
                        resultadoCalculado = calcularFibonacci(numero1)
                    } else {
                        resul!!.text = "Error, numero debe ser mayor o igual a cero"
                        return
                    }
                }
                resul!!.text = "Resultado: $resultadoCalculado"
            } else {
                resul!!.text =
                    "Por favor, ingresa números en todos los campos."
            }
        }
    }
}
