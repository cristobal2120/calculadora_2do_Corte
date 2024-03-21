package com.example.calculator

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    var n1: EditText? = null
    var n2: EditText? = null
    var suma: Button? = null
    var resta: Button? = null
    var multi: Button? = null
    var div: Button? = null
    var potencia: Button? = null
    var MOP: Button? = null
    var MOP2: Button? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        n1 = findViewById(R.id.n1)
        n2 = findViewById(R.id.n2)
        suma = findViewById(R.id.Suma)
        resta = findViewById(R.id.Resta)
        multi = findViewById(R.id.Multi)
        div = findViewById(R.id.Div)
        potencia = findViewById(R.id.Potencia)
        MOP = findViewById(R.id.MOP)
        MOP2 = findViewById(R.id.MOP2)
        resultado = findViewById(R.id.Resultado)
        MOP?.setOnClickListener(View.OnClickListener {
            val intent = Intent(this@MainActivity, Operaciones_2::class.java)
            startActivity(intent)
        })
        MOP2?.setOnClickListener(View.OnClickListener {
            val intent = Intent(this@MainActivity, V3::class.java)
            startActivity(intent)
        })
        suma?.setOnClickListener(View.OnClickListener {
            val numero1Str = n1?.getText().toString()
            val numero2Str = n2?.getText().toString()
            calcular("+", numero1Str, numero2Str)
        })
        resta?.setOnClickListener(View.OnClickListener {
            val numero1Str = n1?.getText().toString()
            val numero2Str = n2?.getText().toString()
            calcular("-", numero1Str, numero2Str)
        })
        multi?.setOnClickListener(View.OnClickListener {
            val numero1Str = n1?.getText().toString()
            val numero2Str = n2?.getText().toString()
            calcular("*", numero1Str, numero2Str)
        })
        div?.setOnClickListener(View.OnClickListener {
            val numero1Str = n1?.getText().toString()
            val numero2Str = n2?.getText().toString()
            calcular("/", numero1Str, numero2Str)
        })
        potencia?.setOnClickListener(View.OnClickListener {
            val numero1Str = n1?.getText().toString()
            val numero2Str = n2?.getText().toString()
            calcular("^", numero1Str, numero2Str)
        })
    }

    companion object {
        var resultado: TextView? = null
        @JvmStatic
        fun calcularPotencia(base: Int, exponente: Int): Int {
            return if (exponente == 0) {
                1
            } else {
                base * calcularPotencia(base, exponente - 1)
            }
        }

        @JvmStatic
        fun calcularsuma(nu1: Double, nu2: Double): Double {
            return nu1 + nu2
        }

        @JvmStatic
        fun calcularresta(nu1: Double, nu2: Double): Double {
            return nu1 - nu2
        }

        @JvmStatic
        fun calcularmulti(nu1: Double, nu2: Double): Double {
            return nu1 * nu2
        }

        @JvmStatic
        fun calculardiv(nu1: Double, nu2: Double): Double {
            return nu1 / nu2
        }

        fun calcular(operador: String?, numero1Str: String, numero2Str: String) {
            if (!numero1Str.isEmpty() && !numero2Str.isEmpty()) {
                val numero1 = numero1Str.toDouble()
                val numero2 = numero2Str.toDouble()
                var resultadoCalculado = 0.0
                when (operador) {
                    "+" -> resultadoCalculado = calcularsuma(numero1, numero2)
                    "-" -> resultadoCalculado = calcularresta(numero1, numero2)
                    "*" -> resultadoCalculado = calcularmulti(numero1, numero2)
                    "^" -> {
                        val numerob = numero1Str.toInt()
                        val numeroe = numero2Str.toInt()
                        resultadoCalculado = calcularPotencia(numerob, numeroe).toDouble()
                    }

                    "/" -> if (numero2 != 0.0) {
                        resultadoCalculado = calculardiv(numero1, numero2)
                    } else {
                        resultado!!.text = "División por cero no posible"
                        return
                    }

                    else -> {
                        resultado!!.text = "Operador no válido"
                        return
                    }
                }
                resultado!!.text = "Resultado: $resultadoCalculado"
            } else {
                resultado!!.text = "Por favor, ingresa números en todos los campos."
            }
        }
    }
}
