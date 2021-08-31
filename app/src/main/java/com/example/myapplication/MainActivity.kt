package com.example.myapplication


import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.EditText


const val EXTRA_MESSAGE = "com.example.myapplication.MESSAGE"

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
//Siangui, essa daqui acho que só tem o somar, mas pode testar, ou criar outra, fica a vontade. blz
    /** Chamado quando o usuário apertar em enviar */
    fun sendMessage(view: View) {

        val editTextN1 = findViewById<EditText>(R.id.editTextN1)
        val editTextN2 = findViewById<EditText>(R.id.editTextN2)


        val n1 = editTextN1.text.toString() //Opção 1
        val n2: Int = editTextN2.text.toString().toInt()//Opção 2

        val calculo = Calculadora().somar(n1.toInt(), n2).toString()

        val intent = Intent(this, DisplayMessageActivity::class.java).apply {
            putExtra(EXTRA_MESSAGE, calculo)
        }
        startActivity(intent)
    }

    fun sendMessage2(view: View) {
        val editTextN1 = findViewById<EditText>(R.id.editTextN1)
        val editTextN2 = findViewById<EditText>(R.id.editTextN2)


        val n1 = editTextN1.text.toString()
        val n2: Int = editTextN2.text.toString().toInt()

        val multiplicar = Calculadora().multiplicar(n1.toInt(), n2).toString()

        val intent = Intent(this, DisplayMessageActivity::class.java).apply {
            putExtra(EXTRA_MESSAGE, multiplicar)

        }
        startActivity(intent)
    }
    fun sendMessage3(view: View) {
        val editTextN1 = findViewById<EditText>(R.id.editTextN1)
        val editTextN2 = findViewById<EditText>(R.id.editTextN2)


        val n1 = editTextN1.text.toString()
        val n2: Int = editTextN2.text.toString().toInt()

        val divisao = Calculadora().divisao(n1.toInt(), n2).toString()

        val intent = Intent(this, DisplayMessageActivity::class.java).apply {
            putExtra(EXTRA_MESSAGE, divisao)

        }
        startActivity(intent)
    }
    fun sendMessage4(view: View) {
        val editTextN1 = findViewById<EditText>(R.id.editTextN1)
        val editTextN2 = findViewById<EditText>(R.id.editTextN2)


        val n1 = editTextN1.text.toString()
        val n2: Int = editTextN2.text.toString().toInt()

        val subtrair = Calculadora().subtrair(n1.toInt(), n2).toString()

        val intent = Intent(this, DisplayMessageActivity::class.java).apply {
            putExtra(EXTRA_MESSAGE, subtrair)

        }
        startActivity(intent)
    }


}