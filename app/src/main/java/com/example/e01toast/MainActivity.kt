package com.example.e01toast

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.google.android.material.textfield.TextInputLayout

class MainActivity : AppCompatActivity() {

    private lateinit var btnToast: Button
    private lateinit var btnToast2: Button
    private lateinit var txtMsg: EditText
    private lateinit var btnFinish: Button


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btnToast = findViewById(R.id.btn_Toast)
        btnToast2 = findViewById(R.id.btn_Toast2)
        txtMsg = findViewById(R.id.edit_texto)
        btnFinish = findViewById(R.id.btnEncerrar)

        btnToast.setOnClickListener {
            Toast.makeText(this,"Toast Exibido com Sucesso",Toast.LENGTH_SHORT).show()
        }

        btnToast2.setOnClickListener {

            val mensagemTexto = txtMsg.text.toString()
            if ( mensagemTexto.isNotEmpty()){
                Toast.makeText(this,mensagemTexto,Toast.LENGTH_SHORT).show()

            } else {
                Toast.makeText(applicationContext, "Não foi digitado um texto", Toast.LENGTH_SHORT)
                    .show()
            }
        }

        btnFinish.setOnClickListener {
            finish()
        }
    }
}