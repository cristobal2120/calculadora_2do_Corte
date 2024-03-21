package com.example.calculator

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import com.example.calculator.MainActivity

class Operaciones_2 : AppCompatActivity() {
    var N3: EditText? = null
    var Facto: Button? = null
    var Back: Button? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_operaciones2)
        N3 = findViewById(R.id.N3)
        Facto = findViewById(R.id.Fac)
        Back = findViewById(R.id.back)
        resul = findViewById(R.id.RST)
        Back?.setOnClickListener(View.OnClickListener {
            val intent = Intent(this@Operaciones_2, MainActivity::class.java)
            startActivity(intent)
        })
        Facto?.setOnClickListener(View.OnClickListener {
            val numero3Str = N3?.getText().toString()
            calcular("FT", numero3Str)
        })
    }

    companion object {
        var resul: TextView? = null
        @JvmStatic
        fun factorial(n: Int): Int {
            return if (n == 0) {
                1
            } else {
                n * factorial(n - 1)
            }
        }

        fun calcular(operador: String?, numero1Str: String) {
            if (!numero1Str.isEmpty()) {
                val numero1 = numero1Str.toInt()
                var resultadoCalculado: Long = 0
                when (operador) {
                    "FT" -> if (numero1 > 0) {
                        resultadoCalculado = factorial(numero1).toLong()
                    } else {
                        resul!!.text = "Error, numero debe ser mayor a cero"
                        return
                    }
                }
                resul!!.text = "Resultado: $resultadoCalculado"
            } else {
                resul!!.text = "Por favor, ingresa números en todos los campos."
            }
        }
    }
}