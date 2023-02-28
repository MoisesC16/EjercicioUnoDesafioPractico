package com.example.ejerciciounodesafiopractico

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val calcular = findViewById<Button>(R.id.btn_cal)

        calcular.setOnClickListener { realizarCalculo() }
    }

    private fun realizarCalculo() {

        val notaUno = findViewById<EditText>(R.id.n1)
        val notaDos = findViewById<EditText>(R.id.n2)
        val notaTres = findViewById<EditText>(R.id.n3)
        val notaCuatro = findViewById<EditText>(R.id.n4)
        val notaCinco = findViewById<EditText>(R.id.n5)

        val notaU:Double=notaUno.text.toString().toDouble()
        val notaD:Double=notaDos.text.toString().toDouble()
        val notaT:Double=notaTres.text.toString().toDouble()
        val notaC:Double=notaCuatro.text.toString().toDouble()
        val notaCi:Double=notaCinco.text.toString().toDouble()

        val resultado = findViewById<TextView>(R.id.res)

        var prom:Double=(notaU+notaD+notaT+notaC+notaCi)/5

        var result=""

        if(prom>=6){
            result="APROBO con una nota de $prom"
        }
        else{
            result="REPROBO con una nota de $prom"
        }

        resultado.text="El alumno $result"

    }
}